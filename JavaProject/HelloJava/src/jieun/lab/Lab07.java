package jieun.lab;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args) {
		// #22 윤년 여부 확인
		// 현재연도가 400으로 나눠 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만
		// 100으로는 나눠떨어지지않음
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("윤년확인용 연도입력");

		String fmt1 = "%d 년은 윤년입니다";
		String fmt2 = "%d 년은 윤년이아닙니다.";
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// 1
		if (gc.isLeapYear(year)) {
			System.out.printf(fmt1, year);
		} else {
			System.out.printf(fmt2, year);
		}

		// 2
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			System.out.printf(fmt1, year);
		} else {
			System.out.printf(fmt2, year);
		}

		// (23,26,29), 25,27,28
		// #23 - 복권발행 프로그
		// 특정범위를 포함하는 난수 생성
		// 정수 난수값 % ((마지막값 - 시작값) +1 ) + 시작값
		// 복권 숫자 범위 : 100-999
		// lotto : 657, lucky :452 =1개 일치
		// lotto : 657, lucky : 524 = 1개일치
		// lotto : 657, lucky : 123 = 0개일치
		// lotto : 657, lucky : 726 = 2개일치
		// System.out.println("복권발행 프로그램입니다.");
		//
		// int rand = (int) (Math.random() * 100);
		// int lotto = rand % ((999 - 100) + 1) + 100;
		// System.out.println(lotto);
		// int match = 0;
		//
		// Scanner sc = new Scanner(System.in);
		// String lucky = sc.nextLine();
		//
		// // 문자 하나씩 추출
		// char lucky1 = lucky.charAt(0);
		// char lucky2 = lucky.charAt(1);
		// char lucky3 = lucky.charAt(2);
		//
		// char lotto1 = ("" + lotto).charAt(0);
		// char lotto2 = ("" + lotto).charAt(1);
		// char lotto3 = ("" + lotto).charAt(2);
		// String lotto4 = "" + lotto;
		// int size = lotto4.length();
		// for (int i = 0; i < size; ++i)
		// for (int j = 0; j < size; ++j)
		// if (lucky.charAt(i) == lotto4.charAt(j))
		// ;
		//
		// ++match;
		//
		// // 비교
		// // if (lotto1 == lucky1 || lotto2 == lucky2 || lotto3 == lucky3)
		// // ++match;
		// // if (lotto1 == lucky1 || lotto2 == lucky2 || lotto3 != lucky3)
		// // ++match;
		// // if (lotto1 == lucky1 || lotto2 != lucky2 || lotto3 != lucky3)
		// // ++match;
		//
		// String msg = "꽝입니다! 다음 기회에";
		//
		// switch (match) {
		// case 1:
		// msg = "모두 일치 ! 상금 1백만원";
		// break;
		// case 2:
		// msg = "2개 일치 ! 상금 1만원";
		// break;
		// case 3:
		// msg = "1개 일치 ! 상금 1천원";
		// break;
		// }
		// System.out.println(msg);

		// System.out.println("복권발행 프로그램입니다.");
		// System.out.println("숫자 3자리를 입력하세요");
		//
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		// int num1 = sc.nextInt();
		// int num2 = sc.nextInt();
		//
		// int answer = (int) (Math.random() * 1000) + 100;
		// int answer1 = (int) (Math.random() * 1000) + 100;
		// int answer2 = (int) (Math.random() * 1000) + 100;
		//
		// String fmt = "%d %d %d\n";
		// System.out.printf(fmt, num, num1, num2);
		// System.out.printf(fmt, answer, answer1, answer2);
		//
		// if(num==answer && num1 == answer1 && num2 == answer2)
		// {
		// System.out.println("상금 1백만 지급");
		// }
		// else if(num==answer && )
		// #24

		// #25- 문자와 숫자 변환
		// 소문자 a: 97, 대문자 A : 65
		// System.out.println("소문자 알파벳을 대문자로 바꿔드립니다!");
		// System.out.println("소문자 알파벳을 하나 입력하세요");
		// int ch = System.in.read();
		// // 소문자 (a : 97, z : 122) 이외의
		// // 문자가 입력되면 경고메세지 출력
		// if (ch < 97 || ch > 122)
		// System.out.println("잘못입력하셨습니다!");
		// else {
		//
		// // 소문자를 대문자로 변환하기 위해 -32
		// // 입력한 문자에서 32만큼 빼고 처리
		// ch = ch - 32;
		//
		// System.out.println((char) ch);
		// }

		// # 26 숫자맞추기
		//
		// int num2 = (int) (Math.random() * 100) + 1;
		// Scanner sc = new Scanner(System.in);
		//
		// while (true) {
		// System.out.println("숫자를입력하세요");
		// int num1 = sc.nextInt(); // 정수 입력받음
		//
		// if (num1 > num2)
		// System.out.println("추측한 숫자가 큽니다.");
		// else if (num1 < num2)
		// System.out.println("추측한 숫자가 작습니다.");
		// else if (num1 == num2) {
		// System.out.println("빙고!숫자를맞췄습니다.");
		// break;
		// }
		//
		// }

		// 27
		// int number = 0;
		// int sum = 0;
		// while (number < 20) {
		// number++;
		// sum += number;
		// if (sum >= 100)
		// break;
		// }
		//
		// String fmt = "num : %d, sum : %d \n";
		// System.out.printf(fmt, number, sum);

		// ## 28
		// int number = 0;
		// int sum = 0;
		// while (number < 20) {
		// number++;
		//
		// if (number == 10 || number == 11)
		// continue;
		// sum += number;
		// }
		//
		// //
		// String fmt = "number : %d , sum : %d ";
		// System.out.printf(fmt, number, sum);

		// 30-구구단 차트
		// String fmt = "\t Multiplication Table \n";
		// fmt += " 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "---------------------------------------- \n";
		// fmt += "1 | 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "2 | 2 4 3 4 5 6 7 8 9 \n";
		// fmt += "3 | 3 6 3 4 5 6 7 8 9 \n";
		// fmt += "4 | 4 8 3 4 5 6 7 8 9 \n";
		// fmt += "5 | 5 10 3 4 5 6 7 8 9 \n";
		// fmt += "6 | 6 2 3 4 5 6 7 8 9 \n";
		// fmt += "7 | 7 2 3 4 5 6 7 8 9 \n";
		// fmt += "8 | 8 2 3 4 5 6 7 8 9 \n";
		// fmt += "9 | 9 2 3 4 5 6 7 8 9 \n\n";
		//
		// System.out.println(fmt);

		// String fmt = "\t Multiplication Table \n";
		// fmt += " 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "---------------------------------------- \n";
		//
		// int j;
		// System.out.println(fmt);
		// for (int i = 1; i <= 9; ++i) {
		// System.out.printf("%d | %3d", i, i);
		// for (j = 2; j <= 9; ++j) {
		// System.out.printf(" %2d", i * j);
		// // fmt = "%d | %3d %2d %2d %2d %2d %2d %2d %2d %2d \n";
		// // System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7,
		// i
		// // * 8, i * 9);
		// }
		// System.out.println();
		//
		// }
	}

}
