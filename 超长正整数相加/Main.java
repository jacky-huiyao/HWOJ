package 超长正整数相加;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.println(add(a,b));
	}

	private static String add(String a, String b) {
		// TODO Auto-generated method stub
		int m=a.length()-1;
		int n=b.length()-1;
		int over=0;
		String result="";
		for(;m>=0 && n>=0;m--,n--){
			int sum=a.charAt(m)-'0'+b.charAt(n)-'0'+over;
			over=0;
			if(sum>9){
				over=1;
				result=(char)(sum-10+'0')+result;
			}
			else{
				result=(char) (sum+'0')+result;
			}
		}
		while(m>=0){
			int sum=a.charAt(m--)-'0'+over;
			over=0;
			if(sum>9){
				over=1;
				result='0'+result;
			}
			else{
				result=(char) (sum+'0')+result;
			}
		}
		while(n>=0){
			int sum=b.charAt(n--)-'0'+over;
			over=0;
			if(sum>9){
				over=1;
				result='0'+result;
			}
			else{
				result=(char) (sum+'0')+result;
			}
		}
		if(over>0){
			result='1'+result;
		}
		return String.valueOf(result);
	}
	

}
