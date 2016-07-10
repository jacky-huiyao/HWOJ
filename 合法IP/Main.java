/**
 * 
 */
package 合法IP;

import java.util.Scanner;

/**
 * @author huiyao
 *现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
现在需要你用程序来判断IP是否合法。
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		if(isLegalIp(s)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
	 
	public static Boolean isLegalIp(String str){
		String[] nums=str.split("\\.");
		if(nums.length!=4){
			return false;
		}
		for(int i=0;i<nums.length;i++){
			int n;
			try {
				n = Integer.parseInt((nums[i].trim()));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				return false;
			}
			if(n<0 || n>255){
				return false;
			}
		}
		return true;
	}

}
