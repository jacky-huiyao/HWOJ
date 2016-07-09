package Ãû×ÖµÄÆ¯ÁÁ¶È;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++){
			str[i] = sc.next();
		}
		for(int i=0;i<n;i++){
			int[] b=new int[26];
			//initial b=0
			for(int j=0;j<26;j++){
				b[i]=0;
			}
			//calculate char number
			for(int j=0;j<str[i].length();j++){
				char ch=str[i].charAt(j);
				b[Character.toLowerCase(ch)-'a']++;
			}
			//sort
			Arrays.sort(b);
			//calcutate max number
			int sum=0,num=26;
			for(int j=b.length-1;j>=0;j--){
				if(b[j]>0){
					sum+=num*b[j];
					num--;
				}
				else
					break;
			}
			System.out.print(sum);
			if(i<n-1) System.out.print(" ");
		}
		System.out.println();
	}

}
