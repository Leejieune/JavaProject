package jieun;

public class Statement2 {
	public static void main(String[] args) {

		// 단순무식하게 복붙 코드로 반복잡업을
		// 수행하는 것은 유비보수 측면으로 볼 때
		// 좋은 방법이 아니다.
		// System.out.println("1");
		// System.out.println("2");
		// System.out.println("3");
		// System.out.println("4");
		// System.out.println("5");

		// 반복문
		// for - 지정한 횟수만큼 어떤 작업을 반복
		// for(초기식 ; 조건식; 증감식){반복실행문();}

		// for (int i = 1; i <= 5; i=i+1)
		// for (int i = 1; i <= 5; i +=1)
		// for (int i = 1; i <= 5; ++i) {
		// System.out.println("오늘 너무 추워요!");
		// }

		// 1-100까지 숫자 출력
		// for (int i = 1; i <= 100; ++i) {
		// System.out.println(i);
		// }

		// 1-100까지 홀수 출력
		// for (int i = 1; i <= 100; i += 2) {
		// System.out.println(i);
		// }
		// for (int i = 1; i <= 100; ++i) {
		// if (i % 2 != 0) {
		// System.out.println(i);
		// }
		// }
		// 100까지 짝수 출력
		// for (int i = 2; i <= 100; i += 2) {
		// System.out.println(i);
		// }
		// for (int i = 1; i <= 100; ++i) {
		// if (i % 2 == 0) {
		// System.out.println(i);
		// }
		// }

		// 구구단
		// 5*1=5
		// 5*2=10
		// 5*3=15
		// ... ...
		// 5*9=45
		// int i;
		// int j;
		//
		// String fmt = "%d* %d=%d\n";
		//
		// for (i = 1, j = 5; i <= 9; ++i)
		// System.out.printf(fmt, j, i, j * i);

		// 사용자로부터 구구단풀력하는 프로그램을 작성해보시오
		// 단 1-9 이외의 숫자나 문자를 입력받으면 잘못입력하셨습니다라는 메시지를 출력하도록

		// System.out.println("1~9의 숫자를 입력받아 i*j의 형태로 구구단 출력");
		//
		// Scanner sc = new Scanner(System.in);
		// System.out.println("i의 수 입력하세요(1~9)");
		// int i = sc.nextInt();
		// System.out.println("j의 수 입력하세요(1~9)");
		// int j = sc.nextInt();
		//
		// String fmt = "답 : %d * %d = %d\n";
		//
		//
		// if ((i >= 1 && i <= 9) && (j >= 1 && j <= 9)) {
		// System.out.printf(fmt, i, j, i * j);
		// } else {
		// System.out.println("잘못 입력하셨습니다.");
		// }

		// int i;
		// int j;
		//
		// String fmt = "답 : %2d * %2d = %d\n";
		// String welcome = " 출력할 구구단의 수를 입력하세요 (1-19)";
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("welcome");
		// int dan = sc.nextInt();
		//
		// fmt = "%d * %d = %d \t";
		// for (i = 1, j = dan; i <= 19; ++i) {
		// System.out.printf(fmt, j, i, j * i);
		// }

		// 중첩 for문
		// **********
		// **********
		// **********
		// **********
		// **********

		// for (int i = 1; i <= 5; ++i) {
		// for (int j = 1; j <= 10; ++j) {
		// System.out.print("*");
		// }
		// System.out.print("\n");
		// }
		// 직각 삼각형 그리기
		// *
		// **
		// ***
		// ****
		// *****

		// for (int i = 1; i <= 5; ++i) {
		// for (int j = 1; j <= i; ++j) {
		// System.out.print("*");
		// }
		// System.out.print("\n");
		// }
		//
		// 역삼각형

		// *****
		// ****
		// ***
		// **
		// *
		//
		// for (int i = 1; i <= 5; ++i) {
		// for (int j = 5; j >= i; --j) { // 방법1
		// // for (int j = 1; j <= (6 - i); ++j) { //방법2
		// System.out.print("*");
		// }
		// System.out.print("\n");
		// }

	}

}
