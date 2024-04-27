package Poketmon;

public class 이상해씨 extends Pokemon {
	public 이상해씨(String name, int attack, int defense, int hp, String type, int level) {
		setHp(hp);
		setAttack(attack);
		setDefense(defense);
		this.name=name;
		this.level=level;		
		setType(type);
	}
	
}