package 密码验证合格程序;

import java.util.Scanner;
/*
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000

 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if(checkPwd(s)){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");
			}
		}
	}

	static boolean checkPwd(String s) {
		boolean result = true;
		// 长度
		int len = s.length();
		if (len < 8) {
			result = false;
		}
		// 大小写字母，数字，特殊符号
		int a = 0, b = 0, c = 0, d = 0;
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				a = 1;
			} else if (ch >= 'A' && ch <= 'Z') {
				b = 1;
			} else if (ch >= '0' && ch <= '9') {
				c = 1;
			} else {
				d = 1;
			}
		}
		if (a + b + c + d < 3) {
			result = false;
		}
		// 最大字符串不大于2
		int[][] dp = new int[len][len];
		int max = 0;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}
					if (dp[i][j] > max) {
						max = dp[i][j];
					}
				}
			}
		}
		if (max > 2) {
			result = false;
		}
		return result;
	}
}
