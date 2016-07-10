package Ìô7;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++){
			if(i%7==0){
				count++;
				continue;
			}
			if(String.valueOf(i).contains("7")){
				count++;
				continue;
			}
		}
		System.out.println(count);
	}

}
