package 放苹果;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(count(n,m));
	}

	private static int count(int n, int m) {
		return count(n,n,m,0);
	}

	private static int count(int res, int pre,int m, int d) {
		// TODO Auto-generated method stub
		if(res==0 && d<=m){
			return 1;
		}
		if(d>m) return 0;
		int cnt=0;
		//计算第d个盘子最多可能的个数
		int start=res<pre?res:pre;
		for(int i=start;i>0;i--){
			cnt+=count(res-i,i,m,d+1);
		}
		return cnt;
		
	}

}
