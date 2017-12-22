package jieun;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) throws SQLException {
		// 예외처리

		int[] intArray = { 9, 8, 7, 6, 5 };
		System.out.println(intArray[2]);

		try {
			System.out.println(intArray[5]);
		} catch (Exception ex) {
			System.out.println("오류발생!@");

			// System.out.println(ex.getMessage());
			// ex.printStackTrace();
		}
		try {
			// unchecked 예외-개발자가 직접인지하고 예외처리
			int x = 1000 / 0;
		} catch (Exception ex) {
			System.out.println("0으로 나누면 안돼요!");
			System.out.println(ex.getMessage());
		}

		// checked 예외 =컴파일러가 미리 예외처리에 대한 정보알림
		String fpath = "c:/Java/abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일관련 예외발생");
		}

		// 예외처리 좋은 예
		Scanner sc = new Scanner(System.in);
		int key = 999;
		while (true) {
			System.out.println("숫자만 입력하세요!");

			try {
				key = sc.nextInt();
				if (key == 0)
					break;
			} catch (Exception ex) {
				System.out.print("문자는 입력하지마세요!");
				// 무한반복방지
				sc = new Scanner(System.in);
			}
		}
		sc.close();

		// 데이터베이스 서버 접속코드 -checked 예외
		// throws 구문으로 이 메서드를 호출한 상위 메서드로
		// 예외처리를 던짐(처리를 대신해달라고 떠넘김)
		DriverManager.getConnection("");

		System.out.println("이글이 보이나요?");
	}
}