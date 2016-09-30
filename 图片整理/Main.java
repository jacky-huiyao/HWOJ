package НјЖ¬ХыАн;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(char c:ch){
			System.out.print(c);
		}
		System.out.println();
	}

}
