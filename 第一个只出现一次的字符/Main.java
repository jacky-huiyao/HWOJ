/**
 * 
 */
package ��һ��ֻ����һ�ε��ַ�;

import java.util.Scanner;

/**
 * @author huiyao
 *�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
 *	
	����һ���ַ�
	���	
	���һ���ַ�
	��������	asdfasdfo
	�������	o
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=findChar(s);
		System.out.println(ch);
	}
	
	 static char findChar(String str){
		 int[] Alpha=new int[256];
		 for(int i=0;i<256;i++){
			 Alpha[i]=0;
		 }
		 for(int i=0;i<str.length();i++){
			 Alpha[str.charAt(i)]++;
		 }
		 for(int i=0;i<str.length();i++){
			 if(Alpha[str.charAt(i)]==1){
				 return str.charAt(i);
			 }
		 }
		 return '.';
	 }

}
