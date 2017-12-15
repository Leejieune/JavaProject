package jieun.lab;

public class Lab08 {
	public static void main(String[] args) {
		// 교재소스 4-26,4-27
		// 연습문제 4-4,4-8,4-13,4-14,4-15

		// *4-26
		// int sum = 0;
		// int i = 0;
		//
		// while ((sum += ++i) <= 100) {
		// System.out.printf("%d-%d\n", i, sum);
		// }

		// #4-27
		// int num;
		// int sum = 0;
		// boolean flag = true;
		// System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0)");
		//
		// while (flag) {
		// System.out.println(">>");
		//
		// Scanner scanner = new Scanner(System.in);
		// String tmp = scanner.nextLine();
		// num = Integer.parseInt(tmp);
		//
		// if (num != 0) {
		// sum += num;
		// } else {
		// flag = false;
		// }
		// }
		// System.out.println("합계:" + sum);

		// [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		// 100이상이 되는지 구하시오.
		//
		// int sum = 0;
		// int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		// int num = 0;
		// for (int i = 1; true; i++, s = -s) { // 매 반복마다 s의 값은 1, -1, 1, -1...
		// num = s * i; // i와 부호(s)를 곱해서 더할 값을 구한다.
		// sum += num;
		// if (sum >= 100) // 총합이 100보다 같거나 크면 반복문을 빠져 나간다.
		// break;
		// }
		// System.out.println("num=" + num);
		// System.out.println("sum=" + sum);

		// [4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
		// 0<=x<=10, 0<=y<=10 이다.

		// for (int x = 0; x <= 10; x++) {
		// for (int y = 0; y <= 10; y++) {
		// if (2 * x + 4 * y == 10) {
		// System.out.println("x=" + x + ", y=" + y);
		// }
		// }
		// }

		// [4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
		// 은 코드를 넣어서 프로그램을 완성하시오.

		// String value = "12sss34";
		// char ch = ' ';
		// boolean isNumber = true;
		// // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// // 하나씩 읽어서 검사한다.
		// for (int i = 0; i < value.length(); i++) {
		// ch = value.charAt(i);
		// if (!('0' <= ch && ch <= '9')) {
		// isNumber = false;
		// break;
		// }
		// }
		// if (isNumber) {
		// System.out.println(value + "는 숫자입니다.");
		// } else {
		// System.out.println(value + "는 숫자가 아닙니다.");
		// }

		// [4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
		// 해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
		// 신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
		// 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
		// 로그램을 완성하시오.

		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		// int answer = (int) (Math.random() * 100) + 1;
		// int input = 0; // 사용자입력을 저장할 공간
		// int count = 0; // 시도횟수를 세기위한 변수
		// // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		// Scanner s = new Scanner(System.in);
		// do {
		// count++;
		// System.out.print("1과 100사이의 값을 입력하세요 :");
		// input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
		// if (answer > input) {
		// System.out.println("더 큰 수를 입력하세요.");
		// } else if (answer < input) {
		// System.out.println(" 작은 수를 입력하세요.");
		// } else {
		// System.out.println("맞췄습니다.");
		// System.out.println("시도횟수는 " + count + "번입니다.");
		// break; // do-while문을 벗어난다
		// }
		// } while (true); // 무한반복문

		// [4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
		// 어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
		// 다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		while (tmp != 0) {
			result = result * 10 + tmp % 10; // 기존 결과에 10을 곱해서 더한다.
			tmp /= 10;
		}
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}

}
