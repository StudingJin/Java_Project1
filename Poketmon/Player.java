package Poketmon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
	 public String name;  //static으로 설정하면 값이 저장 안됨.
	 public int level;
	 public Poketball myPoket;
	 public List<item> items;
	 public List<Pokemon> OwnPokemons;
	 // public ArrayList ItemList;
	 static public int win;
	 static public int lose;

 public Player(){
	    	//System.out.println("[알림] 플레이어의 이름을 설정해주세요.");
	    }	    
 public Player(String name, int level){
	    	this.name = name;
	    	this.level=level;
	    	//myPoket = Poketball.getInstance(); //싱글톤 적용
	    	//items = new ArrayList<item>(); //Item 타입 ArrayList 생성 
	    	//OwnPokemons=new ArrayList<Pokemon>();
	    	/*생성 확인 알림*/
	    	System.out.println("[알림] " + name + " 플레이어가 생성되었습니다.");
	    } 
 
 public static int getWin() {
	return win;
}
public static void setWin(int win) {
	Player.win = win;
}
public static int getLose() {
	return lose;
}
public static void setLose(int lose) {
	Player.lose = lose;
}
public void showPoket() { //플레이어의 포켓볼에 있는 포켓몬들 보여주는 메서드 
	    	System.out.println("*" + name + "님의 포켓볼 속 포켓몬들*");
	    	
	    	//iterator() 사용해 리스트의 값들 조회하기 
	    	//Iterator<Pokemon> e = myPoket.Pokemons.iterator();
	    	//while(e.hasNext()) {
	    	//	System.out.print(e.next().name + " | ");
	    	//}
	    	
	    	System.out.println();
	    	
	    }

}
