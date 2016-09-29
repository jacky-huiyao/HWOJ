package 求二叉树的深度;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String judge=sc.next();
		char[] tree=new char[1025];
		int level=1;
		int cnt=0;
		int base=1;
		for(int i=0;i<str.length();){
			if(str.charAt(i+1)-'0'!=level){
				level++;
				cnt=0;
				base*=2;
			}
			tree[base+cnt]=str.charAt(i);
			i+=2;
			cnt++;
		}
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		calDeep(tree,map,1,1);
		String result="";
		for(int i=0;i<judge.length();i++){
			if(map.containsKey(judge.charAt(i))){
				result+=map.get(judge.charAt(i))+" ";
			}
			else{
				result+="0 ";
			}
		}
		System.out.println(result.substring(0,result.length()-1));

	}
	
	static int calDeep(char[] tree,HashMap<Character,Integer> map,int index,int level){
		if(level==9 || tree[index]=='\u0000') return 1;
		int left=calDeep(tree,map,2*index,level+1);
		int right=calDeep(tree,map,2*index+1,level+1);
		int max=left<right?right:left;
		map.put(tree[index],max);
		return max+1;
	}
}
