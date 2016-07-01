/**
 * 
 */
package member;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * @date   :2016. 6. 16. 
 * @author :pakjkwan@gmail.com
 * @file   :SchoolController.java
 * @story  :
*/
public class MemberController {
	public static void main(String[] args) { // String[] params
		MemberService service = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2보기 3수정 4삭제 0종료")) {
			case "1":
				MemberBean stu = new MemberBean();
				String input = JOptionPane.showInputDialog("ID,PW,NAME,SSN");
				String[]inputArr = input.split(",");
				stu.setId(inputArr[0]);
				stu.setPw(inputArr[1]);
				stu.setName(inputArr[2]);
				stu.setSsn(inputArr[3]);
				String result = service.regist(stu);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
