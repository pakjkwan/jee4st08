/**
 * 
 */
package member;

import javax.swing.JOptionPane;


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
			switch (JOptionPane.showInputDialog(""
					+ "--- 회원이 보는 화면 ---\n"
					+ "1회원가입 2로그인 3내정보보기(detail) 4내정보수정(비번) 5탈퇴 0종료\n"
					+ "--- 관리자 화면 ---\n"
					+ "11회원목록 12검색(ID) 13검색(이름) 14회원수(성별) 15회원수 ")) {
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
				MemberBean stu4 = new MemberBean();
				String input4 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr4 = input4.split(",");
				stu4.setId(inputArr4[0]);
				stu4.setPw(inputArr4[1]);
				String result4 = service.login(stu4);
				JOptionPane.showMessageDialog(null, result4);
				break;
			case "4":
				MemberBean stu2 = new MemberBean();
				String input2 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr2 = input2.split(",");
				stu2.setId(inputArr2[0]);
				stu2.setPw(inputArr2[1]);
				service.update(stu2);
				break;
			case "5":
				break;
			case "11":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "12":
				String findID = JOptionPane.showInputDialog("조회할 ID");
				JOptionPane.showMessageDialog(null, service.findById(findID));
				break;
			case "14":break;
			case "15":
				int count = service.count();
				JOptionPane.showMessageDialog(null, count);
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
