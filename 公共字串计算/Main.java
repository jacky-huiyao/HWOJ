package 公共字串计算;

import java.util.Scanner;

public class Main {

	public static int getCommonStrLength(String s1,String s2){
	    int count=0,number,sid1,sid2;
	    if(s1==" "||s2==" ")return 0;
	    for(int i=0;i<s1.length();i++){
	      for(int j=0;j<s2.length();j++){
	    	if(s1.charAt(i)!=s2.charAt(j)) continue; //不相等则继续
	        number=0;
	        sid1=i;
	        sid2=j; 
	        while(s1.charAt(sid1)==s2.charAt(sid2)){ 
	          sid1++;sid2++;
	          number++;
	          if(number>count)
	        	  count=number;
	          if(sid1==s1.length() || sid2==s2.length()){
	        	  return count;
	          } 
	        }
	      }
	    }
	    return count;
	  }
	  
	  public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    s1=s1.toLowerCase();
	    s2=s2.toLowerCase();
	    System.out.println(getCommonStrLength(s1,s2));
	  }
}
