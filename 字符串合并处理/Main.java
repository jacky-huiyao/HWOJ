package 字符串合并处理;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(processString(s1,s2));
	}
	
	public static String processString(String s1,String s2){
		String result=s1+s2;
		result=sort(result,0,2);
		result=sort(result,1,2);
		return encode(result);
	}
	
	public static String sort(String s,int start,int dist){
		String result="";
		char[] ch=s.toCharArray();
		for(int i=start;i<s.length();i+=dist){
			for(int j=i+dist;j<s.length();j+=dist){
				if(ch[j]<ch[i]){
					char tmp=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp;
				}
			}
		}
		return String.valueOf(ch);
	}
	
	public static String encode(String s){
		String result="";
		int num;
		for(char c:s.toCharArray()){
			num=-1;
			if(Character.isDigit(c)){
				num=c-'0';
			}
			else if(c>='a' && c<='f'){
				num=c-'a'+10;
			}
			else if(c>='A' && c<='F'){
				num=c-'A'+10;
			}
			if(num>=0){
				num=((num & 1)<<3)+((num & 8)>>3)+((num & 2)<<1)+((num & 4)>>1);
				if(num>9){
					result+=(char) ('A'+num-10);
				}
				else{
					result+=(char)('0'+num);
				}
			}
			else{
				result+=c;
			}
		}
		return result;
	}
}
