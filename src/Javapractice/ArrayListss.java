package Javapractice;

import java.util.*;

public class ArrayListss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList al = new ArrayList();
       al.add("Shrikant");
       al.add(34);
       al.add(45);
       al.add(true);
       al.add(3.43);
       al.add('d');
       
       System.out.println(al);
      // System.out.println(al.get(2));
       //al.remove(2);
       //System.out.println(al);
      // System.out.println(al.get(2));
      // System.out.println(al.indexOf('d'));
       //System.out.println(al.get(2));
       //System.out.println(al.add("MS"));
     
      // System.out.println();
       int i = 0;
       
       while( i < al.size()) {
    	   System.out.println(al.get(i));
    	   i++;
       }
       for(int j=0; j< al.size(); j++) {
    	   System.out.println(al.get(j));
       }
       
       Iterator k = al.iterator();
       while( k.hasNext()) {
    	   System.out.println(k.next());
       }
       
	}

	

}
