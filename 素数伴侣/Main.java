package 素数伴侣;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//read 
		int[] arr=new int[n];
		int[] judge=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			judge[i]=0;
		}
		
		System.out.println(search(arr,judge,0,0,0));
		
		
//		System.out.println(isPrime(11));
	}
	
	static Boolean isPrime(int num){
		if(num<2)  return false;
		int i;
		for(i=2;i<=Math.sqrt(num);i++){
			if(num%i==0) break;
		}
		if(i>Math.sqrt(num)) return true;
		return false;
	}
	
	/**
	 * @param arr 原始 数组
	 * @param judge 判定表
	 * @param cur	当前搜索位置
	 * @param count	当前的素数伴侣对数
	 * @param maxcnt 最大的素数伴侣对数
	 * @return 最大的素数伴侣对数
	 */
	static int search(int[] arr,int[] judge,int cur,int count,int maxcnt){
		if(count>maxcnt){
			maxcnt=count;
		}
		for(;cur<arr.length;cur++){
			if(judge[cur]==1) continue;
			for(int j=cur+1;j<arr.length;j++){
				if(judge[j]==0 && isPrime(arr[cur]+arr[j])){
					judge[cur]=1;
					judge[j]=1;
					maxcnt=search(arr,judge,cur+1,count+1,maxcnt);
					judge[cur]=0;
					judge[j]=0;
				}
				
			}
		}
		return maxcnt;
	}

}
