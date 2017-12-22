package jieun.lab;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		// 21

		// int tax = 0;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("결혼여부를 입력하세요 0은미혼 1은 기혼");
		// int num = sc.nextInt();
		// System.out.println("연봉을 입력하세요");
		// int salary = sc.nextInt();
		// if (num == 0) {
		// if (salary < 3000) {
		// tax = (int) (salary * 0.1);
		// } else if (salary > 3000)
		// tax = (int) (salary * 0.25);
		// } else if (num == 1) {
		// if (salary < 6000) {
		// tax = (int) (salary * 0.1);
		// } else if (salary > 6000)
		// tax = (int) (salary * 0.25);
		// }
		// System.out.printf("%d", tax);
		// 22
		GregorianCalendar gc = new GregorianCalendar();

		System.out.println("현재연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String fmt1 = "%d년은 윤년입니다.";
		String fmt2 = "%d년은 윤년이 아닙니다.";

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.printf(fmt1, year);
		} else
			System.out.printf(fmt2, year);
	}

}
