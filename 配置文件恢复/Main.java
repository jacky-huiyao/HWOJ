package ÅäÖÃÎÄ¼ş»Ö¸´;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,String> orders=new HashMap<String ,String>();
		orders.put("reset board", "board fault");
		orders.put("board add", "where to add");
		orders.put("board delet", "no board at all");
		orders.put("reboot backplane", "impossible");
		orders.put("backplane abort", "install first");
		Scanner sc=new Scanner(System.in);
		while(true){
			String s=sc.nextLine();
			if(s.length()==0) continue;
			String[] sp=s.split(" ");
			if(sp.length==1 && Pattern.matches(sp[0]+".*","reset")) {
				System.out.println("reset what");
				continue;
			}
			if(sp.length==2){
				int n=0;
				String result="";
				for(String input: orders.keySet())
					if(Pattern.matches(sp[0].trim()+".*"+" "+sp[1].trim()+".*",input)){
						if(++n==2) break;
						result=orders.get(input);
					}
				if(n==1){
					System.out.println(result);
					continue;
				}

			}
			System.out.println("unkown command");
		}
	}
}

