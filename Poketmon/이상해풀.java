package Poketmon;

public class 이상해풀 extends Pokemon{
	public 이상해풀(String name, int attack, int defense, int hp, String type, int level) {
		setHp(hp);
		setAttack(attack);
		setDefense(defense);
		this.name=name;
		this.level=level;				
		setType(type);
	}
	public static double typeAttack(int attack, int defense, String type, String type1) { 	// 속성 공격
		double n=typeEffect(type,type1);
		System.out.println("이상해씨의 풀잎공격!!");
		return (10*((double)attack/(double)defense)*n)+1;
		
	}
}
