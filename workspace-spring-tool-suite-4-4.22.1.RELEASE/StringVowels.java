package com.demo;

import java.util.Scanner;

public class StringVowels {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a sentence");
		String str = scan.nextLine();
		char[] ch = {'a','e','i','o','u'};
		int n=0;
		char [] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<ch.length;j++) {
			if(arr[i]==ch[j]);
		}
		System.out.println(n);
		}

  }
}