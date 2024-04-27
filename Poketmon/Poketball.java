package Poketmon;

import java.util.ArrayList;

public class Poketball extends Place {
		private static Poketball instance;
		
		private Poketball() {
			where="포켓볼";
			Pokemons= new ArrayList<Pokemon>(); // Pokemon 타입 ArrayList 생성
	}
		
	public static Poketball getInstance() {
		if(instance ==null) // 아직 객체 생성 x
			instance = new Poketball();
		return instance;
	}

}
