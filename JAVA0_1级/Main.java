package JAVA0_1��;

import java.util.Scanner;

/*
 * ��дһ������������һ��int�����飬���ظ������ܷ�ֳ����飬ʹ�������и�Ԫ�ؼ������ĺ���ȣ����ң�
 * ����5�ı�������������һ�����У�����3�ı�������һ�����У�������5�ı���������������������������true��
 * ������ʱ����false��
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
		//��5����
		if(a[d]%5==0){
			findSum(a,sumleft+a[d],sumright,d+1);
		}
		//��3����
		if(a[d]%3==0){
			findSum(a,sumleft,sumright+a[d],d+1);
		}
		//����
		if(a[d]%5!=0 && a[d]%3!=0){
			findSum(a,sumleft+a[d],sumright,d+1);
			findSum(a,sumleft,sumright+a[d],d+1);
		}
	}
	
	

}
