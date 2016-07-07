/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date   :2016. 6. 20. 
 * @author :pakjkwan@gmail.com
 * @file   :AccountServiceImpl.java
 * @story  :계좌 인터페이스
*/
public class AccountServiceImpl implements AccountService {
	
	AccountDAO dao = AccountDAO.getInstance();
	private static AccountServiceImpl instance = new AccountServiceImpl();
	
	public static AccountServiceImpl getInstance() {
		return instance;
	}
	private AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String openAccount(String id) {
		AccountBean acc = new AccountBean();
		acc.setAccountNo();
		acc.setId(id);
		acc.setMoney(0);
		String msg = "";
		if (dao.insertAccount(acc)==1) {
			msg = "계좌생성 완료";
		} else {
			msg = "계좌생성 실패";
		}
		
		return msg;
	}

	@Override
	public void deposit(String depositInfo) {
		String[] arr = depositInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		
		acc.setMoney(Integer.parseInt(arr[1]));
		
	}

	@Override
	public String withdraw(int output) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNo(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int restMoney(int accNo) {
		
		return dao.selectMoney(accNo);
	}
}
