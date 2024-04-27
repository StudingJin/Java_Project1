package Poketmon;

public class 갸라도스 extends Pokemon{
	public 갸라도스(String name, int attack, int defense, int hp, String type, int level) {
		setHp(hp);
		setAttack(attack);
		setDefense(defense);
		this.name=name;
		this.level=level;		
		setType(type);
	}
}	
