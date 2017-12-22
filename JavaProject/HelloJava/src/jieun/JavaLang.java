package jieun;

import Project1.v1.SungJukVO;

public class JavaLang {
	public static void main(String[] args) throws ClassNotFoundException {
		// 정적으로 객체 생성
		// 생성할 객체 클래스를 직접 기술

		SungJukVO sj = new SungJukVO();
		Parent p = new Parent();
		Son s = new Son();

		// 동적으로 객체 생성
		Class obj1 = new SungJukVO().getClass();
		Class obj2 = SungJukVO.class;
		// Class obj3 = Class.forName("Project.v1.SungJukVO");
		//
		// String[] cls = { "project.SungJukVO", "jieun.Parent", "jieun.Son" };
		// Class[] clsBase = new Class[3];
		// for (int i = 0; i < 3; ++i) {
		// clsBase[i] = Class.forName(cls[i]);
		// }
		//
		// // 동적으로 생성한 클래스 이름 확인
		// System.out.println(clsBase[0].getName());
		// System.out.println(clsBase[1].getName());
		// System.out.println(clsBase[2].getName());
		// 클래스의 정보를 확인 = reflection

		// 문자열 클래스 -String : 변경불가 클래스
		String a = "abc";
		// char[]a={'a','b','c'};
		System.out.println(a);
		a = "xyz";
		System.out.println(a);

		// +연산자로 문자열 연결시 심각한 리소스 낭비 발생
		a = "1" + "2" + "3" + "4" + "5";
		// 따라서, StringBuffer를 사용할 것을 추천

	}
}
