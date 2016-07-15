package test;

import java.util.ArrayList;

public class Test2Loop {
	public static void main(String[] args) {
		ArrayList<Contact> list = new ArrayList<Contact>();
        String[][] target = {
                {"a1","a2","a3","1"},
                {"b1","b2","b3","2"},
                {"c1","c2","c3","3"},
                {"d1","d2","d3","4"},
                {"e1","e2","e3","5"}
        };
       /* Contact p = new Contact();
        p.setName(target[0][0]);
        p.setEmail(target[0][1]);
        p.setPhoneNo(target[0][2]);
        p.setPhoto(target[0][3]);
        System.out.println(p);*/
        
        for(int i=0;i<target.length;i++){
        	 Contact people = new Contact();
        	int j=0;
            while(j<target[i].length){
            	j=0;
                people.setName(target[i][j]);
                j++;
                people.setEmail(target[i][j]);
                j++;
                people.setPhoneNo(target[i][j]);
                j++;
                people.setPhoto(target[i][j]);
                j++;
            }
            list.add(people);
        }
        System.out.println(list);
	}
}
