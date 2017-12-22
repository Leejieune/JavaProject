package jieun.lab;

public class Lab14 {
	public static void main(String[] args) {
		// [6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
		// [6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
		// 결과와 같은 결과를 얻도록 하시오.
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); // 3이 출력된다.
		System.out.println(card2.info()); // 1K가 출력된다.

		// [6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.

		// [6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
		// getTotal()과 getAverage()를 추가하시오.
		// [6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.

		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());

		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s1.info());

		// [6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.

		// [6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
		// 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출한다.
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : ""); // 숫자를 문자열로 반환한다. 광(光)인 경우 K를 덧붙인다.
	}
}

class Student {
	String name; // 학생이름
	int ban;// 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		double avg;
		avg = getTotal() / 3;
		return (float) avg;
		// return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

}
