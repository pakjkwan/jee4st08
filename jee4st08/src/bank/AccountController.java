package bank;

import java.util.List;
import javax.swing.JOptionPane;
/**
 * @date   :2016. 6. 15. 
 * @author :pakjkwan@gmail.com
 * @file   :BankController.java
 * @story  :
*/
public class AccountController {
	public static void main(String[] args) {
		AccountService service = AccountServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "1개설 2입금 3출금 4수정 5해지"
					+ "6전제조회 7조회(계좌) 8조회(이름) 9통장수 0종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("ID");
				String msg = service.openAccount(id);
				JOptionPane.showMessageDialog(null, msg);
				break;
			case "2":
				String depositInfo = JOptionPane.showInputDialog("계좌,입금액");
				service.deposit(depositInfo);
				break;
			case "3":break;
			case "4":break;
			case "5":break;
			case "6":break;
			case "7":break;
			case "8":break;
			case "9":break;
			case "0":return;

			default:
				break;
			}
		}
	
	}
}
