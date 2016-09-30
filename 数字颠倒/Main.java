package Êý×Öµßµ¹;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		reversePrint(sc.next());
	}
	
	static void reversePrint(String s){
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			result+=s.charAt(i);
		}
		System.out.println(result);
	}
}
