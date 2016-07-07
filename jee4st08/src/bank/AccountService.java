/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date   :2016. 6. 20. 
 * @author :pakjkwan@gmail.com
 * @file   :AccountService.java
 * @story  :
*/
public interface AccountService {
	// 1개설 2입금 3조회 4출금 5통장내역 6해지
		
		// 1개설
		public String openAccount(String id);
		// 2입금
		public void deposit(String depositInfo);
		// 3출금
		public String withdraw(int output);
		// 4.수정 .. 사용자의 요청에 의해 비번만 전환가능
		public String updateAccount(AccountBean acc);
		// 5해지
		public void deleteAccount();
		// 6조회(전체)
		public List<AccountBean> accountList();
		// 7조회(계좌번호)
		public AccountBean findByAccountNo(String accNo);
		// 8조회(이름)
		public List<AccountBean> findByName(String name);
		// 9조회(전체통장수)
		public int count();
		// 원래 요구사항에는 없었지만.. 필요에 따라 생성하는 메소드
		public int restMoney(int accNo);
		
}
