package jieun.lab;

public class SungJukVO {

	// V0 클래스 -value object
	// 값만 저장하는 특수한 클래스

	// 멤버변수(private 으로 선언!)
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avrg;
	private String grd;

	// 생성자
	public SungJukVO(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public SungJukVO() {
		// TODO Auto-generated constructor stub
	}

	// toString
	@Override // 겹치다
	public String toString() {
		return "SungJukVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avrg="
				+ avrg + "]";
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvrg() {
		return avrg;
	}

	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}

	public String getGrd() {
		return grd;
	}

	public void setGrd(String grd) {
		this.grd = grd;
	}

}
