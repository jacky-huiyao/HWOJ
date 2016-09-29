package DNA–Ú¡–;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		if(s.length()<=n) {
			System.out.println(s);
			return;
		}
		int cnt=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='G' || s.charAt(i)=='C'){
				cnt++;
			}
		}
		int best=cnt;
		String result=s.substring(0,n);
		for(int i=1;i<s.length()-n;i++){
			char c=s.charAt(i+n-1);
			if(c=='G' || c=='C'){
				cnt++;
			}
			if(s.charAt(i-1)=='G' || s.charAt(i-1)=='C'){
				cnt--;
			}
			if(cnt>best){
				result=s.substring(i, i+n);
				best=cnt;
			}
		}
		System.out.println(result);
		
	}

}
