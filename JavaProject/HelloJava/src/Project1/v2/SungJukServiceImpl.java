package Project1.v2;

import java.util.ArrayList;
import java.util.List;

import Project1.v1.SungJukVO;;

public class SungJukServiceImpl implements SungJukService {

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}

	@Override
	public void addSungJuk(SungJukVO sj) {
		// TODO Auto-generated method stub
		processSungJuk(sj); // 성적처리-총점,평균,학점
		sjdb.add(sj);
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d\n";
		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}
		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		return "";
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		// TODO Auto-generated method stub
		System.out.println("새로운 성적데이터가 수정되었습니다.");

	}

	@Override
	public void removeSungJuk(int no) {
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
