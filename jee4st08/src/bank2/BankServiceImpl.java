package bank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BankServiceImpl implements BankService{
	
	List<AccountBean> list;

	public BankServiceImpl() {
		list = new Vector<AccountBean>();
	}
	
	@Override
	public void openAccount(AccountBean acc) {
		// 11개설(은행창구개설)
		list.add(acc);
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public AccountBean findByAccountNo(String accNo) {
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			String temp = String.valueOf(list.get(i).getAccountNo());
			if (temp.equals(accNo)) {
				acc = list.get(i);
				break;
			}
		}
		
		/*
		 for (int i = 0; i < list.size(); i++) {
			if (accNo.equals(String.valueOf(list.get(i).getAccountNo()))) {
				result = list.get(i).toString();
				break;
			}
		}
		 * */
		System.out.println("리턴직전 계좌:"+acc);
		return acc;
		
	}

	@Override
	public List<AccountBean> findByName(String name) {
		List<AccountBean> list = new ArrayList<AccountBean>();
		System.out.println("컨트롤러에서 넘어온 이름:"+name);
		for (int i = 0; i < this.list.size(); i++) {
			if (name.equals(this.list.get(i).getName())) {
				list.add(this.list.get(i));
			}
		}
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public int count() {
		// 15계좌수
		return list.size();
	}

	

	@Override
	public String updateAccount(AccountBean acc) {
		// 15
		System.out.println("넘어온 수정정보:"+acc);
		String result = "";
		AccountBean temp = this.findByAccountNo(String.valueOf(acc.getAccountNo()));
		if (temp.getId()==null) {
			result = "계좌번호가 존재하지 않습니다";
		} else {
			temp.setPw(acc.getPw());
			result = "비밀번호가 변경되었습니다";
		}
		return result;
	}

	@Override
	public String deleteAccount(String accNo) {
		// 16
		String result = "";
		AccountBean temp = this.findByAccountNo(accNo);
		if (temp.getId()==null) {
			result = "계좌번호가 존재하지 않습니다";
		} else {
			list.remove(temp);
			result = "비밀번호가 변경되었습니다";
		}
		return result;
	}

}
