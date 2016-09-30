package ¼ÆËã×Ö·û¸öÊý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=sc.next().charAt(0);
		System.out.println(countChar(s, ch));
	}
	
	static int countChar(String s,char ch){
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(ch))
				cnt++;
		}
		return cnt;
		
	}

}
