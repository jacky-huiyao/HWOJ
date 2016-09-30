package JAVA0_1级;

import java.util.Scanner;

/*
 * 编写一个函数，传入一个int型数组，返回该数组能否分成两组，使得两组中各元素加起来的和相等，并且，
 * 所有5的倍数必须在其中一个组中，所有3的倍数在另一个组中（不包括5的倍数），能满足以上条件，返回true；
 * 不满足时返回false。
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		findSum(a, 0, 0, 0);
		System.out.println(found);
	}
	static boolean found=false;
	static void findSum(int[] a,int sumleft,int sumright,int d){
		if(found) return;
		if(d==a.length){
			if(sumleft==sumright) 
				found=true;
			return;
		}
		//被5整除
		if(a[d]%5==0){
			findSum(a,sumleft+a[d],sumright,d+1);
		}
		//被3整除
		if(a[d]%3==0){
			findSum(a,sumleft,sumright+a[d],d+1);
		}
		//其他
		if(a[d]%5!=0 && a[d]%3!=0){
			findSum(a,sumleft+a[d],sumright,d+1);
			findSum(a,sumleft,sumright+a[d],d+1);
		}
	}
	
	

}
