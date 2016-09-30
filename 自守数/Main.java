package ×ÔÊØÊı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(CalcAutomorphicNumbers(n));
	}

	private static int CalcAutomorphicNumbers(int n) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=0;i<n;i++){
			int a=i;
			int b=i*i;
			while(a>0 && (a%10==b%10)){
				a/=10;
				b/=10;
			}
			if(a==0){
				cnt++;
			}
		}
		return cnt;
	}

}
