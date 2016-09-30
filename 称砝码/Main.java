package ³ÆíÀÂë;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] weight=new int[n];
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			weight[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<Integer>();
		set.add(0);
		for(int i=0;i<n;i++){
			int w=weight[i];
			HashSet<Integer> newset=new HashSet<Integer>();
			for(int v:set){
				for(int j=1;j<=num[i];j++)
					newset.add(v+w*j);
			}
			set.addAll(newset);
		}
		System.out.println(set.size());
	}


}
