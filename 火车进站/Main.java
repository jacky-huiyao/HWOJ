package »ð³µ½øÕ¾;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int train[]=new int[n];
		for(int i=0;i<n;i++){
			train[i]=sc.nextInt();
		}
//		int n=3;
//		int train[]={1,2,3};
		ArrayList<String> result=new ArrayList<String>();
		Stack<Integer> stack=new Stack<Integer>();
		order(train,"",stack,result,0);
		Collections.sort(result);
		for(String str:result){
			System.out.println(str);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void order(int[] train,String out,Stack<Integer> stack,ArrayList<String> result,int deep){
		if(deep==train.length){
			while(!stack.empty()){
				out=out+stack.pop()+" ";
			}
			result.add(out.trim());
			return;
		}
		while(!stack.empty()){
			stack.push(train[deep]);
			order(train,out,(Stack<Integer>)stack.clone(),result,deep+1);
			stack.pop();
			out+=stack.pop()+" ";
		}
		stack.push(train[deep]);
		order(train,out,stack,result,deep+1);
	}

}
