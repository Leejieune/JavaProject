package jieun;

public class Statement3 {
	public static void main(String[] args) {
		// 반복문 -while
		// int i = 1; //초기식
		// while (i <= 5) { //조건식
		// System.out.println("오늘 너무 추워!");
		// ++i; //증감식
		// }

		// 무한 루프
		// while (true) {
		// System.out.println("오늘 너무 추워!");
		//
		// }
		// 구구단
		// String fmt = "%d * %d = %d \n";
		// int dan = 5;
		// int i = 1;
		// while (i <= 9) {
		// System.out.printf(fmt, dan, i, dan * i);
		// ++i;
		// }

		// 한번도 실행안된다고?
		// int i = 9;
		// while (i > 10) { //조건이맞지않으면 한번도 실행안함
		// System.out.println("while : 이글이 보이나요?");
		//
		// }
		//
		// // 하지만 , 이건 달라요~
		// // int i = 9;
		// do { //조건이 맞지않아도 한번은 실행함.
		// System.out.println("do-while : 이글이 보이나요?");
		// } while (i > 10);

		// 별출력
		// *****
		// *****
		// *****
		// *****
		// *****
		//
		// int i = 1;
		// int j = 1;
		//
		// while (i++ <= 5) {
		// while (j++ <= 5) {
		// System.out.print("*");
		// }
		// j = 1;
		// System.out.print("\n");
		//
		// }
		//

		// *****
		// ****
		// ***
		// **
		// *
		//
		// int i = 1;
		// while (i <= 5)
		//
		// {
		// int j = 5;
		// while (j >= i) {
		// System.out.print("*");
		// --j;
		// }
		// ++i;
		//
		// System.out.print("\n");
		//
		// }

		// while문의 조금 다른 용도
		// Scanner sc = new Scanner(System.in);
		// while (true) {
		// System.out.println("작업할 코드를 입력하세요");
		// System.out.println("c)reate : 회원 등록");
		// System.out.println("r)ead : 회원 조회");
		// System.out.println("u)pdate : 회원 수정");
		// System.out.println("d)elete : 회원 삭제");
		// System.out.println("q)uit : 프로그램 종료");
		// System.out.println(">>>>");
		//
		// String job = sc.nextLine();
		//
		// // q가 입력되면 while문에서 나감
		// // if (job.equals("q"))
		// // break;
		//
		// switch (job) {
		// case "c":
		// System.out.println("<회원등록 메뉴를 선택>");
		// break;
		// case "r":
		// System.out.println("<회원조회 메뉴를 선택>");
		// break;
		// case "u":
		// System.out.println("<회원수정 메뉴를 선택>");
		// break;
		// case "d":
		// System.out.println("<회원삭제 메뉴를 선택>");
		// break;
		// case "q":
		// System.out.println("<<종료>>");
		// System.exit(0); // 프로그램종료
		// break;
		//
		// }
		//
		// }

		// 반복의 중단 -break;
		// int i = 1;
		// int sum = 0;
		// String fmt = " i : %d , sum : %d \n";
		// while (true) {
		// if (sum >= 100) {
		// System.out.printf(fmt, i, sum);
		// break; // 해당 if 반복문 종료
		// }
		// sum += i;
		// ++i;
		// }

		// 반복의 재시작-continue
		int i = 1;
		while (i <= 100) {
			i++;
			if (i % 2 != 0)
				continue;
			System.out.println(i);

		}

	}
}