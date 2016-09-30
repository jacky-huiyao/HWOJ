package 字符个数统计;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(countChar(s));
	}
	
	static int countChar(String s){
		int[] ch=new int[128];
		for(int i=0;i<s.length();i++){
			ch[s.charAt(i)]++;
		}
		int count=0;
		for(int i=0;i<128;i++){
			if(ch[i]>0){
				count++;
			}
		}
		return count;
	}

}
