package com.demo;

import java.util.Arrays;

public class StringManipulation {
 public static void main(String args[]) {
	 String name = "hello ";
	 String obj = new String("hello");
	 System.out.println(name==obj);
	 System.out.println(name.equals(obj));
	 System.out.println(name.toUpperCase());
	 System.out.println(name.toLowerCase());
	 char a=name.charAt(0);
	 System.out.println(name.charAt(0));
	 System.out.println(a);
	 System.out.println(name.indexOf('l',3));
	 System.out.println(name.lastIndexOf('e'));
//	 System.out.println(name.substring(0,3));
//	 char[] b = name.toCharArray();
//	 System.out.println(name.toCharArray());
//	 System.out.println(b);
//	 System.out.println(name.split("a"));
//	 String[] d=name.split("");
//	 System.out.println(Arrays.toString(d));
//	 System.out.println(name.trim());
//	 System.out.println(name.isBlank());
//	 System.out.println(name.isEmpty());
//	 System.out.println(name.concat("ww"));
//	 System.out.println(name.replace('l' , '*'));
//	 System.out.println(name.replaceAll("(.*)h(.*)","welcome"));
//	 
 }
}
