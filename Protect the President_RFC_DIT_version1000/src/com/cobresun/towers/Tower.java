package com.cobresun.towers;

import java.awt.Graphics2D;

import com.cobresun.RFC_class.RFC_part1;
import com.cobresun.RFC_class.RFC_part2;
import com.cobresun.interfaces.Drawable;
import com.cobresun.states.Defense;

public abstract class Tower implements Drawable{
	private int x;
	private int y;
	private int i;
	private int j;
	private int cost;
	
	private int size;

	boolean placing;
	
	public Tower(int i, int j, int size, int cost) {
		this.i = i;
		this.j = j;
		
		this.size = size;
		this.cost = cost;
		
		x = i * size + 10;
		y = j * size + 10;
		
		placing = true;
	}
	
	public void draw(Graphics2D g) {
		g.fillRect(x, y, size - 20, size - 20);
	}
	
	public void setX(int x) {
		this.x = x * size + 10;
	}
	
	public void setY(int y) {
		this.y = y * size + 10;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract void update(Defense d);

	public int getJ() {
		return j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
		
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public boolean getPlacing() {
		return placing;
	}
	
	public void setPlacing(boolean b) {
		placing = b;
	}

	public static void RFC_incremente3() {
		// TODO Auto-generated method stub
		RFC_part2.RFC_incremente8();
		RFC_part1.RFC_incremente9();
		RFC_part2.RFC_incremente10();
		RFC_part1.RFC_incremente11();
	}

}
