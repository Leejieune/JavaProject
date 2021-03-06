package jieun.lab;

import java.util.Scanner;

public class Lab09 {
	public static void main(String[] args) {
		// 교재소스 5-6 , 5-10, 5-11 5-20, 5-21

		// #5-6
		// int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		// int max = score[0];
		// int min = score[0];
		//
		// for (int i = 1; i < score.length; i++) {
		// if (score[i] > max) {
		// max = score[i];
		// } else if (score[i] < min) {
		// min = score[i];
		// }
		// }
		// System.out.println("최대값 :" + max);
		// System.out.println("최소값 :" + min);

		// 5-10
		// int[] numArr = new int[10];
		//
		// for (int i = 0; i < numArr.length; i++) {
		// System.out.print(numArr[i] = (int) (Math.random() * 10));
		// }
		// System.out.println();
		//
		// for (int i = 0; i < numArr.length - 1; i++) {
		// boolean changed = false;
		//
		// for (int j = 0; j < numArr.length - 1 - i; j++) {
		// if (numArr[j] > numArr[j + 1]) {
		// int temp = numArr[j];
		// numArr[j] = numArr[j + 1];
		// numArr[j + 1] = temp;
		// changed = true;
		// }
		// }
		// if (!changed)
		// break;
		//
		// for (int k = 0; k < numArr.length; k++) {
		// System.out.print(numArr[k]);
		// }
		// System.out.println();
		// }

		// #5-11

		// int[] numArr = new int[10];
		// int[] counter = new int[10];
		//
		// for (int i = 0; i < numArr.length; i++) {
		// numArr[i] = (int) (Math.random() * 10);
		// System.out.print(numArr[i]);
		// }
		// System.out.println();
		//
		// for (int i = 0; i < numArr.length; i++) {
		// counter[numArr[i]]++;
		// }
		// for (int i = 0; i < numArr.length; i++) {
		// System.out.println(i + "의 개수 :" + counter[i]);
		// }

		// # 5-20
		// final int SIZE = 10;
		// int x = 0, y = 0;
		// char[][] board = new char[SIZE][SIZE];
		// byte[][] shipBoard = {
		// // 1 2 3 4 5 6 7 8 9
		// { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
		// { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
		// { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
		// { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
		// { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
		// { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
		// { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
		// { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
		// { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		// };
		//
		// for (int i = 1; i < SIZE; i++)
		// board[0][i] = board[i][0] = (char) (i + '0');
		// Scanner scanner = new Scanner(System.in);
		//
		// while (true) {
		// System.out.println("좌표를 입력하세요 . (종료는 00)>");
		// String input = scanner.nextLine();
		//
		// if (input.length() == 2) {
		// x = input.charAt(0) - '0';
		// y = input.charAt(1) - '0';
		//
		// if (x == 0 && y == 0)
		// break;
		// }
		//
		// if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
		// System.out.println("잘못된입력입니다. 다시 입력해주세요");
		// continue;
		// }
		//
		// board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
		//
		// for (int i = 0; i < SIZE; i++) {
		// System.out.println(board[i]);
		// }
		// System.out.println();
		// }

		// 5-21
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {

				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			System.out.printf("1~%d의 숫자를 입력하세요 . (종료 : 0)>", SIZE * SIZE);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}

		} while (num != 0);
	}

}
