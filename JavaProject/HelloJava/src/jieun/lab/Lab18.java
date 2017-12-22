package jieun.lab;

public class Lab18 {
	public static void main(String[] args) {
		// 연습문제 7-7,8,9,10,15,17
		// 8-2,8
		// [7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
		// Child c = new Child();
		// System.out.println("x=" + c.getX());
		// [7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		// 것은?

		// a. public-protected-(default)-private
		// private - 같은 클래스 내에서만 접근이 가능하다.
		// default - 같은 패키지 내에서만 접근이 가능하다.
		// protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서
		// 접근이 가능하다.
		// public - 접근 제한이 전혀 없다.

		// [7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
		// 옳지 않은 것은? (모두 고르시오)
		// c. 메서드 - 오버로딩을 할 수 없다. ->오버라이딩을할수없다.

		// [7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		// 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		// getter와 setter메서드를 추가하라.
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

		// [7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?

		// [7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이클래스를 상속받도록 코드를 변경하시오.
	}
}

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		/* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	void move(int x, int y) {
	}

	void stimPack() {
		/* 스팀팩을 사용한다. */}
}

class Tank extends Unit { // 탱크
	int x, y; // 현재 위치

	void move(int x, int y) {
	}

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {
	}

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}
