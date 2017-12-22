package jieun;

//ctrl + shift + o 
import jieun.lab.SungJukMain;
import jieun.lab.SungJukService;

//import jieun.lab.*;

public class OtherClass {
	public static void main(String[] args) {
		// 다른 클래스 사용하기
		// 같은 패키지 내 다른 클래스는 별다른 과정없이 바로 사용가능
		Overloads o = new Overloads();
		Overrides r = new Overrides();

		// 다른 패키지 클래스 가져오기
		// 해당 클래스가 존재하는 ㅍ ㅐ키지경로를 모두 기술해야만 사용가능
		jieun.lab.SungJukV1 sj = new jieun.lab.SungJukV1();

		// 다른 패키지 클래스 사용하기
		// import문을 사용하면 편리하게 다른 패키지 상의
		// 클래스를 사용할수있음
		SungJukService sjsrv = new SungJukService();
		SungJukMain sjm = new SungJukMain();
	}
}
