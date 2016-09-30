package 查找组成一个偶数最接近的两个素数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		PrimePair p=findPrimeNumber(n);
		System.out.println(p.primeMin+"\n"+p.primeMax);
	}

	public static class PrimePair {
		public int primeMin;
		public int primeMax;
	}

	public static PrimePair findPrimeNumber(int number) {
		/* 请实现 */
		PrimePair pp=new PrimePair();
		for(int i=number/2;i>1;i--){
			if(isPrime(i) && isPrime(number-i)){
				pp.primeMin=i;
				pp.primeMax=number-i;
				break;
			}
		}
		return pp;
	}
	
	static boolean isPrime(int number){
		if(number==2 || number==3) return true;
		int i=2;
		for(;i<=Math.sqrt(number);i++){
			if(number%i==0){
				return false;
			}
		}
		if(i<=Math.sqrt(number)){
			return false;
		}
		return true;
	}
}
