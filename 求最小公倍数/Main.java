package 求最小公倍数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a*b/gcd(a,b));
	}

	public static int gcd(int a,int b){
		int t=0;
		if(a<b){
			t=a;
			a=b;
			b=t;
		}
		while(b>0){
			t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
}
