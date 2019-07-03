package com.cobresun.menus;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.cobresun.interfaces.Drawable;
import com.cobresun.main.Screen;
import com.cobresun.map.Map;
import com.cobresun.map.Road;
import com.cobresun.states.Defense;
import com.cobresun.towers.RiotPolice;
import com.cobresun.towers.Sniper;

import jrapl.EnergyCheckUtils;

public class SideMenu implements MouseListener, Drawable, MouseMotionListener {
	BufferedImage back;
	
	Button quit;
	Button start;
	Button sniper;
	Button riotPolice;
	Defense d;
	Map m;
	static long chrono = 0;
	double[] before = new double[3];
	boolean pTower;
	
	public SideMenu(Defense d, Map m) {
		start = new Button(760, Screen.HEIGHT - 200, Screen.WIDTH - 740 - 60, 100, "START");
		riotPolice = new Button(760, 100, Screen.WIDTH - 740 - 60, 100, "BUY POLICE");
		sniper = new Button(760, 220, Screen.WIDTH - 740 - 60, 100, "BUY SNIPER");
		quit = new Button(760, 340, Screen.WIDTH - 740 - 60, 100, "QUIT");
		this.d = d;
		this.m = m;
		
		try {
			back = ImageIO.read(new File("rsrc/menu.png"));
		} catch (IOException e) {
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent a) {
		int x = a.getX();
		int y = a.getY();

		if (x > 720) {

			if (start.buttonPressed(x, y) && !d.inRound()) {
				
				int kwa = EnergyCheckUtils.ProfileInit();
				before = EnergyCheckUtils.getEnergyStats();
				chrono = java.lang.System.currentTimeMillis() ; 				

				d.startRound();
				
				

			}
			if(quit.buttonPressed(x, y)) {
				long chrono2 = java.lang.System.currentTimeMillis() ;
				long temps = chrono2 - chrono ;
				System.out.println("Temps ecoule = " + temps + " ms") ;
				double[] after = EnergyCheckUtils.getEnergyStats();
				
				int socketNum = EnergyCheckUtils.GetSocketNum();
				for(int i = 0; i < socketNum; i++) {
					System.out.println("Power consumption of dram: " + (after[0] - before[0]) / 10.0 + " power consumption of cpu: " + (after[1] - before[1]) / 10.0 + " power consumption of package: " + (after[2] - before[2]) / 10.0);
				}
				EnergyCheckUtils.ProfileDealloc();
				
				d.getGame().close();
			}
			if (sniper.buttonPressed(x, y)){
				m.setPTower(new Sniper(x, y, 60));
				pTower = true;
			} else if (riotPolice.buttonPressed(x, y)) {
				m.setPTower(new RiotPolice(x, y, 60));
				pTower = true;
			}
		} else {
			if (pTower) {
				d.placeTower(x, y);
				pTower = false;
			} else {
				d.kill(x,y);
			}

		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		
		g.drawImage(back, 720, 0, 300, Screen.HEIGHT, null);
		g.setColor(Color.GREEN);

		start.draw(g);
		
		g.setColor(Color.RED);
		quit.draw(g);

		g.setColor(Color.WHITE);
		sniper.draw(g);
		g.drawString("Price: 100", 770, 310);

		g.setColor(Color.WHITE);
		riotPolice.draw(g);
		g.drawString("Price: 50", 770, 190);

	}

	@Override
	public void mouseDragged(MouseEvent a) {
		int x = a.getX();
		int y = a.getY();

		if (x > 720) {

			if (start.buttonPressed(x, y) && !d.inRound()) {
				d.startRound();
			}
			if (sniper.buttonPressed(x, y)){
				m.setPTower(new Sniper(x, y, 60));
				pTower = true;
			} else if (riotPolice.buttonPressed(x, y)) {
				m.setPTower(new RiotPolice(x, y, 60));
				pTower = true;
			}
		} else {
			if (pTower) {
				d.placeTower(x, y);
				pTower = false;
			} else {
				d.kill(x,y);
			}

		}
	}

	@Override
	public void mouseMoved(MouseEvent a) {
		if (pTower) {
			m.setPTowerPos(a.getX(), a.getY());
		}

	}




}
