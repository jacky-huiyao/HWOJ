package ×Ö·û´®Æ¥Åä;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String shortStr=sc.next();
		String longStr=sc.next();
		System.out.println(isAllCharExist(shortStr, longStr));
	}
	
	static boolean isAllCharExist(String shortStr,String longStr){
		int[] ch=new int[256];
		for(int i=0;i<longStr.length();i++){
			ch[longStr.charAt(i)]=1;
		}
		for(int i=0;i<shortStr.length();i++){
			if(ch[shortStr.charAt(i)]!=1){
				return false;
			}
		}
		return true;
	}

}
