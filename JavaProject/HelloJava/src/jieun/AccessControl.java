package jieun;

public class AccessControl {
	public static void main(String[] args) {
		// default 접근제한자테스트
		// Animal클래스는 default 접근제어중
		// 같은 패키지에 존재하는 AccessControl클래스에서 접근가능
		// 클래스에는 default.public 접근 제어만 부여가능!

		Animal lion;
		lion = new Animal();
		lion.name = "사자";
		// 멤버변수 접근제어테스트
		DefaultClass dc = new DefaultClass();
		dc.name = "혜교";// default
		dc.age = 20;// protected
		dc.email = "ddwldms@naver.com";// public
		// dc.regdate="2016=12=17"; //private
		dc.setRagdate("2017-12-17");// setter
		System.out.println(dc.getRegdate());// getter

		// 객체의 생성값 확인-참조주소
		DefaultClass dc1 = new DefaultClass();
		System.out.println(dc1);

		dc1 = new DefaultClass();
		System.out.println(dc1);

		dc1 = new DefaultClass();
		System.out.println(dc1);

	}
}

class DefaultClass {
	// 멤버변수에 적용된 접근제어

	String name; // default
	protected int age; // protected
	public String email;// public
	private String regdate;// private

	// private으로 선언된 멤버변수를 외부클래스에서 접근하게 할려면
	// setter/getter 메서드를 사용
	public void setRagdate(String regdate) {
		this.regdate = regdate;
	}

	public String getRegdate() {
		return regdate;
	}

}
