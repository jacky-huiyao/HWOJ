package 合并表记录;

import java.util.Scanner;

/*
 * 等差数列
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){
			int result=(1+3*n)*n/2;
			System.out.println(result);
		}
		else{
			System.out.println(-1);
		}
	}

}
