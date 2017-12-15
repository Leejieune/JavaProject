package jieun.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		// 16-20

		// #16 - a
		// int n = 1;
		// int k = 2;
		// int r = n;
		// if (k < n) {
		// r = k;
		// }
		// System.out.println(n); //1
		// System.out.println(k); //2
		// System.out.println(r); //1

		// #16 - b
		// int n = 1;
		// int k = 2;
		// int r;
		//
		// if (n < k) {
		// r = k;
		// } else {
		// r = k + n;
		// }
		// System.out.println(n); //1
		// System.out.println(k); //2
		// System.out.println(r); //2

		// # 16- c
		// int n = 1;
		// int k = 2;
		// int r = 3;
		//
		// if (r < k) {
		// n = r;
		// } else {
		// k = n;
		// }
		// System.out.println(n); //1
		// System.out.println(k); //1
		// System.out.println(r); //3

		// # 16-d
		// int n = 1;
		// int k = 2;
		// int r = 3;
		//
		// if (r < n + k) { //3<1+2
		// r = 2 * n;
		// } else {
		// k = 2 * r; //k=2*3
		// }
		// System.out.println(n); // 1
		// System.out.println(k); // 6
		// System.out.println(r); // 3

		// # 17-a
		// int x = 1;
		// int y = 2;
		// if (x == 0 && y == 0) { // x&&y==true
		// x = 1;
		// y = 1;
		// }
		// System.out.println(x); // 1
		// #17-b
		// int x = 7;
		// if (1 <= x && x <= 10) {
		// System.out.println(x);
		// }

		// #18-a
		// int number = 35;
		// if (number % 2 == 0) {
		// System.out.println(number + "는 짝수");
		// System.out.println(number + "는 홀수");
		// }
		// #18-b
		// int number = 35;
		// if (number % 2 == 0) {
		// System.out.println(number + "는 짝수");
		// } else {
		// System.out.println(number + "는 홀수");
		//
		// }

		// #19
		// int x = 3;
		// int y = 2;
		// int z;
		// if (x > 2) {
		// if (y > 2) {
		// z = x + y;
		// System.out.println("z is " + z);
		// } else {
		// System.out.println("x is " + x);
		// }
		// //c:x=2,y=2
		// }

		// #20-a
		// int a = 3;
		// if (a++ == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// #20-b
		// int a = 3;
		// if (++a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// #20-c
		// int a = 3;
		// a = a++;
		// if (a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// 21
		// r결혼여부
		// isMarried = "Y","N"
		Scanner sc = new Scanner(System.in);
		System.out.println("결혼여부를 입력하세요(미혼:0, 기혼:1)");
		int isMarried = sc.nextInt();
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);

		} else if (isMarried == 1) {
			if (salary < 6000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);

		}
		System.out.printf("연봉이 %d이므로 세금율은 : %d", salary, tax);

	}

}
