package 尼科彻斯定理;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=n*n+1-n;
		String result="";
		for(int i=0;i<n-1;i++){
			result+=start+"+";
			start+=2;
		}
		result+=start;
		System.out.println(result);
	}
}
