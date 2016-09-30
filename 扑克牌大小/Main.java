package ÆË¿ËÅÆ´óĞ¡;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<String,Integer> map=new HashMap<String,Integer>();
	static{
	
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		map.put("6", 6);
		map.put("7", 7);
		map.put("8", 8);
		map.put("9", 9);
		map.put("10",10);
		map.put("J", 11);
		map.put("Q", 12);
		map.put("K", 13);
		map.put("A", 14);
		map.put("2", 15);
		map.put("joker", 16);
		map.put("JOKER", 17);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String hands[]=line.split("-");
		String[] str1=hands[0].split(" ");
		String[] str2=hands[1].split(" ");
		int[] play1=new int[str1.length];
		for(int i=0;i<str1.length;i++){
			play1[i]=map.get(str1[i]);
		}
		int[] play2=new int[str2.length];
		for(int i=0;i<str2.length;i++){
			play2[i]=map.get(str2[i]);
		}
		int result=compare(play1,play2);
		if(result==0){
			System.out.println("ERROR");
		}
		else if(result==1){
			print(str1);
		}
		else{
			print(str2);
		}
	}


	public static int compare(int[] play1,int[] play2){
		int l1=play1.length;
		int l2=play2.length;
		if(l1==1){
			if(l2==1){
				return sum(play1)>sum(play2)?1:-1;
			}
			else if(l2==2 && isJokers(play2)){
				return -1;
			}
			else if(l2==4 && isBomb(play2)){
				return -1;
			}
			return 0;
		}
		else if(l1==2){
			if(isJokers(play1)){
				return 1;
			}
			else if(l2==2 && isJokers(play2)){
				return -1;
			}
			else if(l2==2){
				return sum(play1)>sum(play2)?1:-1;
			}
			else if(l2==4 && isBomb(play2)){
				return -1;
			}
			return 0;
		}
		else if(l1==3){
			if(l2==3){
				return sum(play1)>sum(play2)?1:-1;
			}
			else if(l2==2 && isJokers(play2)){
				return -1;
			}
			else if(l2==4 && isBomb(play2)){
				return -1;
			}
			return 0;
		}
		if(l1==4){
			if(l2==2 && isJokers(play2)){
				return -1;
			}
			else if(l2==4 && isBomb(play2)){
				if(isBomb(play1)){
					return sum(play1)>sum(play2)?1:-1;
				}
				return -1;
			}
			else if(isBomb(play1)){
				return 1;
			}
			else if(l2==4){
				return sum(play1)>sum(play2)?1:-1;
			}
			return 0;
		}
		if(l1==5){
			if(l2==5){
				return play1[0]>play2[0]?1:-1;
			}
			else if(l2==2 && isJokers(play2)){
				return -1;
			}
			else if(l2==4 && isBomb(play2)){
				return -1;
			}
			return 0;
		}
		return 0;
	}
	
	private static int sum(int[] play1) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int v:play1){
			sum+=v;
		}
		return sum;
	}


	public static boolean isJokers(int[] n){
		if(n.length==2){
			if(n[0]==17 && n[1]==16 ||(n[0]==16 && n[1]==17))
			return true;
		}
		return false;
	}
	
	public static boolean isBomb(int[] n){
		if(n.length==4 && n[0]==n[1] && n[1]==n[2] && n[2]==n[3]){
			return true;
		}
		return false;
	}
	
	
	public static void print(String[] str){
		String out="";
		for(String s:str){
			out+=s+" ";
		}
		System.out.println(out.trim());
	}
}
