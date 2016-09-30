package 计算字符串的距离;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(calStringDistance(s1, s2));
	}
	
    public static int calStringDistance (String charA, String  charB)
    {
       int n=charA.length();
       int m=charB.length();
       int[][] dist=new int[n+1][m+1];
       for(int i=0;i<=n;i++){
    	   dist[i][0]=i;
       }
       for(int i=0;i<=m;i++){
    	   dist[0][i]=i;
       }
       for(int i=1;i<=n;i++){
    	   for(int j=1;j<=m;j++){
    		   //左边值加1，上面值加1，和左上角值+（如果两个字符相等？0：1），三个的最小值
    		   int left=dist[i][j-1]+1;
    		   int top=dist[i-1][j]+1;
    		   int lefttop=dist[i-1][j-1]+(charA.charAt(i-1)==charB.charAt(j-1)?0:1);
    		   dist[i][j]=Math.min(top, Math.min(left, lefttop));
    	   }
       }
       return dist[n][m];
    } 
}
