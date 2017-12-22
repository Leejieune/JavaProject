package jieun;

import jieun.lab.SungJukVO;

public class Classes {
	public static void main(String[] args) {
		// 클래스 - 객체를 만들기 위한 틀, 설계도
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.weight = 100;
		tiger.type = "호랑이";
		tiger.gender = "남자";

		tiger.move();
		tiger.eat();
		System.out.println(tiger.name);
		System.out.println(tiger.type);
		System.out.println(tiger.gender);
		System.out.println(tiger.weight);

		// shark
		Animal shark = new Animal();
		shark.name = "샤크";
		shark.weight = 200;
		shark.type = "상어";
		shark.gender = "여자";

		shark.move();
		shark.eat();
		System.out.println(shark.name);
		System.out.println(shark.type);
		System.out.println(shark.gender);
		System.out.println(shark.weight);

		// eagle
		Animal eagle = new Animal();
		eagle.name = "이그루";
		eagle.weight = 70;
		eagle.type = "독수리";
		eagle.gender = "남자";

		eagle.move();
		eagle.eat();
		System.out.println(eagle.name);
		System.out.println(eagle.type);
		System.out.println(eagle.gender);
		System.out.println(eagle.weight);

		Animal tiger2 = new Animal();
		System.out.println(tiger2.name);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.type);
		System.out.println(tiger2.weight);

		Animal cat = new Animal();
		System.out.println(cat.name);
		System.out.println(cat.type);

		cat = new Animal("고순이", 25, "여자", "고양이");
		System.out.println(cat.name);
		System.out.println(cat.type);

		// 회원가입
		Member m = new Member();
		m.userid = "leje";
		m.passwd = "";

		m = new Member("zzyzzy", "987654", "혜교", "abc123@naver.com", "2017-12-18");

		// SungJukV0클래스를 이용하기
		SungJukVO sj = new SungJukVO("혜교", 99, 98, 78);
		System.out.printf("%s %d %d %d ", sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
		System.out.println(sj);
	}

}

class Animal { // 동물 클래스
	// 필드(멤버변수)
	String name;
	int weight;
	String gender;
	String type;
	// 기본생성자

	public Animal() {
		name = "호순";
		type = "호랑이";
		gender = "여자";
		weight = 45;

	} // (매개변수parameter 없는) 생성자

	Animal(String name, int weight, String gender, String type) {
		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;

	}// 매개변수가 있는 생성자
		// 메서드

	void move() {
		System.out.println(name + "가 움직였다.");
	}

	void eat() {
		System.out.println(name + "가 먹이를 먹었다.");
	}

}
// setter/getter

class Car {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	String name;
	int size;

	// 클래스는 클래스의 멤버변수로 선언가능
	Engine engine;
	Door door;
	Wheel wheel;

}

class Engine {
}

class Door {
}

class Wheel {
}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	// 매개변수 있는 생성자
	public Member(String userid, String passwd, String name, String email, String regdate) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

	public Member() {
	}

}
