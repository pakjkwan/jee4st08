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
		MemberService serice = new MemberServiceImpl();
		MemberBean stu = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2보기 3수정 4삭제 0종료")) {
			case "1":
				stu = new MemberBean(JOptionPane.showInputDialog("ID"),
						JOptionPane.showInputDialog("PW"),
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("주민번호"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, stu.toString());
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
