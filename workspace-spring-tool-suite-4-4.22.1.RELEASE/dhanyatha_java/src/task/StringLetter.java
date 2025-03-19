package com.demo;
import java.util.Scanner;

public class StringLetter {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.next();
		System.out.println("enter a character");
		char ch = scan.next().charAt(0);
		int n=0;
		char [] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch)
				n++;
		}
		System.out.println(n);
		}	
	}
	 