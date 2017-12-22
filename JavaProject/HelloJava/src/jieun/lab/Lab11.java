package jieun.lab;

public class Lab11 {
	// @SuppressWarnings("unused")
	public static void main(String[] args) {
		// 프린트 31,32,35
		// # 31.임의의 숫자 6자리를 입력하면 신용카드의 종류와 은행정보를 출력하는 프로그램을 작성해보세요
		// Scanner sc = new Scanner(System.in);
		// System.out.println("6자리 카드번호를입력하세요");
		// String card = sc.nextLine();
		//
		// // 카드정보판별
		// char ctype = card.charAt(0);
		// String ctmsg = "카드정보 없음";
		//
		// if (ctype == '3' && card.charAt(1) == '5') {
		// ctmsg = "JCB 카드";
		// } else if (ctype == '4')
		// ctmsg = "Visa 카드";
		// else if (ctype == '5')
		// ctmsg = "Master 카드";
		//
		// // 은행 정보 판별
		// String bank = " 은행 정보 없음 ";
		// switch (card) {
		// case "356317":
		// bank = "NH 농협카드";
		// break;
		// case "356901":
		// bank = "신한 카드";
		// break;
		//
		// }
		//
		// System.out.printf("%s %s", ctmsg, bank);

		// ## 32 주민번호 검증하기
		String jumin = "9502212111111";

		// a. 가중치 적용 및 합산
		int sum = 0;
		int jcode = 0;

		// sum += (jumin.charAt(0) - 48) * 2;
		// sum += (jumin.charAt(1) - 48) * 3;
		// sum += (jumin.charAt(2) - 48) * 4;
		// sum += (jumin.charAt(3) - 48) * 5;
		// sum += (jumin.charAt(4) - 48) * 6;
		// sum += (jumin.charAt(5) - 48) * 7;
		// sum += (jumin.charAt(6) - 48) * 8;
		// sum += (jumin.charAt(7) - 48) * 9;
		// sum += (jumin.charAt(8) - 48) * 2;
		// sum += (jumin.charAt(9) - 48) * 3;
		// sum += (jumin.charAt(10) - 48) * 4;
		// sum += (jumin.charAt(11) - 48) * 5;

		for (int i = 0, j = 2; i <= 11; ++i, ++j) {
			if (i == 8) {
				j = 2;
			}
			jcode = (jumin.charAt(i) - 48);
			sum += jcode * j;

		}
		// 나머지 계산
		// int check = sum % 11;

		// 마지막 자릿수와 비교
		String msg = "주민번호 검증 실패!";
		//
		// if (check > 9) {// 나머지가 2자리수 라면
		// if (check % 10 == jumin.charAt(12) - 48)
		// msg = " 주민번호 검증 성공!";
		//
		// } else if ((11 - check) == jumin.charAt(12) - 48)
		// msg = " 주민번호 검증 성공!";

		// 11로 나눈 나머지 구한후
		// 11에서 이것을 빼고 맨 마지막자리추출
		int check = (11 - (sum % 11)) % 10;

		if (check == jumin.charAt(12) - 48)
			msg = " 주민번호 검증 성공!";
		// 결과 출력
		System.out.println(msg);
	}

}
