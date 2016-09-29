package 删除字符串中出现次数最少的字符;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[] count=new int[256];
		//统计个数
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)]++;
		}
		//统计最小的个数
		int min=s.length();
		for(int i=0;i<256;i++){
			if(count[i]>0 && count[i]<min){
				min=count[i];
			}
		}
		//剔除最小个数的字符
		String result="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(count[ch]!=min){
				result+=ch;
			}
		}
		System.out.println(result);
	}
}
