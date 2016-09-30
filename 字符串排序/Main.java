package ×Ö·û´®ÅÅÐò;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		char tmp='0';
		for(int i=0;i<ch.length;i++){
			for(int j=ch.length-1;j>i;j--){
				if(Character.isAlphabetic(ch[j])){
					char c1=Character.toLowerCase(ch[j]);
					int n=j-1;
					while(n>=0 && !Character.isAlphabetic(ch[n])){
						n--;
					}
					char c2=Character.toLowerCase(ch[n]);
					if(c1<c2){
						tmp=ch[n];
						ch[n]=ch[j];
						ch[j]=tmp;
					}
					j=n+1;
				}
			}
		}
		for(char c:ch){
			System.out.print(c);
		}
		System.out.println();
	}
	
}
