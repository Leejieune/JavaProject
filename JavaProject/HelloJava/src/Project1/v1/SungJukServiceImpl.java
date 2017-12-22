package Project1.v1;

public class SungJukServiceImpl implements SungJukService {

	@Override
	public void addSungJuk(SungJukVO sj) {
		// TODO Auto-generated method stub
		processSungJuk(sj); // 성적처리-총점,평균,학점
		System.out.println("새로운 성적데이터가 추가되었습니다.");

	}

	@Override
	public String getSungJuk() {
		String out = "성적데이터 출력합니다.";
		return out;
	}

	@Override
	public String getSungJuk(String name) {
		return name;
	}

	@Override
	public void modifySungJuk(SungJukVO sj) {
		// TODO Auto-generated method stub
		System.out.println("새로운 성적데이터가 수정되었습니다.");

	}

	@Override
	public void removeSungJuk(String name) {
		// TODO Auto-generated method stub
		System.out.println("새로운 성적데이터가 삭제되었습니다.");

	}

	private void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		}

		sj.setTot(tot);
		sj.setAvg(avg);
		sj.setGrd(grd);

	}
}
