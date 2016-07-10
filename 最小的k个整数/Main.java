package 最小的k个整数;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 输入n个整数，输出其中最小的k个
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mink=sc.nextInt();
		//read
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		String s="";
		for(int i=0;i<mink;i++){
			s+=arr[i]+" ";
		}
		System.out.println(s.trim());
	}
	
//	public static void swap(int[] arr,int n,int m){
//		int tmp=arr[n];
//		arr[n]=arr[m];
//		arr[m]=tmp;
//	}
//	

}
