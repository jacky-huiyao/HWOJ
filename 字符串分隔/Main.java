package ×Ö·û´®·Ö¸ô;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		for(int i=0;i<s1.length()%8;i++){
			s1+="0";
		}
		for(int i=0;i<s2.length()%8;i++){
			s2+="0";
		}
		s1=s1+s2;
		for(int i=0;i<s1.length()/8;i++){
			System.out.println(s1.substring(i*8,i*8+8 ));
		}
	}

}
