package member;

public class MemberServiceImpl implements MemberService{
	
	MemberDAO dao = MemberDAO.getInstance();
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}

	
	private MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		String sql = "insert into member(id,pw,name,reg_date,ssn)"
				+ "values('"+mem.getId()+"','"+mem.getPw()+"','"+mem.getName()
				+"','"+mem.getRegDate()+"','"+mem.getSsn()+"')";
		int result = dao.exeUpdate(sql);
		if (result==1) {
			msg = "회원가입 축하합니다";
		} else {
			msg = "회원가입 실패";
		}
		return msg;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String pw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
/*
String sqlCreate = "create table member("
			+ "id varchar2(20) primary key,"
			+ "pw varchar2(20),"
			+ "name varchar2(20),"
			+ "reg_date varchar2(20),"
			+ "ssn varchar(10)"
			+ ")";
	String sqlDrop = "drop table member";
*/