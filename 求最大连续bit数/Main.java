package 求最大连续bit数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findMaxByte(n));
	}
	
	static int findMaxByte(int n){
		int max=0,cnt=0;
		while(n>0){
			if(n%2>0){
				cnt++;
				if(max<cnt){
					max=cnt;
				}
			}
			else{
				cnt=0;
			}
			n/=2;
		}
		return max;
	}
}
