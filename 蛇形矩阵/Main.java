package ÉßĞÎ¾ØÕó;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		GetResult(n);
	}

	public static void GetResult(int n){
		int[][] result=new int[n][n];
		int count=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				result[i-j][j]=count++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println(result[i][n-i-1]);
		}
	}
}
