package µ•¥ µπ≈≈;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result="";
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(!Character.isAlphabetic(s.charAt(i))){
				if(cnt!=0){
					result=" "+s.substring(i-cnt, i)+result;
					cnt=0;
				}
				continue;
			}
			cnt++;
		}
		if(cnt!=0){
			result=s.substring(s.length()-cnt, s.length())+result;
		}
		System.out.println(result);
		
	}

}
