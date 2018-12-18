package com.example.demospringboot;

import java.util.HashMap;
import java.util.Map;

public class DateFormatExample {
	public static void main(String[] args) {
		String d1 = "30/11/2018";
		System.out.println(d1);

		myformatter(d1);
	}

	private static void myformatter(String d1) {
		
		Map<Integer, String> month = new HashMap<Integer, String>();
		month.put(1, "Jan");
		month.put(2, "Feb");
		month.put(3, "Mar");
		month.put(4, "Apr");
		month.put(5, "May");
		month.put(6, "Jun");
		month.put(7, "Jul");
		month.put(8, "Aug");
		month.put(9, "Sep");
		month.put(10, "Oct");
		month.put(11, "Nov");
		month.put(12, "Dec");
		
		String[] split = d1.split("/");
		System.out.println(split[0] + " " + month.get(Integer.parseInt(split[1])) + " " + split[2]);
		
	}

}
