package 在字符串中找出连续最长的数字串;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(Continumax(str));

	}
	
	static String Continumax(String s){
		int max=0,cnt=0;
		String result="",tmp="";
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				tmp+=s.charAt(i);
				cnt++;
				if(cnt>max){
					max=cnt;
					result=tmp;
				}
			}
			else{
				tmp="";
				cnt=0;
			}
		}
		if(max>0){
			return result+","+max;
		}
		return "0";
	}

}
