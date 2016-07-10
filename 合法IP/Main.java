/**
 * 
 */
package �Ϸ�IP;

import java.util.Scanner;

/**
 * @author huiyao
 *����IPV4����һ��32λ�޷�����������ʾ��һ���õ�ַ�ʽ����ʾ���㽫IP��ַ�ֳ�4�����֣�ÿ������Ϊ8λ����ʾ��һ���޷�����������˲���Ҫ�����ų��֣�����10.137.17.1�������Ƿǳ���Ϥ��IP��ַ��һ��IP��ַ����û�пո���֣���ΪҪ��ʾ��һ��32���֣���
������Ҫ���ó������ж�IP�Ƿ�Ϸ���
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
