package ±íÊ¾Êý×Ö;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(MarkNum(str));
	}
	
	public static String MarkNum(String str)
	 {
		boolean isNumNow=false;
		String result="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isDigit(ch)){
				if(isNumNow){
					result+=ch;
				}
				else{
					result+="*"+ch;
					isNumNow=true;
				}
			}
			else{
				if(isNumNow){
					result+="*"+ch;
					isNumNow=false;
				}
				else{
					result+=ch;
				}
			}
		}
		if(isNumNow){
			result+="*";
		}
		return result;
	 }
}
