package bank;

import java.util.List;
import javax.swing.JOptionPane;

import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;
/**
 * @date   :2016. 6. 15. 
 * @author :pakjkwan@gmail.com
 * @file   :BankController.java
 * @story  :
*/
public class AccountController {
	public static void main(String[] args) {
		AccountService service = AccountServiceImpl.getInstance();
		MemberService memberService = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "1개설 2입금 3출금 4비번수정 5해지"
					+ "6전제조회 7조회(계좌) 8조회(이름) 9통장수 10로그인 0종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("ID");
				String msg = service.openAccount(id);
				JOptionPane.showMessageDialog(null, msg);
				break;
			case "2":
				String depositInfo = JOptionPane.showInputDialog("계좌,입금액");
				service.deposit(depositInfo);
				break;
			case "3":
				String withdrawInfo = JOptionPane.showInputDialog("계좌,출금액");
				service.withdraw(withdrawInfo);
				break;
			case "4":
				MemberBean stu2 = new MemberBean();
				String input2 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr2 = input2.split(",");
				stu2.setId(inputArr2[0]);
				stu2.setPw(inputArr2[1]);
				memberService.update(stu2);
				break;
			case "5":break;
			case "6":
				BankUI ui = new BankUI();
				break;
			case "7":break;
			case "8":break;
			case "9":break;
			case "10":
				
				break;
			case "0":return;

			default:
				break;
			}
		}
	
	}
}
