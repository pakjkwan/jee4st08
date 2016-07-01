package test;

import bank.AccountBean;

public class ReflecrtionTest2 {
	public static void main(String[] args) {
		try {
			AccountBean acc = (AccountBean) Class.forName("bank.AccountBean").newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				
		
		
		
	}
}
