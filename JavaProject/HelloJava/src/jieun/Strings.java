package jieun;

public class Strings {
	public static void main(String[] args) {
		// String 클래스 주요 메서드
		// String s = "Hello";
		// String n = "1234567890";
		// char c1 = s.charAt(1); // 지정한 위치 문자 추출
		// char c2 = n.charAt(6);
		//
		// char[] cArr = new char[0];
		// String s1 = new String(cArr);
		// System.out.println("cArr.length=" + cArr.length);
		// System.out.println("@@@" + s1 + "@@@");

		// 예제 9-11
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str1=\"abc\";");
		System.out.println("String str2=\"abc\";");

		System.out.println("str1==str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");

		// System.out.println();
		// System.out.println("String str4="\"abc\"");

	}
}
