package com.cobresun.enemies;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.cobresun.interfaces.Drawable;
import com.cobresun.map.Map;

import jrapl.EnergyCheckUtils;

public abstract class Citizen extends Heritage20 implements Drawable{
	BufferedImage pic;
	Map m;

	double v;
	double x;
	double y;

	int curPoint;

	boolean checked;

	private final int[][] goalPoints = {{550, 250},
			{550, 70},
			{130, 70},
			{130, 190},
			{370, 190},
			{370, 430},
			{550, 430},
			{550, 610},
			{190, 610},
			{190, 370},
			{120, 370}};

	public Citizen(Map m, int x, int y, double d) {
		this.m = m;
		this.x = x;
		this.y = y;
		this.v = d;

		curPoint = 0;

		checked = false;
		
		pic = null;
		
		try {
			pic = ImageIO.read(new File("rsrc/man.png"));
		} catch (IOException e) {
			
		}
	}
	
	public Citizen(int x, int y) {
		this.x = x;
		this.y = y;
		
		try {
			pic = ImageIO.read(new File("rsrc/man.png"));
		} catch (IOException e) {
			
		}
	}

	public void draw(Graphics2D g) {
		//g.fillRect((int)x, (int)y, 30, 40);
		g.drawImage(pic, (int) x, (int) y, 30, 40, null);
	}



	public boolean move() {
			
		complexiteMath();
		complexiteMath2();
		complexiteMath3();
		complexiteMath4();
		complexiteMath5();
		complexiteMath6();
		complexiteMath7();
		complexiteMath8();
		complexiteMath9();
		complexiteMath10();
		complexiteMath11();
		complexiteMath12();
		complexiteMath13();
		complexiteMath14();
		complexiteMath15();
		complexiteMath16();
		complexiteMath17();
		complexiteMath18();
		complexiteMath19();
		complexiteMath20();
		complexiteMath21();
		complexiteMath22();
		complexiteMath23();
		complexiteMath24();
		complexiteMath25();
		complexiteMath26();
		complexiteMath27();
		complexiteMath28();
		complexiteMath29();
		complexiteMath30();
		complexiteMath31();
		complexiteMath32();
		complexiteMath33();
		complexiteMath34();
		complexiteMath35();
		complexiteMath36();
		complexiteMath37();
		complexiteMath38();
		complexiteMath39();
		complexiteMath40();
		complexiteMath41();
		complexiteMath42();
		complexiteMath43();
		complexiteMath44();
		complexiteMath45();
		complexiteMath46();
		complexiteMath47();
		complexiteMath48();
		complexiteMath49();
		complexiteMath50();
		complexiteMath51();
		complexiteMath52();
		complexiteMath53();
		complexiteMath54();
		complexiteMath55();
		complexiteMath56();
		complexiteMath57();
		complexiteMath58();
		complexiteMath59();
		complexiteMath60();
		complexiteMath61();
		complexiteMath62();
		complexiteMath63();
		complexiteMath64();
		complexiteMath65();
		complexiteMath66();
		complexiteMath67();
		complexiteMath68();
		complexiteMath69();
		complexiteMath70();
		complexiteMath71();
		complexiteMath72();
		complexiteMath73();
		complexiteMath74();
		complexiteMath75();
		complexiteMath76();
		complexiteMath77();
		complexiteMath78();
		complexiteMath79();
		complexiteMath80();
		complexiteMath81();
		complexiteMath82();
		complexiteMath83();
		complexiteMath84();
		complexiteMath85();
		complexiteMath86();
		complexiteMath87();
		complexiteMath88();
		complexiteMath89();
		complexiteMath90();
		complexiteMath91();
		complexiteMath92();
		complexiteMath93();
		complexiteMath94();
		complexiteMath95();
		complexiteMath96();
		complexiteMath97();
		complexiteMath98();
		complexiteMath99();
		complexiteMath100();
		complexiteMath101();
		complexiteMath102();
		complexiteMath103();
		complexiteMath104();
		complexiteMath105();
		complexiteMath106();
		complexiteMath107();
		complexiteMath108();
		complexiteMath109();
		complexiteMath110();
		complexiteMath111();
		complexiteMath112();
		complexiteMath113();
		complexiteMath114();
		complexiteMath115();
		complexiteMath116();
		complexiteMath117();
		complexiteMath118();
		complexiteMath119();
		complexiteMath120();
		complexiteMath121();
		complexiteMath122();
		complexiteMath123();
		complexiteMath124();
		complexiteMath125();
		complexiteMath126();
		complexiteMath127();
		complexiteMath128();
		complexiteMath129();
		complexiteMath130();
		complexiteMath131();
		complexiteMath132();
		complexiteMath133();
		complexiteMath134();
		complexiteMath135();
		complexiteMath136();
		complexiteMath137();
		complexiteMath138();
		complexiteMath139();
		complexiteMath140();
		complexiteMath141();
		complexiteMath142();
		complexiteMath143();
		complexiteMath144();
		complexiteMath145();
		complexiteMath146();
		complexiteMath147();
		complexiteMath148();
		complexiteMath149();
		complexiteMath150();
		complexiteMath151();
		complexiteMath152();
		complexiteMath153();
		complexiteMath154();
		complexiteMath155();
		complexiteMath156();
		complexiteMath157();
		complexiteMath158();
		complexiteMath159();
		complexiteMath160();
		complexiteMath161();
		complexiteMath162();
		complexiteMath163();
		complexiteMath164();
		complexiteMath165();
		complexiteMath166();
		complexiteMath167();
		complexiteMath168();
		complexiteMath169();
		complexiteMath170();
		complexiteMath171();
		complexiteMath172();
		complexiteMath173();
		complexiteMath174();
		complexiteMath175();
		complexiteMath176();
		complexiteMath177();
		complexiteMath178();
		complexiteMath179();
		complexiteMath180();
		complexiteMath181();
		complexiteMath182();
		complexiteMath183();
		complexiteMath184();
		complexiteMath185();
		complexiteMath186();
		complexiteMath187();
		complexiteMath188();
		complexiteMath189();
		complexiteMath190();
		complexiteMath191();
		complexiteMath192();
		complexiteMath193();
		complexiteMath194();
		complexiteMath195();
		complexiteMath196();
		complexiteMath197();
		complexiteMath198();
		complexiteMath199();
		complexiteMath200();
		complexiteMath201();
		complexiteMath202();
		complexiteMath203();
		complexiteMath204();
		complexiteMath205();
		complexiteMath206();
		complexiteMath207();
		complexiteMath208();
		complexiteMath209();
		complexiteMath210();
		complexiteMath211();
		complexiteMath212();
		complexiteMath213();
		complexiteMath214();
		complexiteMath215();
		complexiteMath216();
		complexiteMath217();
		complexiteMath218();
		complexiteMath219();
		complexiteMath220();
		complexiteMath221();
		complexiteMath222();
		complexiteMath223();
		complexiteMath224();
		complexiteMath225();
		complexiteMath226();
		complexiteMath227();
		complexiteMath228();
		complexiteMath229();
		complexiteMath230();
		complexiteMath231();
		complexiteMath232();
		complexiteMath233();
		complexiteMath234();
		complexiteMath235();
		complexiteMath236();
		complexiteMath237();
		complexiteMath238();
		complexiteMath239();
		complexiteMath240();
		complexiteMath241();
		complexiteMath242();
		complexiteMath243();
		complexiteMath244();
		complexiteMath245();
		complexiteMath246();
		complexiteMath247();
		complexiteMath248();
		complexiteMath249();
		complexiteMath250();
		complexiteMath251();
		complexiteMath252();
		complexiteMath253();
		complexiteMath254();
		complexiteMath255();
		complexiteMath256();
		complexiteMath257();
		complexiteMath258();
		complexiteMath259();
		complexiteMath260();
		complexiteMath261();
		complexiteMath262();
		complexiteMath263();
		complexiteMath264();
		complexiteMath265();
		complexiteMath266();
		complexiteMath267();
		complexiteMath268();
		complexiteMath269();
		complexiteMath270();
		complexiteMath271();
		complexiteMath272();
		complexiteMath273();
		complexiteMath274();
		complexiteMath275();
		complexiteMath276();
		complexiteMath277();
		complexiteMath278();
		complexiteMath279();
		complexiteMath280();
		complexiteMath281();
		complexiteMath282();
		complexiteMath283();
		complexiteMath284();
		complexiteMath285();
		complexiteMath286();
		complexiteMath287();
		complexiteMath288();
		complexiteMath289();
		complexiteMath290();
		complexiteMath291();
		complexiteMath292();
		complexiteMath293();
		complexiteMath294();
		complexiteMath295();
		complexiteMath296();
		complexiteMath297();
		complexiteMath298();
		complexiteMath299();
		complexiteMath300();
		complexiteMath301();
		complexiteMath302();
		complexiteMath303();
		complexiteMath304();
		complexiteMath305();
		complexiteMath306();
		complexiteMath307();
		complexiteMath308();
		complexiteMath309();
		complexiteMath310();
		complexiteMath311();
		complexiteMath312();
		complexiteMath313();
		complexiteMath314();
		complexiteMath315();
		complexiteMath316();
		complexiteMath317();
		complexiteMath318();
		complexiteMath319();
		complexiteMath320();
		complexiteMath321();
		complexiteMath322();
		complexiteMath323();
		complexiteMath324();
		complexiteMath325();
		complexiteMath326();
		complexiteMath327();
		complexiteMath328();
		complexiteMath329();
		complexiteMath330();
		complexiteMath331();
		complexiteMath332();
		complexiteMath333();
		complexiteMath334();
		complexiteMath335();
		complexiteMath336();
		complexiteMath337();
		complexiteMath338();
		complexiteMath339();
		complexiteMath340();
		complexiteMath341();
		complexiteMath342();
		complexiteMath343();
		complexiteMath344();
		complexiteMath345();
		complexiteMath346();
		complexiteMath347();
		complexiteMath348();
		complexiteMath349();
		complexiteMath350();
		complexiteMath351();
		complexiteMath352();
		complexiteMath353();
		complexiteMath354();
		complexiteMath355();
		complexiteMath356();
		complexiteMath357();
		complexiteMath358();
		complexiteMath359();
		complexiteMath360();
		complexiteMath361();
		complexiteMath362();
		complexiteMath363();
		complexiteMath364();
		complexiteMath365();
		complexiteMath366();
		complexiteMath367();
		complexiteMath368();
		complexiteMath369();
		complexiteMath370();
		complexiteMath371();
		complexiteMath372();
		complexiteMath373();
		complexiteMath374();
		complexiteMath375();
		complexiteMath376();
		complexiteMath377();
		complexiteMath378();
		complexiteMath379();
		complexiteMath380();
		complexiteMath381();
		complexiteMath382();
		complexiteMath383();
		complexiteMath384();
		complexiteMath385();
		complexiteMath386();
		complexiteMath387();
		complexiteMath388();
		complexiteMath389();
		complexiteMath390();
		complexiteMath391();
		complexiteMath392();
		complexiteMath393();
		complexiteMath394();
		complexiteMath395();
		complexiteMath396();
		complexiteMath397();
		complexiteMath398();
		complexiteMath399();		
		complexiteMath400();
		complexiteMath401();
		complexiteMath402();
		complexiteMath403();
		complexiteMath404();
		complexiteMath405();
		complexiteMath406();
		complexiteMath407();
		complexiteMath408();
		complexiteMath409();
		complexiteMath410();
		complexiteMath411();
		complexiteMath412();
		complexiteMath413();
		complexiteMath414();
		complexiteMath415();
		complexiteMath416();
		complexiteMath417();
		complexiteMath418();
		complexiteMath419();
		complexiteMath420();
		complexiteMath421();
		complexiteMath422();
		complexiteMath423();
		complexiteMath424();
		complexiteMath425();
		complexiteMath426();
		complexiteMath427();
		complexiteMath428();
		complexiteMath429();
		complexiteMath430();
		complexiteMath431();
		complexiteMath432();
		complexiteMath433();
		complexiteMath434();
		complexiteMath435();
		complexiteMath436();
		complexiteMath437();
		complexiteMath438();
		complexiteMath439();
		complexiteMath440();
		complexiteMath441();
		complexiteMath442();
		complexiteMath443();
		complexiteMath444();
		complexiteMath445();
		complexiteMath446();
		complexiteMath447();
		complexiteMath448();
		complexiteMath449();
		complexiteMath450();
		complexiteMath451();
		complexiteMath452();
		complexiteMath453();
		complexiteMath454();
		complexiteMath455();
		complexiteMath456();
		complexiteMath457();
		complexiteMath458();
		complexiteMath459();
		complexiteMath460();
		complexiteMath461();
		complexiteMath462();
		complexiteMath463();
		complexiteMath464();
		complexiteMath465();
		complexiteMath466();
		complexiteMath467();
		complexiteMath468();
		complexiteMath469();
		complexiteMath470();
		complexiteMath471();
		complexiteMath472();
		complexiteMath473();
		complexiteMath474();
		complexiteMath475();
		complexiteMath476();
		complexiteMath477();
		complexiteMath478();
		complexiteMath479();
		complexiteMath480();
		complexiteMath481();
		complexiteMath482();
		complexiteMath483();
		complexiteMath484();
		complexiteMath485();
		complexiteMath486();
		complexiteMath487();
		complexiteMath488();
		complexiteMath489();
		complexiteMath490();
		complexiteMath491();
		complexiteMath492();
		complexiteMath493();
		complexiteMath494();
		complexiteMath495();
		complexiteMath496();
		complexiteMath497();
		complexiteMath498();
		complexiteMath499();
		complexiteMath500();
		complexiteMath501();
		complexiteMath502();
		complexiteMath503();
		complexiteMath504();
		complexiteMath505();
		complexiteMath506();
		complexiteMath507();
		complexiteMath508();
		complexiteMath509();
		complexiteMath510();
		complexiteMath511();
		complexiteMath512();
		complexiteMath513();
		complexiteMath514();
		complexiteMath515();
		complexiteMath516();
		complexiteMath517();
		complexiteMath518();
		complexiteMath519();
		complexiteMath520();
		complexiteMath521();
		complexiteMath522();
		complexiteMath523();
		complexiteMath524();
		complexiteMath525();
		complexiteMath526();
		complexiteMath527();
		complexiteMath528();
		complexiteMath529();
		complexiteMath530();
		complexiteMath531();
		complexiteMath532();
		complexiteMath533();
		complexiteMath534();
		complexiteMath535();
		complexiteMath536();
		complexiteMath537();
		complexiteMath538();
		complexiteMath539();
		complexiteMath540();
		complexiteMath541();
		complexiteMath542();
		complexiteMath543();
		complexiteMath544();
		complexiteMath545();
		complexiteMath546();
		complexiteMath547();
		complexiteMath548();
		complexiteMath549();
		complexiteMath550();
		complexiteMath551();
		complexiteMath552();
		complexiteMath553();
		complexiteMath554();
		complexiteMath555();
		complexiteMath556();
		complexiteMath557();
		complexiteMath558();
		complexiteMath559();
		complexiteMath560();
		complexiteMath561();
		complexiteMath562();
		complexiteMath563();
		complexiteMath564();
		complexiteMath565();
		complexiteMath566();
		complexiteMath567();
		complexiteMath568();
		complexiteMath569();
		complexiteMath570();
		complexiteMath571();
		complexiteMath572();
		complexiteMath573();
		complexiteMath574();
		complexiteMath575();
		complexiteMath576();
		complexiteMath577();
		complexiteMath578();
		complexiteMath579();
		complexiteMath580();
		complexiteMath581();
		complexiteMath582();
		complexiteMath583();
		complexiteMath584();
		complexiteMath585();
		complexiteMath586();
		complexiteMath587();
		complexiteMath588();
		complexiteMath589();
		complexiteMath590();
		complexiteMath591();
		complexiteMath592();
		complexiteMath593();
		complexiteMath594();
		complexiteMath595();
		complexiteMath596();
		complexiteMath597();
		complexiteMath598();
		complexiteMath599();
		complexiteMath600();
		complexiteMath601();
		complexiteMath602();
		complexiteMath603();
		complexiteMath604();
		complexiteMath605();
		complexiteMath606();
		complexiteMath607();
		complexiteMath608();
		complexiteMath609();
		complexiteMath610();
		complexiteMath611();
		complexiteMath612();
		complexiteMath613();
		complexiteMath614();
		complexiteMath615();
		complexiteMath616();
		complexiteMath617();
		complexiteMath618();
		complexiteMath619();
		complexiteMath620();
		complexiteMath621();
		complexiteMath622();
		complexiteMath623();
		complexiteMath624();
		complexiteMath625();
		complexiteMath626();
		complexiteMath627();
		complexiteMath628();
		complexiteMath629();
		complexiteMath630();
		complexiteMath631();
		complexiteMath632();
		complexiteMath633();
		complexiteMath634();
		complexiteMath635();
		complexiteMath636();
		complexiteMath637();
		complexiteMath638();
		complexiteMath639();
		complexiteMath640();
		complexiteMath641();
		complexiteMath642();
		complexiteMath643();
		complexiteMath644();
		complexiteMath645();
		complexiteMath646();
		complexiteMath647();
		complexiteMath648();
		complexiteMath649();
		complexiteMath650();
		complexiteMath651();
		complexiteMath652();
		complexiteMath653();
		complexiteMath654();
		complexiteMath655();
		complexiteMath656();
		complexiteMath657();
		complexiteMath658();
		complexiteMath659();
		complexiteMath660();
		complexiteMath661();
		complexiteMath662();
		complexiteMath663();
		complexiteMath664();
		complexiteMath665();
		complexiteMath666();
		complexiteMath667();
		complexiteMath668();
		complexiteMath669();
		complexiteMath670();
		complexiteMath671();
		complexiteMath672();
		complexiteMath673();
		complexiteMath674();
		complexiteMath675();
		complexiteMath676();
		complexiteMath677();
		complexiteMath678();
		complexiteMath679();
		complexiteMath680();
		complexiteMath681();
		complexiteMath682();
		complexiteMath683();
		complexiteMath684();
		complexiteMath685();
		complexiteMath686();
		complexiteMath687();
		complexiteMath688();
		complexiteMath689();
		complexiteMath690();
		complexiteMath691();
		complexiteMath692();
		complexiteMath693();
		complexiteMath694();
		complexiteMath695();
		complexiteMath696();
		complexiteMath697();
		complexiteMath698();
		complexiteMath699();
		complexiteMath700();
		complexiteMath701();
		complexiteMath702();
		complexiteMath703();
		complexiteMath704();
		complexiteMath705();
		complexiteMath706();
		complexiteMath707();
		complexiteMath708();
		complexiteMath709();
		complexiteMath710();
		complexiteMath711();
		complexiteMath712();
		complexiteMath713();
		complexiteMath714();
		complexiteMath715();
		complexiteMath716();
		complexiteMath717();
		complexiteMath718();
		complexiteMath719();
		complexiteMath720();
		complexiteMath721();
		complexiteMath722();
		complexiteMath723();
		complexiteMath724();
		complexiteMath725();
		complexiteMath726();
		complexiteMath727();
		complexiteMath728();
		complexiteMath729();
		complexiteMath730();
		complexiteMath731();
		complexiteMath732();
		complexiteMath733();
		complexiteMath734();
		complexiteMath735();
		complexiteMath736();
		complexiteMath737();
		complexiteMath738();
		complexiteMath739();
		complexiteMath740();
		complexiteMath741();
		complexiteMath742();
		complexiteMath743();
		complexiteMath744();
		complexiteMath745();
		complexiteMath746();
		complexiteMath747();
		complexiteMath748();
		complexiteMath749();
		complexiteMath750();
		complexiteMath751();
		complexiteMath752();
		complexiteMath753();
		complexiteMath754();
		complexiteMath755();
		complexiteMath756();
		complexiteMath757();
		complexiteMath758();
		complexiteMath759();
		complexiteMath760();
		complexiteMath761();
		complexiteMath762();
		complexiteMath763();
		complexiteMath764();
		complexiteMath765();
		complexiteMath766();
		complexiteMath767();
		complexiteMath768();
		complexiteMath769();
		complexiteMath770();
		complexiteMath771();
		complexiteMath772();
		complexiteMath773();
		complexiteMath774();
		complexiteMath775();
		complexiteMath776();
		complexiteMath777();
		complexiteMath778();
		complexiteMath779();
		complexiteMath780();
		complexiteMath781();
		complexiteMath782();
		complexiteMath783();
		complexiteMath784();
		complexiteMath785();
		complexiteMath786();
		complexiteMath787();
		complexiteMath788();
		complexiteMath789();
		complexiteMath790();
		complexiteMath791();
		complexiteMath792();
		complexiteMath793();
		complexiteMath794();
		complexiteMath795();
		complexiteMath796();
		complexiteMath797();
		complexiteMath798();
		complexiteMath799();
		complexiteMath800();
		complexiteMath801();
		complexiteMath802();
		complexiteMath803();
		complexiteMath804();
		complexiteMath805();
		complexiteMath806();
		complexiteMath807();
		complexiteMath808();
		complexiteMath809();
		complexiteMath810();
		complexiteMath811();
		complexiteMath812();
		complexiteMath813();
		complexiteMath814();
		complexiteMath815();
		complexiteMath816();
		complexiteMath817();
		complexiteMath818();
		complexiteMath819();
		complexiteMath820();
		complexiteMath821();
		complexiteMath822();
		complexiteMath823();
		complexiteMath824();
		complexiteMath825();
		complexiteMath826();
		complexiteMath827();
		complexiteMath828();
		complexiteMath829();
		complexiteMath830();
		complexiteMath831();
		complexiteMath832();
		complexiteMath833();
		complexiteMath834();
		complexiteMath835();
		complexiteMath836();
		complexiteMath837();
		complexiteMath838();
		complexiteMath839();
		complexiteMath840();
		complexiteMath841();
		complexiteMath842();
		complexiteMath843();
		complexiteMath844();
		complexiteMath845();
		complexiteMath846();
		complexiteMath847();
		complexiteMath848();
		complexiteMath849();
		complexiteMath850();
		complexiteMath851();
		complexiteMath852();
		complexiteMath853();
		complexiteMath854();
		complexiteMath855();
		complexiteMath856();
		complexiteMath857();
		complexiteMath858();
		complexiteMath859();
		complexiteMath860();
		complexiteMath861();
		complexiteMath862();
		complexiteMath863();
		complexiteMath864();
		complexiteMath865();
		complexiteMath866();
		complexiteMath867();
		complexiteMath868();
		complexiteMath869();
		complexiteMath870();
		complexiteMath871();
		complexiteMath872();
		complexiteMath873();
		complexiteMath874();
		complexiteMath875();
		complexiteMath876();
		complexiteMath877();
		complexiteMath878();
		complexiteMath879();
		complexiteMath880();
		complexiteMath881();
		complexiteMath882();
		complexiteMath883();
		complexiteMath884();
		complexiteMath885();
		complexiteMath886();
		complexiteMath887();
		complexiteMath888();
		complexiteMath889();
		complexiteMath890();
		complexiteMath891();
		complexiteMath892();
		complexiteMath893();
		complexiteMath894();
		complexiteMath895();
		complexiteMath896();
		complexiteMath897();
		complexiteMath898();
		complexiteMath899();
		complexiteMath900();
		complexiteMath901();
		complexiteMath902();
		complexiteMath903();
		complexiteMath904();
		complexiteMath905();
		complexiteMath906();
		complexiteMath907();
		complexiteMath908();
		complexiteMath909();
		complexiteMath910();
		complexiteMath911();
		complexiteMath912();
		complexiteMath913();
		complexiteMath914();
		complexiteMath915();
		complexiteMath916();
		complexiteMath917();
		complexiteMath918();
		complexiteMath919();
		complexiteMath920();
		complexiteMath921();
		complexiteMath922();
		complexiteMath923();
		complexiteMath924();
		complexiteMath925();
		complexiteMath926();
		complexiteMath927();
		complexiteMath928();
		complexiteMath929();
		complexiteMath930();
		complexiteMath931();
		complexiteMath932();
		complexiteMath933();
		complexiteMath934();
		complexiteMath935();
		complexiteMath936();
		complexiteMath937();
		complexiteMath938();
		complexiteMath939();
		complexiteMath940();
		complexiteMath941();
		complexiteMath942();
		complexiteMath943();
		complexiteMath944();
		complexiteMath945();
		complexiteMath946();
		complexiteMath947();
		complexiteMath948();
		complexiteMath949();
		complexiteMath950();
		complexiteMath951();
		complexiteMath952();
		complexiteMath953();
		complexiteMath954();
		complexiteMath955();
		complexiteMath956();
		complexiteMath957();
		complexiteMath958();
		complexiteMath959();
		complexiteMath960();
		complexiteMath961();
		complexiteMath962();
		complexiteMath963();
		complexiteMath964();
		complexiteMath965();
		complexiteMath966();
		complexiteMath967();
		complexiteMath968();
		complexiteMath969();
		complexiteMath970();
		complexiteMath971();
		complexiteMath972();
		complexiteMath973();
		complexiteMath974();
		complexiteMath975();
		complexiteMath976();
		complexiteMath977();
		complexiteMath978();
		complexiteMath979();
		complexiteMath980();
		complexiteMath981();
		complexiteMath982();
		complexiteMath983();
		complexiteMath984();
		complexiteMath985();
		complexiteMath986();
		complexiteMath987();
		complexiteMath988();
		complexiteMath989();
		complexiteMath990();
		complexiteMath991();
		complexiteMath992();
		complexiteMath993();
		complexiteMath994();
		complexiteMath995();
		complexiteMath996();
		complexiteMath997();
		complexiteMath998();
		complexiteMath999();
		complexiteMath1000(); 
		
		//d.couplage1000.methode();
		boolean done = false;
		
		int gx = goalPoints[curPoint][0];
		int gy = goalPoints[curPoint][1];
		if (atPoint(x, y, gx, gy, v)) {
			// si le citoyen atteint le virage, compteur+1 au nombre de virages atteint
			curPoint++;
			if (curPoint == goalPoints.length) {
				// si le dernier point est atteint parcours terminé
				done = true;
			} else {
				// si ce n'est pas le dernier point, gx et gy représentent le prochain point à atteindre
				gx = goalPoints[curPoint][0];
				gy = goalPoints[curPoint][1];
			}
		}

		if (x < gx) {
			x += v;
		} else {
			x -= v;
		}

		if (y < gy) {
			y += v;
		} else {
			y -= v;
		}

		/*double[] after = EnergyCheckUtils.getEnergyStats();
		
		int socketNum = EnergyCheckUtils.GetSocketNum();
		for(int i = 0; i < socketNum; i++) {
			System.out.println("Power consumption of dram: " + (after[0] - before[0]) / 10.0 + " power consumption of cpu: " + (after[1] - before[1]) / 10.0 + " power consumption of package: " + (after[2] - before[2]) / 10.0);
		}*/
		
		return done;


	}

	private boolean atPoint(double x, double y, int gx, int gy, double v2) {
		return (Math.abs(x - gx) < Math.max(1, v2)) && (Math.abs(y - gy) < Math.max(1, v2));
	}

	public boolean collided(int i, int j) {
		boolean hasCollided = false;

		int ei = (int) (x/60);
		int ej = (int) (y/60);

		if (ei == i && ej == j) {
			hasCollided = true;
			checked = true;
		}

		return hasCollided;
	}


	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean containsPoint(int x, int y) {
		return ((this.x-10) <= x) && ((this.x + 40) >= x) && ((this.y-10) <= y) && ((this.y + 50) >= y);
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}



}