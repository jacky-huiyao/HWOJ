package 查找输入整数二进制中1的个数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findNumberOf1(n));
	}
	
	public static int findNumberOf1(int num)
    {
		int cnt=0;
		while(num!=0){
			cnt++;
			num=num&(num-1);
		}
        return cnt;
    }

}
