package com.mrid;

import java.util.*;

public class ArrayList_Demo {
	public static void main(String arg[]) {
		ArrayList al= new ArrayList();
		al.add(40);
		al.add(90);
		al.add(30);
		al.add("aam");	
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
