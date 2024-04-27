package Poketmon;

public class 라플레시아 extends Pokemon{
	public 라플레시아(String name, int attack, int defense, int hp, String type, int level) {
		setHp(hp);
		setAttack(attack);
		setDefense(defense);
		this.name=name;
		this.level=level;		
		setType(type);
	}
}
