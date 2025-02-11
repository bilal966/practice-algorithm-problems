package com.xgeek.main;

import java.util.ArrayList;
import java.util.Iterator;

public class MasterCardTest{

	public static void stringAppend(String str) {
		str = str.concat( "*");
		System.out.println(str);
		
	}

	public static void bufferAppend(StringBuffer str) {
	
		str.append("#");
	
	} 
		
		public static void main(String args[]) {

		String myString = new String("cplus");
		
		StringBuffer myBuffer = new StringBuffer(" plus");
		stringAppend(myString); //plus*
		System.out.println(myString);
		bufferAppend(myBuffer); //plus#
		System.out.println(myString + myBuffer); //cplusplus#
		
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 2) {
			itr.remove();
		}
		}
		System.out.println(al.toString());
		
		}

}
