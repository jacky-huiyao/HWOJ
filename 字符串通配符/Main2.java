package ×Ö·û´®Í¨Åä·û;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		String patten="fe?ef*f";
		String str="fefefggggf";
		System.out.println(str.matches(patten.replace('?', '.')));
	}

}
