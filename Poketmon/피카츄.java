package Poketmon;

public class 피카츄 extends Pokemon{
	public 피카츄(String name, int attack, int defense, int hp, String type, int level) {
		setHp(hp);
		setAttack(attack);
		setDefense(defense);
		this.name=name;
		this.level=level;				
		setType(type);
	}
	public static double typeAttack(int attack, int defense, String type, String type1) { 	// 속성 공격
		double n=typeEffect(type,type1);
		System.out.println("피카츄의 백만볼트!!");
		return (10*((double)attack/(double)defense)*n)+1;
		
	}
}
