package 判断两个IP是否属于同一子网;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println(192 & 255);

		String mask=sc.next();
		String ip1=sc.next();
		String ip2=sc.next();
		System.out.println(checkNetSegment(mask,ip1,ip2));
	}
	
	public static int checkNetSegment(String mask, String ip1, String ip2) 
	{     
	    /*在这里实现功能*/
		if(check(mask) && check(ip1) && check(ip2)){
			String[] m=mask.split("\\.");
			String[] i1=ip1.split("\\.");
			String[] i2=ip2.split("\\.");
			boolean isSameNet=true;
			for(int i=0;i<4;i++){
				int v0=Integer.valueOf(m[i]);
				int v1=Integer.valueOf(i1[i]);
				int v2=Integer.valueOf(i2[i]);
				//判断数值是否在0-255之间
				if(!(v0>=0 && v0<=255 && v1>=0 && v1<=255 && v2>=0 && v2<=255))
					return 1;
				if((v0 & v1)!=(v0 & v2)){
					isSameNet=false;
				}
			}
			if(isSameNet){
				return 0;
			}
			return 2;
		}
		return 1;
	}
	
	public static boolean check(String s){
		int dotcnt=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='.') 
				dotcnt++;
			else if(c<'0' && c>'9'){
				return false;
			}
		}
		if(dotcnt==3)
			return true;
		return false;
	}
}
