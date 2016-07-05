package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
}
	
