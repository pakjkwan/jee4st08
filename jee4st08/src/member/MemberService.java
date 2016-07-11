/**
 * 
 */
package member;

import java.util.List;

import global.CommonService;

/**
 * @date   :2016. 6. 17. 
 * @author :pakjkwan@gmail.com
 * @file   :StudentService.java
 * @story  :
*/
public interface MemberService extends CommonService{
	public String regist(MemberBean mem);
	public MemberBean findById(String findID);
	public String update(MemberBean stu2);
	public String delete(String string);
	public String login(MemberBean member);
	
	
}
