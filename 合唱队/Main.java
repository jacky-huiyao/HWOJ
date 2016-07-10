package ºÏ³ª¶Ó;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] a=new int[num];
		int[] f1=new int[num];
		int[] f2=new int[num];
		for(int i=0;i<num;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++){
			f1[i]=1;
			for(int j=0;j<i;j++){
				if(a[i]>a[j] && f1[i]<f1[j]+1)
					f1[i]=f1[j]+1;
			}
		}
		for(int i=num-1;i>=0;i--){
			f2[i]=1;
			for(int j=num-1;j>i;j--){
				if(a[i]>a[j] && f2[i]<f2[j]+1)
					f2[i]=f2[j]+1;
			}
		}
		int maxv=0;
		for(int i=0;i<num-1;i++){
			if(maxv<f1[i]+f2[i+1])
				maxv=f1[i]+f2[i+1];
		}
		System.out.println(num-maxv);
	}
}
