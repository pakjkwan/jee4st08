package bank;

import java.util.Comparator;

public class NameAscSort implements Comparator<AccountMemberBean>{

	@Override
	public int compare(AccountMemberBean first, 
			AccountMemberBean second) {
		return first.getName().compareTo(second.getName());
	}

}
