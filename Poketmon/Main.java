        package Poketmon;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import Poketmen2.Poketmon;
import Poketmon.item;
import Poketmon.Player;

public class Main {  
	public static int[] Solid_MyPokemons;
	static Scanner scanner=new Scanner(System.in);
	public Player player;
	public  Place place;
	private String name;
	private int level;
	public int win;
	public int lose;
	static public int number1;
	
	public void Player(){
		String name;
		int level;
		int win;
		int lose;
		ArrayList ItemList;
    	//System.out.println("[?븣由?] ?뵆?젅?씠?뼱?쓽 ?씠由꾩쓣 ?꽕?젙?빐二쇱꽭?슂.");
    }	    
	public void Player(String name, int level){
    	this.name = name;
    	this.level=level; 	
    } 
	public void Player(int win, int lose) {
		this.win=win;
		this.lose=lose;
	}
	
	public void Item() {
		String name;
	}
	public void Item(String name) {
		this.name=name;
	}
	public static void UesdItem (String name, Pokemon p) 
	{
		if(name.equals("?씠?긽?븳?궗?깢")) 
		{
			p.setLevel(p.level+2);
		}
		else if(name.equals("?슂?긽?븳?궗?깢"))
		{
			if(((Math.random()*10000)%10) > 3) 
			{
				p.setLevel(p.level+5);
			}
			else 
			{
				p.setLevel(p.level-1);
			}
				
		}
	}
	
	public static void Evolusion(Pokemon p) {
			System.out.println("?뼱?"+p.getName()+"?쓽 紐몄뿉?꽌 鍮쏆씠 ?굹湲? ?떆?옉?뻽?떎");
			System.out.println("======================= || =======================");
			System.out.println("======================= || =======================");
			System.out.println("======================= || =======================");
			System.out.println("======================= || =======================");
			System.out.println("======================= || =======================");
			System.out.println("======================= || =======================");
			System.out.println("========================VV========================");
			System.out.print(p.getName()+"?씠(媛?)");
		if(p.getLevel() >=30 ) 
		{
			switch(p.getName())
			{
				case "?씠?긽?빐???":
				{
					p.setName("?씠?긽?빐苑?");
					p.setAttack(198);
					p.setDefense(198);
					p.setHp(160);
					break;
				}
				case "由ъ옄?뱶":
				{
					p.setName("由ъ옄紐?");
					p.setAttack(223);
					p.setDefense(176);
					p.setHp(156);
					break;
				}
				case "?뼱?땲遺?湲?":
				{
					p.setName("嫄곕턿?솗");
					p.setAttack(171);
					p.setDefense(210);
					p.setHp(158);
					break;
				}
				case "?떒?뜲湲?":
				{
					p.setName("踰꾪꽣?뵆");
					p.setAttack(167);
					p.setDefense(151);
					p.setHp(120);
					break;
				}
				case "?뵳異⑹씠":
				{
					p.setName("?룆移⑤텞");
					p.setAttack(169);
					p.setDefense(150);
					p.setHp(130);
					break;
				}
				case "?땲?뱶由щ굹":
				{
					p.setName("?땲?뱶???");
					p.setAttack(180);
					p.setDefense(174);
					p.setHp(180);
					break;
				}
				case "?깂?깉瑗?":
				{
					p.setName("?씪?뵆?젅?떆?븘");
					p.setAttack(202);
					p.setDefense(170);
					p.setHp(150);
					break;
				}
				case "?뒋瑜숈콡?씠":
				{
					p.setName("媛뺤콡?씠");
					p.setAttack(182);
					p.setDefense(187);
					p.setHp(180);			
					break;
				}
				case "?썑?뵖":
				{
					p.setName("?쑄寃붾씪");
					p.setAttack(271);
					p.setDefense(194);
					p.setHp(110);				
					break;
				}
				case "洹쇱쑁紐?":
				{
					p.setName("愿대젰紐?");
					p.setAttack(234);
					p.setDefense(162);
					p.setHp(180);				
					break;
				}
				case "?뜲援щ━":
				{
					p.setName("?뵳援щ━");
					p.setAttack(211);
					p.setDefense(229);
					p.setHp(160);				
					break;
				}
				case "怨좎슦?뒪?듃":
				{
					p.setName("?뙩???");
					p.setAttack(261);
					p.setDefense(156);
					p.setHp(120);						
					break;
				}
			}
		}
		else if(p.getLevel() >=20 ) 
		{
			
			switch(p.getName())
			{
				case "?씠?긽?빐?뵪":
				{
					p.setName("?씠?긽?빐???");
					p.setAttack(151);
					p.setDefense(151);
					p.setHp(120);
					break;
				}
				case "?뙆?씠由?":
				{
					p.setName("由ъ옄?뱶");
					p.setAttack(158);
					p.setDefense(129);
					p.setHp(116);
					break;
				}
				case "瑗щ??湲?":
				{
					p.setName("?뼱?땲遺?湲?");
					p.setAttack(126);
					p.setDefense(155);
					p.setHp(118);
					break;
				}
				case "罹먰꽣?뵾":
				{
					p.setName("?떒?뜲湲?");
					p.setAttack(45);
					p.setDefense(94);
					p.setHp(100);
					break;
				}
				case "肉붿땐?씠":
				{
					p.setName("?뵳異⑹씠");
					p.setAttack(46);
					p.setDefense(86);
					p.setHp(90);
					break;
				}
				case "?땲?뱶?윴???":
				{
					p.setName("?땲?뱶由щ굹");
					p.setAttack(117);
					p.setDefense(126);
					p.setHp(140);
					break;
				}
				case "?슌踰낆큹":
				{
					p.setName("?깂?깉瑗?");
					p.setAttack(153);
					p.setDefense(139);
					p.setHp(120);
					break;
				}
				case "諛쒖콡?씠":
				{
					p.setName("?뒋瑜숈콡?씠");
					p.setAttack(130);
					p.setDefense(130);
					p.setHp(130);							
					break;
				}
				case "罹먯씠?떆":
				{
					p.setName("?쑄寃붾씪");
					p.setAttack(232);
					p.setDefense(138);
					p.setHp(80);							
					break;
				}
				case "?븣?넻紐?":
				{
					p.setName("洹쇱쑁紐?");
					p.setAttack(177);
					p.setDefense(130);
					p.setHp(160);					
					break;
				}
				case "瑗щ쭏?룎":
				{
					p.setName("?뜲援щ━");
					p.setAttack(164);
					p.setDefense(196);
					p.setHp(110);						
					break;
				}
				case "怨좎삤?뒪":
				{
					p.setName("怨좎슦?뒪?듃");
					p.setAttack(223);
					p.setDefense(112);
					p.setHp(90);		
					break;
				}
				
			}
			
		}
		System.out.println(p.getName()+"?쑝濡? 吏꾪솕?븯????뒿?땲?떎.");
		System.out.println(p.getName()+": 怨듦꺽?젰"+p.getAttack()+"\t 諛⑹뼱?젰: "+p.getDefense()
		+"\t hp :"+p.getHp());
	}

	public static double typeEffect(String type1, String type2) {
		if(type1.equals("?끂留?")) {
			if(type2.equals("諛붿쐞")||type2.equals("怨좎뒪?듃")||type2.equals("媛뺤쿋")) return 0.8;
			else return 1;
		}
		else if(type1.equals("寃⑺닾")) {
			if(type2.equals("?끂留?")||type2.equals("諛붿쐞혵혙")||type2.equals("媛뺤쿋")||type2.equals("?뼹?쓬")||type2.equals("?븙")) return 1.25;
			else if(type2.equals("鍮꾪뻾혯혟")||type2.equals("?룆")||type2.equals("踰뚮젅혞")||type2.equals("怨좎뒪?듃")||type2.equals("?뿉?뒪?띁")||type2.equals("?럹?뼱由?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("鍮꾪뻾혯혟")) { 
			if(type2.equals("寃⑺닾")||type2.equals("踰뚮젅혞")||type2.equals("???")) return 1.25;
			else if(type2.equals("諛붿쐞")||type2.equals("媛뺤쿋")||type2.equals("?쟾湲?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?룆")) {
			if(type2.equals("???")||type2.equals("?럹?뼱由?")) return 1.25;
			else if(type2.equals("?룆")||type2.equals("?븙")||type2.equals("諛붿쐞")||type2.equals("怨좎뒪?듃")||type2.equals("媛뺤쿋")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?븙")) {
			if(type2.equals("?룆")||type2.equals("諛붿쐞혵혙")||type2.equals("媛뺤쿋")||type2.equals("遺덇퐙혘")||type2.equals("?쟾湲?")) return 1.25;
			else if(type2.equals("鍮꾪뻾혯혟")||type2.equals("踰뚮젅")||type2.equals("???")) return 0.8;
			else return 1;
		}
		else if(type1.equals("諛붿쐞")) {
			if(type2.equals("鍮꾪뻾")||type2.equals("踰뚮젅혞")||type2.equals("遺덇퐙혘")||type2.equals("?뼹?쓬")) return 1.25;
			else if(type2.equals("寃⑺닾")||type2.equals("?븙")||type2.equals("媛뺤쿋")) return 0.8;
			else return 1;
		}
		else if(type1.equals("踰뚮젅")) {
			if(type2.equals("???")||type2.equals("?뿉?뒪?띁")||type2.equals("?븙"))return 1.25;
			else if(type2.equals("寃⑺닾")||type2.equals("鍮꾪뻾혯혟")||type2.equals("?룆")||type2.equals("怨좎뒪?듃")||type2.equals("媛뺤쿋")||type2.equals("遺덇퐙혘")) return 0.8;
			else return 1;
		} 
		else if(type1.equals("怨좎뒪?듃")) {
			if(type2.equals("怨좎뒪?듃")||type2.equals("?뿉?뒪?띁")) return 1.25;
			else if(type2.equals("?끂留?")||type2.equals("?븙")) return 0.8;
			else return 1;
		}
		else if(type1.equals("媛뺤쿋")) {
			if(type2.equals("諛붿쐞")||type2.equals("?뼹?쓬")) return 1.25;
			else if(type2.equals("媛뺤쿋")||type2.equals("遺덇퐙혘")||type2.equals("臾?")||type2.equals("?쟾湲?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("遺덇퐙")) {
			if(type2.equals("踰뚮젅")||type2.equals("媛뺤쿋")||type2.equals("???")||type2.equals("?뼹?쓬")) return 1.25;
			else if(type2.equals("諛붿쐞")||type2.equals("遺덇퐙혘")||type2.equals("臾?")||type2.equals("?뱶?옒怨?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("臾?")) {
			if(type2.equals("?븙")||type2.equals("諛붿쐞혵혙")||type2.equals("遺덇퐙")) return 1.25;
			else if(type2.equals("臾?")||type2.equals("???")||type2.equals("?뱶?옒怨?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("???")) {
			if(type2.equals("?븙") || type2.equals("諛붿쐞") || type2.equals("臾?")) return 1.25;
			else if(type2.equals("鍮꾪뻾") || type2.equals("?룆") || type2.equals("踰뚮젅") || type2.equals("媛뺤쿋") || type2.equals("遺덇퐙") ||
					type2.equals("???") || type2.equals("?뱶?옒怨?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?쟾湲?")) {
			if(type2.equals("鍮꾪뻾혯혟")||type2.equals("臾?")) return 1.25;
			else if(type2.equals("?븙")||type2.equals("???")||type2.equals("?쟾湲?")||type2.equals("?뱶?옒怨?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?뿉?뒪?띁")) {
			if(type2.equals("寃⑺닾")||type2.equals("?룆")) return 1.25;
			else if(type2.equals("媛뺤쿋")||type2.equals("?뿉?뒪?띁")||type2.equals("?븙")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?뼹?쓬")) {
			if(type2.equals("鍮꾪뻾혯혟")||type2.equals("?븙")||type2.equals("???")||type2.equals("?뱶?옒怨?")) return 1.25;
			else if(type2.equals("媛뺤쿋")||type2.equals("遺덇퐙혘")||type2.equals("臾?")||type2.equals("?뼹?쓬")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?뱶?옒怨?")) {
			if(type2.equals("?뱶?옒怨?")) return 1.25;
			else if(type2.equals("媛뺤쿋")||type2.equals("?럹?뼱由?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?븙")) {
			if(type2.equals("怨좎뒪?듃")||type2.equals("?뿉?뒪?띁")) return 1.25;
			else if(type2.equals("寃⑺닾")||type2.equals("?븙")||type2.equals("?럹?뼱由?")) return 0.8;
			else return 1;
		}
		else if(type1.equals("?럹?뼱由?")) {
			if(type2.equals("寃⑺닾")||type2.equals("?뱶?옒怨?")||type2.equals("?븙")) return 1.25;
			else if(type2.equals("?룆")||type2.equals("媛뺤쿋")||type2.equals("遺덇퐙혘")) return 0.8;
			else return 1;
		} 
		else
			return 1;

	}
	
	public static double typeAttack(int attack, int defense, String type, String type1) { 	// ?냽?꽦 怨듦꺽
		double n=typeEffect(type,type1);
		return (10*((double)attack/(double)defense)*n)+1;
	}
	
	public static void startGame() {
		System.out.println("?솚?쁺?빀?땲?떎.\n吏?湲덈???꽣 ?룷耳볥が 寃뚯엫?쓣 ?떆?옉?빀?땲?떎.\n濡쒕뵫以?....");
	}

	public static void chooseFirstPokemon(Player player) { // ?뵆?젅?씠?뼱?쓽 泥ル쾲吏? ?룷耳볥が ?꽑?깮 硫붿꽌?뱶
		int pick=0;
		Pokemon pm=null;
		
		System.out.println("?뒪????듃 ?룷耳볥が?쓣 怨좊Ⅴ?꽭?슂.");
		System.out.println("1.?씠?긽?빐?뵪\t 2.?뙆?씠由?\t 3.瑗щ??湲?\t 4.?뵾移댁툌\t");
		
		// ?궗?슜?옄 ?젙?쓽 ?삁?쇅瑜? ?궗?슜?븳 ?삁?쇅泥섎━ &try-catch 援ъ“
		
		while(true) {
			try {
				pick=scanner.nextInt();
				if(pick <1|| pick >4) throw new IllegalNumException();
				break;
			}catch(IllegalNumException e) { //?닽?옄 踰붿쐞 珥덇낵 ?떆 ?삁?쇅 泥섎━
				System.out.println("[寃쎄퀬] ?옒紐삳맂 踰덊샇 ?엯?젰! ?떎?떆 ?엯?젰?븯?꽭?슂.");
			}
		} 
		
		if(pick==1) pm = new ?씠?긽?빐?뵪("?씠?긽?빐?뵪?떎",118,118,90,"???",1);
		else if(pick == 2) pm = new ?뙆?씠由?("?뙆?씠由щ떎",116,96,78,"遺덇퐙",1);
		else if(pick ==3 ) pm = new 瑗щ??湲?("瑗щ??湲곕떎",94,122,88,"臾?",1); 
		else pm = new ?뵾移댁툌("?뵾移댁툌?떎",112,101,70,"?쟾湲?",1);
		
		player.myPoket.createPokemon(pm); //?뵆?젅?씠?뼱?쓽 ?룷耳볥낵?뿉 ?쉷?뱷?븳 ?룷耳볥が ????옣.
		

	}  

	public static void createPokemon(int member, ArrayList MyPokemons) { // ?꽑?깮?븳 ?옣?냼?뿉 ?룷耳볥が?뱾 ?깮?꽦?븯湲?
		Pokemon p1=new Pokemon();
		switch(member) {
			case 1:{
				Pokemon p=new ?씠?긽?빐?뵪("?씠?긽?빐?뵪?떎",118,118,90,"???",1);
				//place.createPokemon(p);
				p1=p;
				}
			case 2:{
				Pokemon p=new ?뙆?씠由?("?뙆?씠由щ떎",116,96,78,"遺덇퐙",1);
				//place.createPokemon(p);
				}
			case 3:{
				Pokemon p=new 瑗щ??湲?("瑗щ??湲곕떎",94,122,88,"臾?",1);
				//place.createPokemon(p);
				}
			case 4:{
				Pokemon p=new ?뵾移댁툌("?뵾移댁툌?떎",112,101,70,"?쟾湲?",1);
				//place.createPokemon(p);
				}	
		}
		MyPokemons.add(p1);
	}	
	/*
 			2. 寃뚯엫 吏꾪뻾
	*/	
	public static void endGame() {
		System.out.println("寃뚯엫?쓣 醫낅즺?빀?땲?떎.");
	}	
	public static void Collect() {
		System.out.println((int)((Math.random()*10000)%10));	
	}
	public static void showOwnPokemons(Player gamePlayer, ArrayList<Pokemon> Pokemons) {
	    	System.out.println(gamePlayer.name+"?씠(媛?) 蹂댁쑀?븯怨? ?엳?뒗 ?룷耳볥が?뱾:");
	    	for(int i=0; i<Pokemons.size();i++) {
	    	System.out.println("?씠由? :"+Pokemons.get(i).getName()+" 怨듦꺽?젰 :"+Pokemons.get(i).getAttack()+
					" 諛⑹뼱?젰 :"+Pokemons.get(i).getDefense()+" 泥대젰 :"+Pokemons.get(i).getHp()+" ????엯 :"+Pokemons.get(i).getType()+
					" ?젅踰? :"+Pokemons.get(i).getLevel());
	    	}
	}
	
	public static void showPoket(Player gamePlayer, ArrayList ItemList) {
			
			int  StrangeCandy_Number = Collections.frequency(ItemList, "?씠?긽?븳?궗?깢");
			int  WeirdCandy_Number = Collections.frequency(ItemList, "?슂?긽?븳?궗?깢");
			int  Monsterball_Number=Collections.frequency(ItemList,"紐ъ뒪?꽣蹂?");
			int  Superball_Number=Collections.frequency(ItemList,"?뒋?띁蹂?");
			int  Highpowerball_Number=Collections.frequency(ItemList,"?븯?씠?띁蹂?");
			System.out.println("<<<<<媛?吏?怨? ?엳?뒗 ?븘?씠?뀥>>>>>");
			System.out.println("?씠?긽?븳 ?궗?깢 :"+StrangeCandy_Number);
			System.out.println("?슂?긽?븳 ?궗?깢 :"+ WeirdCandy_Number);
			System.out.println("紐ъ뒪?꽣蹂?: "+Monsterball_Number);
			System.out.println("?뒋?띁蹂?:"+Superball_Number);
			System.out.println("?븯?씠?띁蹂?:"+Highpowerball_Number);
	}
	public static void showPlayer(Player p) {
		System.out.println("<<<<<<?뵆?젅?씠?뼱 ?젙蹂?>>>>>>");
		System.out.println("?뵆?젅?씠?뼱 ?씠由? :"+p.name);
		System.out.println("?뵆?젅?씠?뼱 ?젅踰? :"+p.level);
		System.out.println("**二쇱쓽 :"+p.level+"蹂대떎 ?젅踰⑥씠 ?넂??? ?룷耳볥が?뱾??? ?옟?쓣 ?닔 ?뾾?뒿?땲?떎!!**");
		
	}
	//  **************************8援먯껜?븷?븣 ?닚?꽌 諛붾?뚭쾶 ?븯?뒗嫄? 濡쒖쭅***********************************
	
	public static void Battle(Player p1,ArrayList<Pokemon> Pokemons,
			Player p2,ArrayList<Pokemon> YourPokemons) {	// p1 ?꽑怨?
		
		Scanner sc=new Scanner(System.in);
		number1=0;
		int pick=0; int length=0; int select=0; int length2=0; int select2=0; int pick2=0;
		Pokemon onfield = new Pokemon();
		Pokemon opponent = new Pokemon();
		int op=0;
		int win=0; int lose=0;

		length=Pokemons.size(); 
		length2=YourPokemons.size();
		// 怨좊Ⅸ?냸 異쒖쟾
		System.out.println("?늻援щ?? ?궡蹂대궡?떆寃좎뒿?땲源??: 踰덊샇瑜? ?엯?젰?븯?꽭?슂.");
		showOwnPokemons(p1,Pokemons);
		pick=sc.nextInt();
	
		onfield=new Pokemon(Pokemons.get(pick-1).getName(), Pokemons.get(pick-1).getAttack(),
				Pokemons.get(pick-1).getDefense(),Pokemons.get(pick-1).getHp(),
				Pokemons.get(pick-1).getType(),Pokemons.get(pick-1).getLevel());
		System.out.println(p1.name+"媛?"+onfield.name+"?쓣 ?궡蹂대깉?뒿?땲?떎");
		opponent=new Pokemon(YourPokemons.get(op).getName(), YourPokemons.get(op).getAttack(),
				YourPokemons.get(op).getDefense(),YourPokemons.get(op).getHp(),
				YourPokemons.get(op).getType(),YourPokemons.get(op).getLevel());
		if(p2.name != opponent.name)
			System.out.println(p2.name+"媛?"+opponent.name+"?쓣 ?궡蹂대깉?뒿?땲?떎");
		
		while(true) 
		{		
				if(Pokemons.size() > 0 && YourPokemons.size() > 0) 
				{ //?뱾怨? ?엳?뒗 ?룷耳볥が?씠 ?엳?쓣?븣
					System.out.println("?븷 ?뻾?룞?쓣 ?꽑?깮?븯?떗?떆?삤: ");
					System.out.println("<<<?뻾?룞 ?꽑?깮>>>"); 
					System.out.println("1. :怨듦꺽\t 2. :援먯껜\t 3. :?룷湲?");
					select=sc.nextInt();
						if(select==1) 
						{  // 怨듦꺽
							if(onfield.getHp()>0 && opponent.getHp()>0)					 
							{ //?몮?떎 ?궡?븘?엳?쓣?븣
								System.out.println(onfield.getName()+"怨듦꺽"); 
								System.out.print(opponent.getName()+":"+opponent.getHp());
								opponent.setHp((opponent.getHp()-(int)(typeAttack(onfield.getAttack(),opponent.getDefense(),onfield.getType(),opponent.getType()) )));
								System.out.println("==>"+opponent.getHp());							
								
							if(opponent.getHp()>0) { //1. ?궡?븘?궓?븯?쓣?븣 -> 諛섍꺽
								System.out.println(opponent.getName()+"怨듦꺽");
								System.out.print(onfield.getName()+":"+onfield.getHp());
								onfield.setHp((onfield.getHp()-(int)(typeAttack(opponent.getAttack(),onfield.getDefense(),opponent.getType(),onfield.getType()) )));
								System.out.println("==>"+onfield.getHp());				
								Pokemons.set(pick-1,onfield);
								//?씠寃쇱쓣?븣  --> 二쎌???쓣?븣
								if(onfield.getHp() <=0) {
									//***************************************?븘?뱶 議뚯쓣?븣***********************************************8{
									System.out.println(p2.name+"?듅由?"+"//"+p1.name+"?뙣諛?");
									System.out.println("");		
									
									length--;
									
									if(length==0) 
									{ //***************************************議뚯쓣?븣***********************************************
										System.out.println("?떥?슱 ?닔 ?엳?뒗 ?룷耳볥が?씠 ?뾾?뒿?땲?떎...");   									
										System.out.println(p2.name+"?븳?깭 議뚯뒿?땲?떎..."+p1.name+"??? ?늿?븵?씠 源쒓튇?빐議뚯뒿?땲?떎.");
										break;
									}
									else
										continue;						
								}
								
								
							}
							else 
							{//二쎌쓬 -> 寃곌낵李? ---hp <= 0
								length2--;
								//YourPokemons.remove(opponent);
									if(length2 ==0) 
									{   //?긽??? ?룷耳볥が ?뾾?쓣?븣
										//***************************************?씠寃쇱쓣?븣***********************************************
										if(p2.name != opponent.name) {System.out.println(p2.name+"?쓽 ?룷耳볥が?씠 紐⑤몢 ?벐?윭議뚯뒿?땲?떎.");}																		
										System.out.println(p1.name+"?듅由?"+"//"+p2.name+"?뙣諛?");
										System.out.println("");
										System.out.println(p2.name+"?쑝濡쒕???꽣 ?듅由ы뻽?뒿?땲?떎!!");
										if(p2.name == opponent.name) 									
										{	//***************************************?씠寃쇱쓣?븣***********************************************
											int choice=0; int choice2=0;					
											System.out.println("?벐?윭吏?"+p2.name+"?쓣 ?옟?쑝?떆寃좎뒿?땲源??");
											System.out.println("1. ?삁\t 2.?븘?땲?슂");
											choice=sc.nextInt();
											
											if(choice==1) 
											{
												System.out.println("臾댁뒯 蹂쇱쓣 ?궗?슜?빐?꽌 ?옟?쑝?떆寃좎뒿?땲源??");
												System.out.println("1.紐ъ뒪?꽣蹂?: ?젅踰? 蹂??솕 ?뾾?쓬");
												System.out.println("2.?뒋?띁蹂?: ?옟??? ?룷耳볥が ?젅踰?+5");
												System.out.println("3.?븯?씠?띁蹂?: ?옟??? ?룷耳볥が ?젅踰?+10");
												choice2=sc.nextInt();	
												switch(choice2) 
												{
													case 1:
													{
														opponent.setLevel(opponent.getLevel());
														number1=number1+1;
														break;													
													}
													case 2:
													{
														opponent.setLevel(opponent.getLevel()+5);
														number1=number1+2;
														break;
													}
													case 3:
													{
														opponent.setLevel(opponent.getLevel()+10);
														number1=number1+3;
														break;
													}
												}
												Pokemons.add(opponent);		
											}
											p1.setWin(p1.win+1);									
										}
										Pokemons.set(pick-1,onfield);
										showOwnPokemons(p1,Pokemons);
										
										
										break;									
									}
									else 
									{
										
										Pokemons.set(pick-1,onfield);
										op++;
										opponent=new Pokemon(Pokemons.get(op).getName(), Pokemons.get(op).getAttack(),
												Pokemons.get(op).getDefense(),Pokemons.get(op).getHp(),
												Pokemons.get(op).getType(),Pokemons.get(op).getLevel());
										System.out.println(p2.name+"?씠"+opponent+"瑜? ?궡蹂대궡?젮?빀?땲?떎.");
										System.out.println("?븷 ?뻾?룞?쓣 ?꽑?깮?븯?떗?떆?삤: ");
										System.out.println("<<<?뻾?룞 ?꽑?깮>>>"); 
										System.out.println("1. :吏꾪뻾\t 2. :援먯껜\t 3. :?룷湲?");
										
										select2=sc.nextInt();
										if(select2==1) continue;
										else if(select2==2) 
										{
											Pokemons.set(pick-1,onfield);
											System.out.println("援먯껜?븷 ?룷耳볥が?쓣 ?꽑?깮?븯?꽭?슂");
											showOwnPokemons(p1,Pokemons);		
											pick=sc.nextInt();
											onfield=new Pokemon(Pokemons.get(pick-1).getName(), Pokemons.get(pick-1).getAttack(),
													Pokemons.get(pick-1).getDefense(),Pokemons.get(pick-1).getHp(),
													Pokemons.get(pick-1).getType(),Pokemons.get(pick-1).getLevel());
											System.out.println(p1.name+"媛?"+onfield.name+"?쓣 ?궡蹂대깉?뒿?땲?떎");
											
											System.out.println("?븷 ?뻾?룞?쓣 ?꽑?깮?븯?떗?떆?삤: ");
											System.out.println("<<<?뻾?룞 ?꽑?깮>>>"); 
											System.out.println("1. :怨듦꺽\t 2. :援먯껜\t 3. :?룷湲?");
		
											continue;
										}
									}		
								}		
							} //  ?몮?떎 
							else 
							{
								if(onfield.getHp()<0 )	{
									System.out.println("hp媛? 0?씤 ?룷耳볥が??? 異쒖쟾?떆?궗 ?닔 ?뾾?뒿?땲?떎...");
									System.out.println("?룷耳볥が?쓣 援먯껜?븯嫄곕굹 ?룷湲고븯?뀛?빞 ?맗?땲?떎...");
								}				
								else if( opponent.getHp()<0 && p2.name == opponent.name ) 
								{
									int choice=0; int choice2=0;					
									System.out.println("?벐?윭吏?"+p2.name+"?쓣 ?옟?쑝?떆寃좎뒿?땲源??");
									System.out.println("1. ?삁\t 2.?븘?땲?슂");
									choice=sc.nextInt();
									
									if(choice==1) 
									{
										System.out.println("臾댁뒯 蹂쇱쓣 ?궗?슜?빐?꽌 ?옟?쑝?떆寃좎뒿?땲源??");
										System.out.println("1.紐ъ뒪?꽣蹂?: ?젅踰? 蹂??솕 ?뾾?쓬");
										System.out.println("2.?뒋?띁蹂?: ?옟??? ?룷耳볥が ?젅踰?+5");
										System.out.println("3.?븯?씠?띁蹂?: ?옟??? ?룷耳볥が ?젅踰?+10");
										choice2=sc.nextInt();	
										switch(choice2) 
										{
											case 1:
											{
												opponent.setLevel(opponent.getLevel());
												number1=number1+1;
												break;													
											}
											case 2:
											{
												opponent.setLevel(opponent.getLevel()+5);
												number1=number1+2;
												break;
											}
											case 3:
											{
												opponent.setLevel(opponent.getLevel()+10);
												number1=number1+3;
												break;
											}
										}
										Pokemons.add(opponent);		
									}
									p1.setWin(p1.win+1);
									break;
								}
							}
								//System.out.println("hp媛? 0?씤 ?룷耳볥が??? 異쒖쟾?떆?궗 ?닔 ?뾾?뒿?땲?떎...");
						}
						else if(select==2) // 援먯껜  /// 援먯껜?븷 ?븣 ?닚?꽌 諛붾?뚮뒗 濡쒖쭅 吏쒓린!!!!!!!!!!!
						{
							pick=0;
							System.out.println("?늻援щ줈 援먯껜?븯?떆寃좎뒿?땲源??");
							showOwnPokemons(p1,Pokemons);
							pick=sc.nextInt();
							onfield=new Pokemon(Pokemons.get(pick-1).getName(), Pokemons.get(pick-1).getAttack(),
									Pokemons.get(pick-1).getDefense(),Pokemons.get(pick-1).getHp(),
									Pokemons.get(pick-1).getType(),Pokemons.get(pick-1).getLevel());
							System.out.println(p1.name+"媛?"+onfield.name+"?쓣 ?궡蹂대깉?뒿?땲?떎");
							
							System.out.println("?븷 ?뻾?룞?쓣 ?꽑?깮?븯?떗?떆?삤: ");
							System.out.println("<<<?뻾?룞 ?꽑?깮>>>"); 
							System.out.println("1. :怨듦꺽\t 2. :援먯껜\t 3. :?룷湲?");
							int select10=0;
							select10=sc.nextInt();
							
							if(select10==1) 
							{
								System.out.println("?씠踰? ?꽩??? ?긽???媛? 癒쇱?? 怨듦꺽?빀?땲?떎.");
								System.out.println(opponent.getName()+"怨듦꺽");
								System.out.print(onfield.getName()+":"+onfield.getHp());
								onfield.setHp((onfield.getHp()-(int)(typeAttack(opponent.getAttack(),onfield.getDefense(),opponent.getType(),onfield.getType()) )));
								System.out.println("==>"+onfield.getHp());				
								Pokemons.set(pick-1,onfield);	
								System.out.println(onfield.getName()+"怨듦꺽"); 																
									
								if(onfield.getHp()>0) 
								{ //1. ?궡?븘?궓?븯?쓣?븣 -> 諛섍꺽
									
									System.out.println(onfield.getName()+"怨듦꺽"); 
									System.out.print(opponent.getName()+":"+opponent.getHp());
									opponent.setHp((opponent.getHp()-(int)(typeAttack(onfield.getAttack(),opponent.getDefense(),onfield.getType(),opponent.getType()) )));
									System.out.println("==>"+opponent.getHp());							
								}
								else
								{//2.援먯껜?븯怨? 二쎌뿀?쓣?븣..
									System.out.println(onfield.getName()+"?씠 ?벐?윭議뚯뒿?땲?떎.");
									System.out.println("?떎瑜? ?룷耳볥が?뱶濡? 援먯껜?빐?빞?맗?땲?떎...");
								}											
							}
							else if(select10==2) {
								continue;
							}
							else {
								System.out.println("?룷湲고빀?땲?떎");
								break;
								}
							continue;
						}
						else if(select==3)
						{
							System.out.println(p2.name+"?븳?깭 議뚯뒿?땲?떎...."+p1.name+"??? ?늿?븵?씠 源쒓튇?빐議뚯뒿?땲?떎.");
							break;
						}
				}
		}
	}
	     
	
	//######################################################################################
	//######################################################################################
	//######################################################################################
	
	
	public static void main(String[] args) throws IOException {
		/* 
		  	==========1. ?뵆?젅?씠?뼱 ?깮?꽦==========
		*/
			startGame();
			ArrayList<Pokemon> Pokemons=new ArrayList<Pokemon>();
			Player p1=new Player("諛섎컮吏?泥좎닔",10);// ?긽??? ?뵆?젅?씠?뼱	1	
			Player p2=new Player("吏㏃??移섎쭏?쑀由?",15);// ?긽??? ?뵆?젅?씠?뼱 2	
			Player p3=new Player("愿??옣50吏??슦",50);// ?긽??? ?뵆?젅?씠?뼱	3	
			Player  gamePlayer= new Player();
			// static ArrayList<Pokemon> PokemonRecord;
			ArrayList<Pokemon> MyPokemons=new ArrayList<Pokemon>();
			ArrayList<Pokemon> Solid_MyPokemons=new ArrayList<Pokemon>();
			ArrayList<String> ItemList= new ArrayList<String>();		
			ItemList.add("紐ъ뒪?꽣蹂?");
			ItemList.add("紐ъ뒪?꽣蹂?");
			ItemList.add("紐ъ뒪?꽣蹂?");
			ItemList.add("?뒋?띁蹂?");
			ItemList.add("?뒋?띁蹂?");
			ItemList.add("?븯?씠?띁蹂?");
			ArrayList<Pokemon> YourPokemons=new ArrayList<Pokemon>();  // 泥좎닔
			ArrayList<Pokemon> YourPokemons2=new ArrayList<Pokemon>(); // ?쑀由?
			ArrayList<Pokemon> YourPokemons3=new ArrayList<Pokemon>(); // 吏??슦		
			System.out.println("1.NEW GAME \t 2.LOAD GAME");		
			int startpick=0;
			while(true) {
				try {
					startpick=scanner.nextInt();
					if(startpick <1|| startpick >2) throw new IllegalNumException();
					break;
				}catch(IllegalNumException e) { //?닽?옄 踰붿쐞 珥덇낵 ?떆 ?삁?쇅 泥섎━
					System.out.println("[寃쎄퀬] ?옒紐삳맂 踰덊샇 ?엯?젰! ?떎?떆 ?엯?젰?븯?꽭?슂.");
				}
			} 			
			if(startpick==1) 	
			{	
				System.out.print("?뵆?젅?씠?뼱?쓽 ?씠由? :");
				String name=scanner.next();
				Player trainer=new ?뵆?젅?씠?뼱(name,10);   // 媛앹껜 ?깮?꽦
				trainer.win=0; trainer.lose=0;
				gamePlayer=trainer;
				
				/* 
			  	==========2. ?뵆?젅?씠?뼱 泥? 紐ъ뒪?꽣 ?꽑?깮==========
			    */		
				int pick=0;
				Pokemon pm=null;
				Place place=new Place();
				
				System.out.println("?뒪????듃 ?룷耳볥が?쓣 怨좊Ⅴ?꽭?슂.");
				System.out.print("1.?씠?긽?빐?뵪\t 2.?뙆?씠由?\t 3.瑗щ??湲?\t 4.?뵾移댁툌\t :");
				for(int i=0;i<3;i++) {
					// ?궗?슜?옄 ?젙?쓽 ?삁?쇅瑜? ?궗?슜?븳 ?삁?쇅泥섎━ &try-catch 援ъ“		
						while(true) {
							try {
								pick=scanner.nextInt();
								if(pick <1|| pick >4) throw new IllegalNumException();
								break;
							}catch(IllegalNumException e) { //?닽?옄 踰붿쐞 珥덇낵 ?떆 ?삁?쇅 泥섎━
								System.out.println("[寃쎄퀬] ?옒紐삳맂 踰덊샇 ?엯?젰! ?떎?떆 ?엯?젰?븯?꽭?슂.");
							}
						} 			
						if(pick==1) pm = new ?씠?긽?빐?뵪("?씠?긽?빐?뵪",118,118,90,"???",10);
						else if(pick == 2) pm = new ?뙆?씠由?("?뙆?씠由?",116,96,78,"遺덇퐙",10);
						else if(pick ==3 ) pm = new 瑗щ??湲?("瑗щ??湲?",94,122,88,"臾?",10); 
						else pm = new ?뵾移댁툌("?뵾移댁툌",112,101,70,"?쟾湲?",10);			
						pm.introduce(pm);
						MyPokemons.add(pm);
						Solid_MyPokemons.add(pm);
						Pokemons.add(pm);
				}
				System.out.println(); System.out.println();
				System.out.println("<<蹂댁쑀?븯怨? ?엳?뒗 ?룷耳볥が>>");
				showOwnPokemons(gamePlayer,MyPokemons);			
				
			}
			else
			{   // ?뙆?씪 濡쒕뱶
	
				BufferedReader br =null;
				String[] Player_Imformation=new String[2];
				int[] Player_Imformation1=new int[2];
				String[][] Monster_Imformation=new String[10][10];
				int[][] Monster_Imformation1=new int[10][10];
				String[] Item_Information=new String[5];
				int[] Item_Information1=new int[5];
				
				try {
					br=new BufferedReader(new FileReader("C:\\?븰援? 怨쇱젣\\?옄諛?\\?옄諛뷀룷耳볥が?꽭?씠釉뚰뙆?씪.txt"));
					//String line=null;	int i=0;			
					String line="";
					int count=0;
					int num=0;
					while((line=br.readLine())!=null) {					
						//System.out.println(line);	
						String[] array2=line.split("\\s+");
						if(count==0) 
						{													
							String array[]=line.split(",");
							Player_Imformation[0]=array[0];						
							Player_Imformation[1]=array[1];
							System.out.println(Player_Imformation[0]);
							System.out.println(Player_Imformation[1]);
							try {
								int plevel=Integer.parseInt(Player_Imformation[1]);
								Player_Imformation1[1]=plevel;
							}catch (NumberFormatException ex) {
								ex.printStackTrace();
							}
							gamePlayer.name=Player_Imformation[0];
							gamePlayer.level=Player_Imformation1[1];
						}
						else if(count==1) 
						{
							String number="";
							number=array2[0];						
							try {
								int Pokemon_number=Integer.parseInt(number);
								num=Pokemon_number;
							}catch (NumberFormatException ex) {
								ex.printStackTrace();
							}					
						}	
						else if(count<(2+num)) {
								for(int i=0; i<6; i++) {
								String array[]=line.split(",");
								Monster_Imformation[count-2][i]=array[i];								
								//System.out.print(Monster_Imformation[count-2][i]);						
								//System.out.println();
							}
								try {
									int patt=Integer.parseInt(Monster_Imformation[count-2][1]);
									Monster_Imformation1[count-2][1]=patt;
								}catch (NumberFormatException ex) {
									ex.printStackTrace();
								}
								try {
									int pdff=Integer.parseInt(Monster_Imformation[count-2][2]);
									Monster_Imformation1[count-2][2]=pdff;
								}catch (NumberFormatException ex) {
									ex.printStackTrace();
								}
								try {
									int ph=Integer.parseInt(Monster_Imformation[count-2][3]);
									Monster_Imformation1[count-2][3]=ph;
								}catch (NumberFormatException ex) {
									ex.printStackTrace();
								}
								try {
									int pl=Integer.parseInt(Monster_Imformation[count-2][5]);
									Monster_Imformation1[count-2][5]=pl;
								}catch (NumberFormatException ex) {
									ex.printStackTrace();
								}
								Pokemon pp=new Pokemon(Monster_Imformation[count-2][0],Monster_Imformation1[count-2][1],
										Monster_Imformation1[count-2][2],Monster_Imformation1[count-2][3],
										Monster_Imformation[count-2][4],Monster_Imformation1[count-2][5]);
								MyPokemons.add(pp);
						}
						else if(count==num+2+1) 
						{
							for(int i=0; i<5;i++) {
								String array[]=line.split(",");
								Item_Information[i]=array[i];
								//System.out.println(Item_Information[i]);
							}
							
						}
						//System.out.println(line);
						count++;
					}
				}catch(FileNotFoundException e) {
					System.out.println("?뙆?씪?쓣 李얠?? 紐삵뻽?뒿?땲?떎.");
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					if(br!=null) {
						br.close();
					}
				}
				showPlayer(gamePlayer);
				showPoket(gamePlayer,ItemList);
				showOwnPokemons(gamePlayer, MyPokemons);
	
				
				
			}	
					
			// 	gamePlayer = ?꽭?씠釉? ?맂 ?뵆?젅?씠?뼱
			
			//  MyPokemons = ?꽭?씠釉? ?맂 ?룷耳볥が 由ъ뒪?듃
			//  ItemList = ?꽭?씠釉? ?맂 ?븘?씠?뀥 由ъ뒪?듃
					
		/* 
		  	==========3. 紐⑤뱶 ?꽑?깮==========
		*/	
			int pick2=0;			
			
			while(true) {
				System.out.println("**************************************硫붾돱**************"
						+ "************************");
				System.out.println("\n1.???寃고븯湲?\t 2.?닔吏묓븯湲?\t3.?궡 ?븘?씠?뀥 蹂닿린\t4.?궡 ?룷耳볥が 蹂닿린\t "
						+ "5.?듃?젅?씠?꼫 ?긽?깭蹂닿린\t 6. ?룷耳볥が?꽱?꽣媛?湲?\t7.寃뚯엫 ?꽭?씠釉?/t 8.寃뚯엫醫낅즺");
				
				try {
					pick2 = scanner.nextInt();
					if(pick2 < 1 || pick2 > 8) throw new IllegalNumException();
				}catch(IllegalNumException e) { //?닽?옄 踰붿쐞 珥덇낵 ?떆 ?삁?쇅 泥섎━ 
					System.out.println("[寃쎄퀬] ?옒紐삳맂 踰덊샇 ?엯?젰! ?떎?떆 ?엯?젰?븯?꽭?슂.");
					continue;
				}catch(InputMismatchException e) { //?닽?옄 ?씠?쇅?쓽 媛? ?엯?젰 ?떆 ?삁?쇅 泥섎━ 
					scanner.nextLine();
					System.out.println("[寃쎄퀬] ?옒紐삳맂 踰덊샇 ?엯?젰! ?떎?떆 ?엯?젰?븯?꽭?슂.");
					continue;
				}
				Pokemon other=new Pokemon(); // ?긽???諛? ?룷耳볥が
			if(pick2==1) 
			{					
					int member=0;
					
					System.out.println("???寃? ?긽??? ?깘?깋");
					System.out.println("1.諛섎컮吏?泥좎닔\t 2.吏㏃??移섎쭏?쑀由?\t 3.愿??옣50?궡吏??슦");
					member=scanner.nextInt();
					System.out.println("異쒖쟾?떆?궗 ?룷耳볥が 3留덈━瑜? 怨좊Ⅴ?꽭?슂");
					showOwnPokemons(gamePlayer,MyPokemons);	
					ArrayList<Pokemon> Match_MyPokemons=new ArrayList<Pokemon>();
					for(int i=0; i<3; i++) 
					{
						int myPick=0;
						myPick=scanner.nextInt();
						Match_MyPokemons.add(MyPokemons.get(myPick-1));
						System.out.println(MyPokemons.get(myPick-1).getName()+"?쓣 怨⑤옄?뒿?땲?떎");
					}
					System.out.println("-----<<<異쒖쟾?떆?궗 3留덈━ ?룷耳볥が>>>-----");
					showOwnPokemons(gamePlayer,Match_MyPokemons);	
					System.out.println(); System.out.println();
					
							
					if(member==1) {
						other=new ?씠?긽?빐?뵪("?씠?긽?빐?뵪",118,118,90,"???",10);
						YourPokemons.add(other);
						System.out.println(p1.name+" 媛? ?듅遺?瑜? 嫄몄뼱?솕?뒿?땲?떎!");
						System.out.println(p1.name+"媛? "+other.name+"瑜? ?궡蹂대깉?뒿?땲?떎.");		
						Battle(gamePlayer,Match_MyPokemons,p1,YourPokemons);												
						continue;
						}
					else if(member==2) {
						other=new ?씪?뵆?젅?떆?븘("?씪?뵆?젅?떆?븘",202,170,150,"???",28);
						YourPokemons2.add(other);
						System.out.println(p2.name+" 媛? ?듅遺?瑜? 嫄몄뼱?솕?뒿?땲?떎!");
						System.out.println(p2.name+"媛? "+other.name+"瑜? ?궡蹂대깉?뒿?땲?떎.");		
						Battle(gamePlayer,Match_MyPokemons,p2,YourPokemons2);
						continue;	
					}
					else {
						other =new 媛몃씪?룄?뒪("媛몃옿?룄?뒪",237,197,190,"臾?",35);	
						YourPokemons3.add(other);
						System.out.println(p3.name+" 媛? ?듅遺?瑜? 嫄몄뼱?솕?뒿?땲?떎!");
						System.out.println(p3.name+"媛? "+other.name+"瑜? ?궡蹂대깉?뒿?땲?떎.");		
						Battle(gamePlayer,Match_MyPokemons,p3,YourPokemons3);
						continue;	
					}
					/*
					System.out.println(p1.name+" 媛? ?듅遺?瑜? 嫄몄뼱?솕?뒿?땲?떎!");
					System.out.println(p1.name+"媛? "+other.name+"瑜? ?궡蹂대깉?뒿?땲?떎.");									
					// ?쟾?닾
					 System.out.println();	
						if(gamePlayer.level >= p1.level)
							System.out.println(gamePlayer.name+"?쓽 ?꽑怨?");
						else
							System.out.println(p1.name+"?쓽 ?꽑怨?");						
						System.out.println(); 	
					*/
			}	
			
			else if(pick2==2) 
			{   // ?닔吏묐え?뱶
				Pokemon wildMonster = new Pokemon();					
				System.out.println("?닔吏묓븯湲? ?쐞?븯?뿬 ?븘?뱶濡? ?씠?룞?븯????뒿?땲?떎.");
				System.out.println("?닔吏묓븯?뿬 ?냼吏??븷 ?닔 ?엳?뒗 ?룷耳볥が?쓽 ?닔?뒗 9留덈━ 源뚯?? ?엯?땲?떎.");
				if(gamePlayer.level>=30) 
				{  System.out.println("<<<?븘?뱶 LV 3 硫붾쭏瑜? ?궗留됱쑝濡? ?씠?룞?븯????뒿?땲?떎>>>");
					switch( (int)((Math.random()*10000)%10) ) 						
					{
						case 0:
							wildMonster=new Pokemon("由ъ옄紐?",223,176,156,"遺덇퐙",30);
							break;
						case 1: 					
							wildMonster=new Pokemon("?씪?뵆?젅?떆?븘",202,170,150,"???", 30);	
							break;
						case 2:
							wildMonster=new Pokemon("由ъ옄紐?",223,176,156,"遺덇퐙",30);
							break;
						case 3:
							wildMonster=new Pokemon("媛뺤콡?씠",182,187,180,"臾?",30);
							break;
						case 4:
							wildMonster=new Pokemon("踰꾪꽣?뵆",167,151,120,"踰뚮젅",30);
							break;
						case 5:
							wildMonster=new Pokemon("?씪?씠痢?",193,165,120,"?쟾湲?",30);
							break;
						case 6:
							wildMonster=new Pokemon("?땲?뱶???",180,174,180,"?룆",30);
							break;
						case 7:
							wildMonster=new Pokemon("?썑?뵖",271,194,110,"?뿉?뒪?띁",30);
							break;
						case 8:
							wildMonster=new Pokemon("愿대젰紐?",234,162,180,"寃⑺닾",30);
							break;
						case 9:
							wildMonster=new Pokemon("?뵳援щ━",211,229,160,"諛붿쐞",30);
							break;
					    case 10:
							wildMonster=new Pokemon("?뙩???",261,156,120,"怨좎뒪?듃",30);
							break;											
					}
				}
				else if(gamePlayer.level >=20 ) 
				{	System.out.println("<<<?븘?뱶 LV 2 鍮쎈볕?븳 ?댉?쑝濡? ?씠?룞?븯????뒿?땲?떎>>>");  //?젟 10?씠?긽 20?씠?븯?씪?븣 ?븘?뱶
					switch( (int)((Math.random()*10000)%10) ) 
					{
						case 0:
							wildMonster=new Pokemon("由ъ옄?뱶",158,129,116,"遺덇퐙",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 1: 					
							wildMonster=new Pokemon("?깂?깉瑗?",153,139,120,"???", 20);	
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 2:
							wildMonster=new Pokemon("由ъ옄?뱶",158,129,116,"遺덇퐙",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 3:
							wildMonster=new Pokemon("?뒋瑜숈콡?씠",130,130,130,"臾?",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 4:
							wildMonster=new Pokemon("?떒?뜲湲?",45,94,100,"踰뚮젅",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 5:
							wildMonster=new Pokemon("?뵾移댁툌",115,131,95,"?쟾湲?",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 6:
							wildMonster=new Pokemon("?땲?뱶由щ굹",117,126,140,"?룆",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 7:
							wildMonster=new Pokemon("?쑄寃붾씪",232,138,80,"?뿉?뒪?띁",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 8:
							wildMonster=new Pokemon("洹쇱쑁紐?",177,130,160,"寃⑺닾",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 9:
							wildMonster=new Pokemon("?뜲援щ━",164,196,110,"諛붿쐞",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 10:
							wildMonster=new Pokemon("怨좎슦?뒪?듃",223,112,90,"怨좎뒪?듃",20);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;											
					}
				}
				else 
				{ System.out.println("<<<?븘?뱶 LV 1 ?뱶?꼻??? 珥덉썝?쑝濡? ?씠?룞?븯????뒿?땲?떎>>>");  //?젟 10?씠?븯?씪?븣 媛??옣 ?궙??? ?븘?뱶
					switch( (int)((Math.random()*10000)%10) ) 
					{ 
						case 0:
							wildMonster=new Pokemon("諛쒖콡?씠",101,82,80,"臾?",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;							
						case 1: 					
							wildMonster=new Pokemon("?슌踰낆돋",131,116,90,"???", 10);	
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 2:
							wildMonster=new Pokemon("?뙆?씠由?",116,96,78,"遺덇퐙",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 3:
							wildMonster=new Pokemon("諛쒖콡?씠",101,82,80,"臾?",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 4:
							wildMonster=new Pokemon("罹먰꽣?뵾",55,62,90,"踰뚮젅",10);								
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 5:
							wildMonster=new Pokemon("?뵾移댁툌",112,101,70,"?쟾湲?",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 6:
							wildMonster=new Pokemon("?땲?뱶?윴???",86,94,110,"?룆",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 7:
							wildMonster=new Pokemon("罹먯씠?떆",195,103,50,"?뿉?뒪?띁",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 8:
							wildMonster=new Pokemon("?븣?넻紐?",137,88,140,"寃⑺닾",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 9:
							wildMonster=new Pokemon("瑗щ쭏?룎",132,163,80,"諛붿쐞",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;
						case 10:
							wildMonster=new Pokemon("怨좎삤?뒪",186,70,60,"怨좎뒪?듃",10);
							System.out.println("<<<"+wildMonster.name+"?씠 ?굹????궗?뒿?땲?떎."+">>>");
							break;											
					}
				} //****************************** 紐ъ뒪?꽣 ?깮?꽦 ?셿猷? ******************************************
				int before=gamePlayer.getWin();
				Player wild=new Player();	
				wild.name=wildMonster.name;
				ArrayList<Pokemon> wildPokemons=new ArrayList<Pokemon>(); 
				wildPokemons.add(wildMonster);
				Solid_MyPokemons.add(wildMonster);
				Battle(gamePlayer,MyPokemons,wild, wildPokemons); 
				int after=gamePlayer.getWin();
				if(after>before) 
				{
					item StrangeCandy=new item("?씠?긽?븳?궗?깢");
					item WeirdCandt=new item("?슂?긽?븳?궗?깢");
					
					ItemList.add("?씠?긽?븳?궗?깢");
					ItemList.add("?슂?긽?븳?궗?깢");
					gamePlayer.level+=3;
					System.out.println(gamePlayer.name+"?듅由ы븯?뿬 3 ?젅踰⑥뾽?뻽?뒿?땲?떎");
					System.out.println(gamePlayer.name+"?쓽 ?젅踰?"+gamePlayer.level);
				}
				if(number1==1) {
					ItemList.remove("紐ъ뒪?꽣蹂?");
				}
				else if(number1==2) {
					ItemList.remove("?뒋?띁蹂?");
				}
				else if(number1==3) {
					ItemList.remove("?븯?씠?띁蹂?");
				}
				else
					System.out.println("?옟吏? ?븡怨? 吏??굹媛묐땲?떎");
								
				showPoket(gamePlayer,ItemList);			
						
						
			} //**********************************?닔吏묐え?뱶 ?걹***********************************************************
				
			
			else if(pick2==3) 
			{ //*****************************?궡 ?븘?씠?뀥 ?궗?슜******************************
				int pick5=0;
				showPoket(gamePlayer,ItemList);
				System.out.println("<<<?븘?씠?뀥?쓣 ?궗?슜?븯?떆寃좎뒿?땲源??>>>");
				System.out.println("1. ?꽕 \t 2.?븘?땲?삤");
				pick5=scanner.nextInt();
				
				if(pick5==1) 
				{
					int  S_C_num = Collections.frequency(ItemList, "?씠?긽?븳?궗?깢");
					int  W_C_num = Collections.frequency(ItemList, "?슂?긽?븳?궗?깢");
					int pick6=0; int pick7=0;
					System.out.println("?궗?슜?븷 ?븘?씠?뀥?쓣 ?꽑?깮?빐二쇱꽭?슂:");
					System.out.println("1. ?씠?긽?븳 ?궗?깢(level+2): \t 2.?슂?긽?븳 ?궗?깢(?넂????솗瑜좊줈 level+5, ?뱶臾쇨쾶 -1 ");
					showPoket(gamePlayer,ItemList);
					pick6=scanner.nextInt();
					if(pick6==1) 
					{
						if(S_C_num!=0)
						{
							int pick8=0; int pick9=0;
							System.out.println("?궗?깢?쓣 以? ?룷耳볥が?쓣 ?꽑?깮?븯?꽭?슂:");
							showOwnPokemons(gamePlayer,MyPokemons);	
							pick8=scanner.nextInt();				
							System.out.println("?궗?슜?븷 ?궗?깢?쓽 媛쒖닔瑜? 援ы븯?떆?삤");
							pick9=scanner.nextInt();	
						
							for(int i=0; i<pick9;i++) 
							{
								System.out.println(MyPokemons.get(pick8-1).getName()+"?씠(媛?) ?젅踰⑥뾽?뻽?뒿?땲?떎");
								System.out.print(MyPokemons.get(pick8-1).getLevel()+"==>");
								UesdItem("?씠?긽?븳?궗?깢", MyPokemons.get(pick8-1));
								System.out.println(MyPokemons.get(pick8-1).getLevel());
								ItemList.remove("?씠?긽?븳?궗?깢");
								
							}			
							if(MyPokemons.get(pick8-1).getLevel()>=15) {
								MyPokemons.get(pick8-1).setAttack(MyPokemons.get(pick8-1).getAttack()+10);
								MyPokemons.get(pick8-1).setDefense(MyPokemons.get(pick8-1).getDefense()+10);
							}
							if(MyPokemons.get(pick8-1).getLevel()>=20) 
								{
									Evolusion(MyPokemons.get(pick8-1));
								}
							
							showPoket(gamePlayer,ItemList);
						}
						else 
						{
							System.out.println("?궗?깢?씠 ?뾾?뒿?땲?떎.");
							System.out.println("?궗?깢?쓣 ?뼸怨? ?떢?떎硫? ?닔吏묓븯湲? 紐⑤뱶?뿉?꽌 ?듅由ы븯?떗?눥.");							
						}
					}
					else
					{
						if(W_C_num!=0)
						{
							int pick8=0; int pick9=0;
							System.out.println("?궗?깢?쓣 以? ?룷耳볥が?쓣 ?꽑?깮?븯?꽭?슂:");
							showOwnPokemons(gamePlayer,MyPokemons);	
							pick8=scanner.nextInt();				
							System.out.println("?궗?슜?븷 ?궗?깢?쓽 媛쒖닔瑜? 援ы븯?떆?삤");
							pick9=scanner.nextInt();	
						
							for(int i=0; i<pick9;i++) 
							{
								System.out.println(MyPokemons.get(pick8-1).getName()+"?씠(媛?) ?젅踰⑥뾽?뻽?뒿?땲?떎");
								System.out.print(MyPokemons.get(pick8-1).getLevel()+"==>");
								UesdItem("?슂?긽?븳?궗?깢", MyPokemons.get(pick8-1));
								System.out.println(MyPokemons.get(pick8-1).getLevel());
								ItemList.remove("?슂?긽?븳?궗?깢");
								
							}							
							if(MyPokemons.get(pick8-1).getLevel()>=15) {
								MyPokemons.get(pick8-1).setAttack(MyPokemons.get(pick8-1).getAttack()+10);
								MyPokemons.get(pick8-1).setDefense(MyPokemons.get(pick8-1).getDefense()+10);
							}
							if(MyPokemons.get(pick8-1).getLevel()>=20) 
								{
									Evolusion(MyPokemons.get(pick8-1));
								}
							
							showPoket(gamePlayer,ItemList);
						}
						else 
						{
							System.out.println("?궗?깢?씠 ?뾾?뒿?땲?떎.");
							System.out.println("?궗?깢?쓣 ?뼸怨? ?떢?떎硫? ?닔吏묓븯湲? 紐⑤뱶?뿉?꽌 ?듅由ы븯?떗?눥.");							
						}
					}
					
				}
			}
			//*****************************?궡 ?븘?씠?뀥 ?궗?슜 ?걹******************************
			
//==========================================================================================			
			
			//*****************************?궡 ?룷耳볥が 蹂닿린********************************
			
			else if(pick2==4) {
				showOwnPokemons(gamePlayer,MyPokemons);
					System.out.println("?룷耳볥が?쓣 踰꾨┫源뚯슂?");
					System.out.println("1. ?꽕\t 2.?븘?땲?슂");
					int pick9=0;
					pick9=scanner.nextInt();
					if(pick9==1) {
						System.out.println("?늻援? 踰꾨━寃좎뒿?땲源??");
						int pick10=0;
						pick10=scanner.nextInt();
						System.out.println(MyPokemons.get(pick10-1).getName()+"?쓣 ?옄?뿰?쑝濡? ?룎?젮蹂대깉?뒿?땲?떎.");
						MyPokemons.remove(pick10-1);
						System.out.println("?삤諛뺤궗?떂?쑝濡쒕???꽣 紐ъ뒪?꽣蹂? ?븳媛쒕?? 諛쏆븯?뒿?땲?떎.");
						ItemList.add("紐ъ뒪?꽣蹂?");
					}
			}
			//*****************************?궡 ?룷耳볥が 蹂닿린 ?걹********************************
			
//==========================================================================================
			
			//*****************************?듃?젅?씠?꼫 ?긽?깭 蹂닿린********************************
			
			
			else if(pick2==5) 
				showPlayer(gamePlayer);
			
			
			//*****************************?듃?젅?씠?꼫 ?긽?깭 蹂닿린 ?걹********************************
				
			else if(pick2==6) 
			{ //******************************?룷耳볥が ?꽱?꽣 ?룷耳볥が hp珥덇린?솕*****************
				int NumOfPokemons=MyPokemons.size();
				for(int i=0; i<MyPokemons.size();i++) 
				{
					MyPokemons.get(i).setHp((Solid_MyPokemons.get(i).getHp()));
				}
				System.out.println("蹂댁쑀?븯怨? ?엳?쑝?떊 ?룷耳볥が 紐⑤몢 ?쉶蹂듬릺?뿀?뒿?땲?떎.");
				showOwnPokemons(gamePlayer,MyPokemons);	
				
			}
			else if(pick2==7) 
			{
				Pokemons.add(MyPokemons.get(0));
				String Save_gamePlayer_name=gamePlayer.name;
				int Save_gamePlayer_level=gamePlayer.level;
				ArrayList<Pokemon> Save_MyPokemons = MyPokemons;
				ArrayList<String> Save_ItemList= ItemList;
				BufferedWriter fos = new BufferedWriter(new FileWriter("C:\\?븰援? 怨쇱젣\\?옄諛?\\?옄諛뷀룷耳볥が?꽭?씠釉뚰뙆?씪.txt"));		
		
				/*
				fos.write("?뵆?젅?씠?뼱 ?씠由? :");
				fos.write(Save_gamePlayer_name); //?궡?슜?쓣 ?엯?젰?븳?떎.	
				fos.newLine();
				fos.write("?뵆?젅?씠?뼱 ?젅踰? :");
				fos.write(String.valueOf(Save_gamePlayer_level)); //?궡?슜?쓣 ?엯?젰?븳?떎.		
				fos.newLine();
				fos.write("*********************");
				fos.newLine();
				
				fos.write("蹂댁쑀?븯?떊 ?룷耳볥が:");
				fos.newLine();
				fos.write("?씠由?,怨듦꺽?젰,諛⑹뼱?젰,泥대젰,????엯,?젅踰?");
				fos.newLine();
				for(int i=0; i<MyPokemons.size();i++) 
				{
										
					fos.newLine();
					fos.write(Save_MyPokemons.get(i).getName());
					
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getAttack()));
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getDefense()));
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getHp()));
					fos.write(",");
					
					fos.write(Save_MyPokemons.get(i).getType());
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getLevel()));
					fos.write(",");
					fos.newLine();
					//Pokemons.add(MyPokemons.get(i));
				}
				fos.newLine();
				fos.write("------?냼?쑀?븳 ?븘?씠?뀥?뱾------");
				fos.newLine();
				int  StrangeCandy_Number = Collections.frequency(ItemList, "?씠?긽?븳?궗?깢");
				int  WeirdCandy_Number = Collections.frequency(ItemList, "?슂?긽?븳?궗?깢");
				int  Monsterball_Number=Collections.frequency(ItemList,"紐ъ뒪?꽣蹂?");
				int  Superball_Number=Collections.frequency(ItemList,"?뒋?띁蹂?");
				int  Highpowerball_Number=Collections.frequency(ItemList,"?븯?씠?띁蹂?");
				fos.write("?씠?긽?븳 ?궗?깢:");
				fos.write(String.valueOf(StrangeCandy_Number));
				fos.newLine();
				fos.write("?슂?긽?븳 ?궗?깢 :");
				fos.write(String.valueOf(WeirdCandy_Number));
				fos.newLine();
				fos.write("紐ъ뒪?꽣蹂? :");
				fos.write(String.valueOf(Monsterball_Number));
				fos.newLine();
				fos.write("?뒋?띁蹂? :");
				fos.write(String.valueOf(Superball_Number));
				fos.newLine();
				fos.write("?븯?씠?띁蹂? :");
				fos.write(String.valueOf(Highpowerball_Number));
				fos.newLine();
				

				fos.close();
				*/
				
				
				fos.write(Save_gamePlayer_name); //?궡?슜?쓣 ?엯?젰?븳?떎.	
				fos.write(",");	
				fos.write(String.valueOf(Save_gamePlayer_level)); //?궡?슜?쓣 ?엯?젰?븳?떎.		
				fos.newLine();				
				fos.write(String.valueOf(MyPokemons.size()));
				fos.newLine();	
				for(int i=0; i<MyPokemons.size();i++) 
				{								
					fos.write(Save_MyPokemons.get(i).getName());					
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getAttack()));
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getDefense()));
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getHp()));
					fos.write(",");
					
					fos.write(Save_MyPokemons.get(i).getType());
					fos.write(",");
					
					fos.write(String.valueOf(Save_MyPokemons.get(i).getLevel()));
					fos.write(",");
					fos.newLine();
					//Pokemons.add(MyPokemons.get(i));
				}
				fos.newLine();
				int  StrangeCandy_Number = Collections.frequency(ItemList, "?씠?긽?븳?궗?깢");
				int  WeirdCandy_Number = Collections.frequency(ItemList, "?슂?긽?븳?궗?깢");
				int  Monsterball_Number=Collections.frequency(ItemList,"紐ъ뒪?꽣蹂?");
				int  Superball_Number=Collections.frequency(ItemList,"?뒋?띁蹂?");
				int  Highpowerball_Number=Collections.frequency(ItemList,"?븯?씠?띁蹂?");
	
				fos.write(String.valueOf(StrangeCandy_Number));
				fos.write(",");
				fos.write(String.valueOf(WeirdCandy_Number));
				fos.write(",");
				fos.write(String.valueOf(Monsterball_Number));
				fos.write(",");
				fos.write(String.valueOf(Superball_Number));
				fos.write(",");
				fos.write(String.valueOf(Highpowerball_Number));
				fos.write(",");
				

				fos.close();
				System.out.println("由ы룷?듃?뿉 湲곕줉以묒엯?땲?떎.....?옞?떆 ?떆媛꾩씠 ?냼?슂?맗?땲?떎");
				System.out.println("?뙆?씪?씠 ?꽭?씠釉? ?릺?뿀?뒿?땲?떎!!!");
				
			}
			else 
			{ 
					endGame();
					break;
			}
			if(MyPokemons.size()==0) 
				{
					System.out.println("???寃곗뿉 ?굹媛? ?룷耳볥が?씠 ?뾾?뒿?땲?떎. 寃뚯엫?쓣 醫낅즺?빀?땲?떎.");
					break;
				}
				// ?긽??? ?듃?젅?씠?꼫 紐ъ뒪?꽣 ?뾾?쓣?븣 硫붿냼?뱶
			
		}
		// case1: Battle();   // ????쟾紐⑤뱶
		// case2: Collect();  // ?닔吏묐え?뱶
		// case3: Maintenance(); // ?듃?젅?씠?꼫 ?긽?깭(?젅踰?), 紐ъ뒪?꽣(?젅踰⑥뾽)
			System.out.println("?봽濡쒓렇?옩?쓣 醫낅즺?빀?땲?떎.");
	}

}
