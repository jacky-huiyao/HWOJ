package ×Ö·û´®Í¨Åä·û;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String patten=sc.next();
		String str=sc.next();
		System.out.println(match(str,0,patten,0));
	}
	static boolean result;
	static boolean match(String str,int start1,String patten,int start2){
		if(start1==str.length() && (start2==patten.length() || (start2==patten.length()-1 && patten.charAt(start2)=='*'))){
			result=true;
		}
		if(start1==str.length() || start2==patten.length()){
			return result;
		}
		if(str.charAt(start1)==patten.charAt(start2) || patten.charAt(start2)=='?'){
			match(str,start1+1,patten,start2+1);
		}
		if(result || patten.charAt(start2)=='*'){
			//Æ¥Åä0¸ö×Ö·û
			match(str,start1,patten,start2+1);
			//Æ¥Åä¶à¸ö×Ö·û
			match(str,start1+1,patten,start2);
		}
		return result;
	}
}
