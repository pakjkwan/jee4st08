package grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeServiceImpl implements GradeService {
 GradeDAO dao = GradeDAO.getInstance();
 private static GradeServiceImpl instance = new GradeServiceImpl();
 public static GradeServiceImpl getInstance() {
	return instance;
}
private GradeServiceImpl() {
	// TODO Auto-generated constructor stub
}
	@Override
	public int insert(GradeBean grade) {
		return dao.insert(grade);
	}

	@Override
	public int update(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GradeBean> list() {
		List<GradeBean> list = dao.list();
		return list;
	}

	@Override
	public List<GradeBean> findById(String id) {
		
		return null;
	}

	@Override
	public GradeBean findBySeq(String seq) {
		return dao.findBySeq(seq);
	}

	@Override
	public int count(String examDate) {
		// TODO Auto-generated method stub
		return dao.count(examDate);
	}
	@Override
	public void score(String[] a) {
		// id,date,java,sql,html,js
		GradeBean g = new GradeBean();
		g.setId(a[0]);
		g.setExamDate(a[1]);
		g.setJava(Integer.parseInt(a[2]));
		g.setSql(Integer.parseInt(a[3]));
		g.setHtml(Integer.parseInt(a[4]));
		g.setJavascript(Integer.parseInt(a[5]));
		this.insert(g);
	}
	

}
