package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class AccountDAO {
	private static AccountDAO instance = new AccountDAO();
	private Connection con;
	private ResultSet rs;
	private PreparedStatement pstmt;
	private AccountDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE,
				Constants.USER_ID, Constants.USER_PW).getConnection();
	}
	public static AccountDAO getInstance() {
		return instance;
	}
	public int insertAccount(AccountBean acc) {
		int result = 0; 
		String sql = "insert into account (id, account_no, money) "
				+ "values (?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, acc.getId());
			pstmt.setInt(2, acc.getAccountNo());
			pstmt.setInt(3, acc.getMoney());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int selectMoney(int accNo) {
		int money = 0;
		String sql = "select money from account "
				+ "where account_no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				money = rs.getInt("MONEY");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return money;
	}
	public void deposit(AccountBean acc) {
		String sql = "update account set money = ?"
				+ "where account_no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, acc.getMoney());
			pstmt.setInt(2, acc.getAccountNo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void withdraw(AccountBean acc) {
		this.deposit(acc);
	}
}
