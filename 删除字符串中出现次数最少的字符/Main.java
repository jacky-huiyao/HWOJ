package ɾ���ַ����г��ִ������ٵ��ַ�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[] count=new int[256];
		//ͳ�Ƹ���
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)]++;
		}
		//ͳ����С�ĸ���
		int min=s.length();
		for(int i=0;i<256;i++){
			if(count[i]>0 && count[i]<min){
				min=count[i];
			}
		}
		//�޳���С�������ַ�
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
