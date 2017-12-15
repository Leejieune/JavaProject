package jieun.lab;

public class Lap10 {
	public static void main(String[] args) {
		// 교재연습문제 5-1 5-4 5-5 5-10
		// [5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
		// 하시오.
		// int[] arr[];
		// int[] arr1 = { 1, 2, 3, };
		// int[] arr2 = new int[5];
		// //int[] arr3 = new int[5] { 1, 2, 3, 4, 5 };
		// //int arr4[5];
		// int[] arr5[] = new int[3][];
		// [5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		// int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20,
		// 20 }, { 30, 30, 30, 30, 30 } };
		// int total = 0;
		// float average = 0;
		//
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// total += arr[i][j];
		// }
		// }
		// average = total / (float) (arr.length * arr[0].length);
		// System.out.println("total=" + total);
		// System.out.println("average=" + average);

		// [5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
		// 로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		// int[] ballArr = {1,2,3,4,5,6,7,8,9};
		// int[] ball3 = new int[3];
		// // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		// for(int i=0; i< ballArr.length;i++) {
		// int j = (int)(Math.random() * ballArr.length);
		// int tmp = 0;
		// tmp = ballArr[i];
		// ballArr[i] = ballArr[j];
		// ballArr[j] = tmp;
		// }
		// // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		// System.arraycopy(ballArr,0, ball3,0,3);
		// for(int i=0;i<ball3.length;i++) {
		// System.out.print(ball3[i]);
		// }
		// System.out.println();

		// [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		// (1)에 알맞은 코드를 넣어서 완성하시오.
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if ('a' <= ch && ch <= 'z') {
				result += abcCode[ch - 'a'];
			} else if ('0' <= ch && ch <= '9') {
				result += numCode[ch - '0'];
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}

}
