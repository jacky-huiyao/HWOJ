package ×ø±êÒÆ¶¯;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String action=sc.nextLine();
		String[] move=action.split(";");
		int x=0;
		int y=0;
		for(int i=0;i<move.length;i++){
			if(check(move[i])){
				int distance=Integer.valueOf(move[i].substring(1));
				switch(move[i].charAt(0)){
				case 'A':x-=distance;break;
				case 'W':y+=distance;break;
				case 'D':x+=distance;break;
				case 'S':y-=distance;break;
				}
			}
		}
		System.out.println(x+","+y);
	}

	private static boolean check(String string) {
		// TODO Auto-generated method stub
		String s=string.trim();
		if(s.length()>3 || s.length()<2) return false;
		char c=s.charAt(0);
		if(c=='A' || c=='W' || c=='S' || c=='D'){
			for(int i=1;i<s.length();i++){
				if(!Character.isDigit(s.charAt(i)))
					return false;
			}
			return true;
		}
		return false;
	}

}
