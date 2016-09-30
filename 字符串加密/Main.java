package 字符串加密;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim().toUpperCase();
		String pwd=sc.nextLine().trim();
		String enstr="";
		int[] used=new int[26];
		for(int i=0;i<26;i++){
			used[i]=0;
		}
		for(int i=0;i<s.length();i++){
			int index=s.charAt(i)-'A';
			if(used[index]==0){
				enstr+=s.charAt(i);
				used[index]=1;
			}
		}
		for(int i=0;i<26;i++){
			if(used[i]==0){
				enstr+=(char) (i+'A');
			}
		}
		//加密明文
		String enpwd="";
		for(char c:pwd.toCharArray()){
			if(c>='a' && c<='z'){
				enpwd+=(char)(enstr.charAt(c-'a')-'A'+'a');
			}
			else if(c>='A' && c<='Z'){
				enpwd+=enstr.charAt(c-'A');
			}
			else{
				enpwd+=c;
			}
		}
		System.out.println(enpwd);
	}

}
