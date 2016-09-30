package 统计出包含英文字母空格数字个数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int digit=0;
		int alphabet=0;
		int space=0;
		int other=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='0' && c<='9'){
				digit++;
			}
			else if(c>='a' && c<='z' || (c>='A' && c<='Z')){
				alphabet++;
			}
			else if(c==' '){
				space++;
			}
			else{
				other++;
			}
		}
		System.out.println(alphabet);
		System.out.println(space);
		System.out.println(digit);
		System.out.println(other);
	}
}
