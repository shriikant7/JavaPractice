package Javapractice;
import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Shrikant");
		ll.add("Balaji");
		ll.add(true);
		ll.add(34);
		ll.add(87);
		ll.add(null);
		ll.addFirst(878);
	
		int i=0;
		while( i <ll.size()) {
			System.out.println(ll.get(i));
			i++;
		}
		Iterator k = ll.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}

	}

}
