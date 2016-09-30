package —ß”¢”Ô;

import java.util.Scanner;

public class Main {
	static String[] number = { "", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
	static String[] tenth = { "ten", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninty" };
	static String[] unit = { "thousand", "million", "billion" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(parse(n));
	}

	static String parse(int n) {
		// TODO Auto-generated method stub
		if (n <= 0)
			return "error";
		String result = "";
		int cnt = 0;
		while (n % 1000 > 0) {
			String t = cnt > 0 ? " " + unit[cnt - 1] + " " : "";
			result = hundred(n % 1000) + t + result;
			n /= 1000;
			cnt++;
		}
		return result;
	}

	static String hundred(int n) {
		String result = "";
		int tmp = n % 1000;
		int hund = tmp / 100;
		int ten = tmp % 100 / 10;
		int num = tmp % 10;
		if (hund > 0) {
			result += number[hund] + " hundred";
		}
		if (hund > 0 && tmp % 100 > 0) {
			result += " and ";
		}
		if (tmp % 100 < 20) {
			result += number[tmp % 100];
		} else {
			result += tenth[ten - 1] + " " + number[num];
		}
		return result;
	}
}
