package jieun.lab;

public class Lab02 {
	public static void main(String[] args) {
		// #02
		// String name = "leejieun";
		// int cm = 165;
		// int age = 24;
		// System.out.printf("이름 : %s,키 : %d, 나이 : %d", name, cm, age);

		// #03
		int x = 10;
		int y = 20;
		int z = 30;

		int result = 0;

		System.out.printf("3*x\n", 3 * x);
		result = 3 * x; // 3x+y
		result = 3 * x + y;
		result = (x + y) / 7;
		result = (3 * x + y) / (z + 2);

		// #04 : 정수끼리 연산결과는 언제나 정수!
		System.out.printf("(1/3)*3=%d\n", (1 / 3) * 3);
		System.out.printf("(1/3)*3=%f\n", ((double) 1 / 3) * 3);

		// #05
		// int quotient = 7 / 3;
		// int remainder = 7 % 3;

		// System.out.printf("quotient=%d,remainder=%d", quotient, remainder);

		// #06
		int results = 11;
		results /= 2;
		System.out.println(result);

		// #08-논리연산자의 단축평가
		// System.out.println(3+4.5*2+27/8);
		// System.out.println(true | false && 3 < 4 | ! (5 == 7));
		// System.out.println(true ||( 3 < 5 && 6 >=2));
		// System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');

		// #09 - 문자열로 처리
		// 특정일의 요일을 알아내는 수식
		// (Year + (Year / 4) = (Year / 100) + (Year / 400) + (13 * Month + 8) / 5 +
		// Day) % 7

		// System.out.print("May 13, 1988 fell on day number");
		// System.out.println(((13+(13*3-1)/5+1988%100+1988%100/4+1988/400-2*(1988/100))%7+7)%7);
		// System.out.println("Check out this line);
		System.out.println("//hello there" + '9' + 7);
		System.out.printf('H' + 'I' + "is" + 1 + "more example");
		System.out.printf('H' + 6.5 + 'I' + "is" + 1 + "more example");
		// System.out.printf("Print both of us", "Me too"); //중간에 ,가 들어가면 안됨
		System.out.printf("Reverse" + 'I' + 'T');
		System.out.println("NO! Here is" + 1 + "more example");
		// System.out.print("Here is"+10*10);
		System.out.println("Not * is" + true);
		// System.out.print();

		// #10 단축연산

		// #11 우선순위 데이터유형
		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(27 / 13.0 + 4);

		// #12-형변환 :
		int o = (int) 3.9;
		System.out.println("o==" + o);

		// #13 :증가/감소 연산자
		int p = 3;
		p++; // ++p
		System.out.println("p==" + p);

		p = 3;
		System.out.println("p==" + p++);
		System.out.println("p==" + p);

		p = 3;
		p--;
		System.out.println("p==" + p--);
		System.out.println("p==" + p);

		// #14 문자 연경
		System.out.println("2+2=" + (2 + 2));
		System.out.println("2+2=" + 2 + 2);

		// #15-문자와 숫자사이
		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);

		b = 'c';
		System.out.println(b);

		a = 'b';
		System.out.println(a);
	}

}