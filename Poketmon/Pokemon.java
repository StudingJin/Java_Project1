package Poketmon;

public class Pokemon {
	public String name;
	private int attack;
	private int defense;
	private int hp;
	private String type;
	public int level;
	
public Pokemon() {} 
	
public Pokemon(String name, int attack, int defense, int hp, String type, int level) {
	this.name=name;
	this.attack=attack;
	this.defense=defense;
	this.hp=hp;
	this.type=type;
	this.level=level;

}
public void Item(String name, int effect) {
	this.name=name;
	setLevel(level+effect);
}
public static void introduce(Pokemon p) {
	System.out.println("이름 :"+p.name+" 공격력 :"+p.attack+" 방어력 :"+p.defense+" 체력 :"
	+p.hp+" 타입 :"+p.type+" 레벨 :"+p.level);
}
public static int NormalAttack(Pokemon p1,Pokemon p2){  // 수치 조정 필
	return (p1.attack-p2.defense);
}
public void show() {
	System.out.println(name + "의 hp : " + hp);
}
// 속성 상성값 ==> 속성 공격에만 영향
public static double typeEffect(String type1, String type2) {
	if(type1.equals("노말")) {
		if(type2.equals("바위")||type2.equals("고스트")||type2.equals("강철")) return 0.8;
		else return 1;
	}
	else if(type1.equals("격투")) {
		if(type2.equals("노말")||type2.equals("바위")||type2.equals("강철")||type2.equals("얼음")||type2.equals("악")) return 1.25;
		else if(type2.equals("비행")||type2.equals("독")||type2.equals("벌레")||type2.equals("고스트")||type2.equals("에스퍼")||type2.equals("페어리")) return 0.8;
		else return 1;
	}
	else if(type1.equals("비행")) { 
		if(type2.equals("격투")||type2.equals("벌레")||type2.equals("풀")) return 1.25;
		else if(type2.equals("바위")||type2.equals("강철")||type2.equals("전기")) return 0.8;
		else return 1;
	}
	else if(type1.equals("독")) {
		if(type2.equals("풀")||type2.equals("페어리")) return 1.25;
		else if(type2.equals("독")||type2.equals("땅")||type2.equals("바위")||type2.equals("고스트")||type2.equals("강철")) return 0.8;
		else return 1;
	}
	else if(type1.equals("땅")) {
		if(type2.equals("독")||type2.equals("바위")||type2.equals("강철")||type2.equals("불꽃")||type2.equals("전기")) return 1.25;
		else if(type2.equals("비행")||type2.equals("벌레")||type2.equals("풀")) return 0.8;
		else return 1;
	}
	else if(type1.equals("바위")) {
		if(type2.equals("비행")||type2.equals("벌레")||type2.equals("불꽃")||type2.equals("얼음")) return 1.25;
		else if(type2.equals("격투")||type2.equals("땅")||type2.equals("강철")) return 0.8;
		else return 1;
	}
	else if(type1.equals("벌레")) {
		if(type2.equals("풀")||type2.equals("에스퍼")||type2.equals("악"))return 1.25;
		else if(type2.equals("격투")||type2.equals("비행")||type2.equals("독")||type2.equals("고스트")||type2.equals("강철")||type2.equals("불꽃")) return 0.8;
		else return 1;
	} 
	else if(type1.equals("고스트")) {
		if(type2.equals("고스트")||type2.equals("에스퍼")) return 1.25;
		else if(type2.equals("노말")||type2.equals("악")) return 0.8;
		else return 1;
	}
	else if(type1.equals("강철")) {
		if(type2.equals("바위")||type2.equals("얼음")) return 1.25;
		else if(type2.equals("강철")||type2.equals("불꽃")||type2.equals("물")||type2.equals("전기")) return 0.8;
		else return 1;
	}
	else if(type1.equals("불꽃")) {
		if(type2.equals("벌레")||type2.equals("강철")||type2.equals("풀")||type2.equals("얼음")) return 1.25;
		else if(type2.equals("바위")||type2.equals("불꽃")||type2.equals("물")||type2.equals("드래곤")) return 0.8;
		else return 1;
	}
	else if(type1.equals("물")) {
		if(type2.equals("땅")||type2.equals("바위")||type2.equals("불꽃")) return 1.25;
		else if(type2.equals("물")||type2.equals("풀")||type2.equals("드래곤")) return 0.8;
		else return 1;
	}
	else if(type1.equals("풀")) {
		if(type2.equals("땅") || type2.equals("바위") || type2.equals("물")) return 1.25;
		else if(type2.equals("비행") || type2.equals("독") || type2.equals("벌레") || type2.equals("강철") || type2.equals("불꽃") ||
				type2.equals("풀") || type2.equals("드래곤")) return 0.8;
		else return 1;
	}
	else if(type1.equals("전기")) {
		if(type2.equals("비행")||type2.equals("물")) return 1.25;
		else if(type2.equals("땅")||type2.equals("풀")||type2.equals("전기")||type2.equals("드래곤")) return 0.8;
		else return 1;
	}
	else if(type1.equals("에스퍼")) {
		if(type2.equals("격투")||type2.equals("독")) return 1.25;
		else if(type2.equals("강철")||type2.equals("에스퍼")||type2.equals("악")) return 0.8;
		else return 1;
	}
	else if(type1.equals("얼음")) {
		if(type2.equals("비행")||type2.equals("땅")||type2.equals("풀")||type2.equals("드래곤")) return 1.25;
		else if(type2.equals("강철")||type2.equals("불꽃")||type2.equals("물")||type2.equals("얼음")) return 0.8;
		else return 1;
	}
	else if(type1.equals("드래곤")) {
		if(type2.equals("드래곤")) return 1.25;
		else if(type2.equals("강철")||type2.equals("페어리")) return 0.8;
		else return 1;
	}
	else if(type1.equals("악")) {
		if(type2.equals("고스트")||type2.equals("에스퍼")) return 1.25;
		else if(type2.equals("격투")||type2.equals("악")||type2.equals("페어리")) return 0.8;
		else return 1;
	}
	else if(type1.equals("페어리")) {
		if(type2.equals("격투")||type2.equals("드래곤")||type2.equals("악")) return 1.25;
		else if(type2.equals("독")||type2.equals("강철")||type2.equals("불꽃")) return 0.8;
		else return 1;
	} 
	else
		return 1;

}

public static double typeAttack(int attack, int defense, String type, String type1) { 	// 속성 공격
	double n=typeEffect(type,type1);
	return (10*((double)attack/(double)defense)*n)+1;
}
public static void Evolusion(Pokemon p) {
	// 진화 가능한 특정 놈들
	// if (p.level > 35 ) 
}
public static void Special_Evolusion(Pokemon p /*Evolusion_stone*/) {
	
}
public void Item (String name, Pokemon p) {
	if(name.equals("이상한사탕")) {
		p.setLevel(p.level+1);
	}
	else if(name.equals("요상한사탕")){
			
	}
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAttack() {
	return attack;
}

public void setAttack(int attack) {
	this.attack = attack;
}

public int getDefense() {
	return defense;
}

public void setDefense(int defense) {
	this.defense = defense;
}

public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getLevel() {
	return level;
}

public void setLevel(int level) {
	this.level = level;
}

}
