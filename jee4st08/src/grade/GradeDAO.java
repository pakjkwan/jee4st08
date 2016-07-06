package grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class GradeDAO {
	Connection con;
	ResultSet rs;
	Statement stmt;
	PreparedStatement pstmt;
	private static GradeDAO instance = new GradeDAO();
		public static GradeDAO getInstance() {
		return instance;
	}

	private GradeDAO() {
		con = DatabaseFactory
				.createDatabase(Vendor.ORACLE, 
						Constants.USER_ID, 
						Constants.USER_PW)
				.getConnection();
	}

	public int insert(GradeBean g){
		int result = 0;
		String sql="insert into grade(seq,grade,java,sql,html,javascript,id,exam_date)"
				+ "values(seq.nextval,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, g.getGrade());
			pstmt.setInt(2, g.getJava());
			pstmt.setInt(3,g.getSql());
			pstmt.setInt(4, g.getHtml());
			pstmt.setInt(5, g.getJavascript());
			pstmt.setString(6, g.getId());
			pstmt.setString(7, g.getExamDate());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<GradeBean> list() {
		List<GradeBean> list = new ArrayList<GradeBean>();
		String sql = "select * from grade";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				GradeBean g = new GradeBean();
				g.setSeq(String.valueOf(rs.getInt("SEQ")));
				g.setId(rs.getString("ID"));
				g.setExamDate(rs.getString("EXAM_DATE"));
				g.setGrade(rs.getString("GRADE"));
				g.setJava(rs.getInt("JAVA"));
				g.setHtml(rs.getInt("HTML"));
				g.setJavascript(rs.getInt("JAVASCRIPT"));
				g.setSql(rs.getInt("SQL"));
				list.add(g);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int count(String examDate) {
		int result = 0;
		String sql = "select count(*) as count from grade "
				+ "where exam_date = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, examDate);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("count");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public GradeBean findBySeq(String seq) {
		GradeBean bean = new GradeBean();
		String sql = "select * from grade where seq = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(seq));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bean.setExamDate(rs.getString("EXAM_DATE"));
				bean.setGrade(rs.getString("GRADE"));
				bean.setHtml(rs.getInt("HTML"));
				bean.setId(rs.getString("ID"));
				bean.setJava(rs.getInt("JAVA"));
				bean.setJavascript(rs.getInt("JAVASCIRPT"));
				bean.setSeq(String.valueOf(rs.getInt("SEQ")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}
	
}
	
