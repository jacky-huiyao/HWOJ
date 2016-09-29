package 密码强度等级;

import java.util.Scanner;

public class Main {
	static enum Safelevel{VERY_WEAK,WEAK,AVERAGE,STRONG,VERY_STRONG,SECURE,VERY_SECURE }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pwd = sc.next();
		System.out.println(GetPwdSecurityLevel(pwd));

	}

	public static Safelevel GetPwdSecurityLevel(String pwd) {
		int score = 0;
		int len = pwd.length();
		// length
		if (len <= 4) {
			score += 5;
		} else if (len >= 5 && len <= 7) {
			score += 10;
		} else {
			score += 25;
		}
		// 字母,数字，符号
		int lower = 0;
		int upper = 0;
		int num = 0;
		int sign = 0;
		for (int i = 0; i < len; i++) {
			char ch = pwd.charAt(i);
			if (ch >= '0' && ch <= '9') {
				num++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else {
				sign++;
			}
		}
		if ((lower & upper) == 0 && (lower | upper) > 0) {
			score += 10;
		} else if (lower > 0 && upper > 0) {
			score += 20;
		}
		if (num == 1) {
			score += 10;
		} else if (num > 1) {
			score += 20;
		}
		if (sign == 1) {
			score += 10;
		} else if (sign > 1) {
			score += 25;
		}
		if (lower + upper > 0 && num > 0) {
			if ((lower & upper) > 0 && sign > 0) {
				score += 5;
			} else if (sign > 0) {
				score += 3;
			} else {
				score += 2;
			}
		}
		Safelevel level;
		if(score>=90){
			level=Safelevel.VERY_SECURE;
		}
		else if(score>=80){
			level=Safelevel.SECURE;
		}
		else if(score>=70){
			level=Safelevel.VERY_STRONG;
		}
		else if(score>=60){
			level=Safelevel.STRONG;
		}
		else if(score>=50){
			level=Safelevel.AVERAGE;
		}
		else if(score>=20){
			level=Safelevel.WEAK;
		}
		else{
			level=Safelevel.VERY_WEAK;
		}
		
		/* 在这里实现功能 */
		return level;
	}

}
