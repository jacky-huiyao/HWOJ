package 统计大写字母个数;

import java.util.Scanner;

public class Main {
	public int CalcCapital(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		Main m=new Main();
		System.out.println(m.CalcCapital(s));
	}
}
