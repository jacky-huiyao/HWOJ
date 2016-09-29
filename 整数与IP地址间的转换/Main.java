package 整数与IP地址间的转换;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(translate(s1));
		System.out.println(inverstranslate(s2));
	}
	
	static boolean verify(String s){
		int dotcnt=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='0' && c<='9'){
				continue;
			}
			else if(c=='.'){
				dotcnt++;
			}
			else{
				return false;
			}
		}
		if(dotcnt==3){
			return true;
		}
		return false;
		
	}
	
	static int translate(String s){
		if(!verify(s)){
			return -1;
		}
		String[] ip=s.split("\\.");
		int result=0;
		for(int i=0;i<4;i++){
			int v=Integer.valueOf(ip[i]);
			if(v>=0 && v<255){
				result+=v<<(24-8*i);
			}
		}
		return result;
	}
	
	static String inverstranslate(String s){
		int n=Integer.valueOf(s);
		String result="";
		for(int i=3;i>=0;i--){
			result+=(n & (255 <<(8*i)))>>(8*i);
			result+=".";
		}
		return result.substring(0,result.length()-1);
	}
	
}
