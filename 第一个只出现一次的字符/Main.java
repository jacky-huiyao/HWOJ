/**
 * 
 */
package 第一个只出现一次的字符;

import java.util.Scanner;

/**
 * @author huiyao
 *找出字符串中第一个只出现一次的字符
 *	
	输入一串字符
	输出	
	输出一个字符
	样例输入	asdfasdfo
	样例输出	o
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
