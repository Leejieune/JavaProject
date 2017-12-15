package jieun.lab;

import java.util.Scanner;

public class SungJukV1 {
	public static void main(String[] args) {
		/*
		 * 성적 처리 프로그램 V1 간단한 성적처리를 수행하는 프로그램 입력 : 이름, 국어, 영어, 수학 처리 : 총점, 평균, 학점 출력 :
		 * 이름, 국어, 영어, 수학, 총점, 평균, 학점
		 */
		String name;
		int Kor;
		int Eng;
		int Math;
		int Sum;
		double Avg;
		char Grd;

		Scanner sc = new Scanner(System.in);

		System.out.println(" 성적 처리 프로그램 v1 ");
		System.out.println("--------------- ");

		System.out.print("이름을 입력하세요");
		name = sc.nextLine();
		System.out.print("국어성적을 입력하세요");
		Kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어성적을 입력하세요");
		Eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학성적을 입력하세요");
		Math = Integer.parseInt(sc.nextLine());

		// scanner 객체닫기
		sc.close();

		Sum = Kor + Eng + Math;
		Avg = (double) Sum / 3;
		Grd = (Avg >= 90) ? 'A' : (Avg >= 80) ? 'B' : (Avg >= 70) ? 'C' : (Avg >= 60) ? 'D' : 'F';

		String fmt = "이름: %s, 국어 : %d 영어 :%d 수학 : %d 합계 :%d 평균 :%1f 등급:%c";
		System.out.printf(fmt, name, Kor, Eng, Math, Sum, Avg, Grd);

		// fmt += "총점 :%d,평균:%1f,~~~";

	}
}
