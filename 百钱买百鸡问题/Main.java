package 百钱买百鸡问题;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int x=0;x<20;x++){
			for(int y=0;y<=33;y++){
				for(int z=0;z<=100;z++){
					if(z%3==0 && x*5+y*3+z/3==100 && x+y+z==100){
						System.out.println(x+" "+y+" "+z);
					}
				}
			}
		}
	}

}
