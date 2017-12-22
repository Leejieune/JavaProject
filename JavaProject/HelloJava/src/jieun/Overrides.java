package jieun;

public class Overrides {

	public static void main(String[] args) {
		// 메서드 오버라이드
	}

}

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() { // 총점
		return kor + eng + mat;
	}

	public double getAverage() {
		// 1.
		double avg = ((double) kor + eng + mat) / 3;
		return avg;
		// 2
		// return (double)getTotal()/3;
	}

	public char getGrade() {
		double avg = ((double) kor + eng + mat) / 3;
		char grd = '가';
		switch ((int) avg / 10) {

		}
		return grd;
	}

}

class MidSungJuk2 extends SungJuk2 {
	protected int sci;
	protected int art;

	@Override // 매서드 재정의
	public int getTotal() {
		// return kor + eng + mat + sci + art;
		int tot = super.getTotal() + sci + art;
		return tot;
	}

	@Override // 매서드 재정의
	public double getAverage() {
		// double avg = (double) (kor + eng + mat + sci + art) / 5;
		double avg = getTotal() / 5;

		return avg;
	}

	@Override // 매서드 재정의
	public char getGrade() {
		// double avg = (double) (kor + eng + mat + sci + art) / 5;
		int avg = (int) getAverage() / 10;
		char grd = 'F';

		switch (avg) {
		case 10:
		case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		}

		return grd;

	}

}
