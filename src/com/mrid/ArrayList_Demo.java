package com.mrid;

import java.util.*;

public class ArrayList_Demo {
	public static void main(String arg[]) {
		ArrayList al= new ArrayList();
		al.add(40);
		al.add(90);
		al.add(30);
		al.add("aram");	
		
		ArrayList al1 = new ArrayList();
		al1.add(2);
		al1.add(5);
		al1.addAll(al);
		System.out.println(al1);
	}

}
