package ¹ºÎïµ¥;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int value=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int n=sc.nextInt();
		ArrayList<Goods> goods=new ArrayList<Goods>();
		for(int i=1;i<=n;i++){
			int price=sc.nextInt();
			int level=sc.nextInt();
			int appendix=sc.nextInt();
			goods.add(new Goods(i,price,level,appendix));
		}
		value=0;
		search(goods,0,0,0,total);
		System.out.println(value);

	}
	
	public static void search(ArrayList<Goods> goods,int index,int curprice,int curvalue,int total){
		if(curvalue>value && curprice<=total){
			value=curvalue;
		}
		if(index>=goods.size() || curprice>total) return;
		Goods g=goods.get(index);
		if(g.appedix==0 || (g.appedix>0 && goods.get(g.appedix-1).inuse)){
			g.inuse=true;
			search(goods,index+1,curprice+g.price,curvalue+g.value,total);
			g.inuse=false;
			search(goods,index+1,curprice,curvalue,total);
		}
		else{
			search(goods,index+1,curprice,curvalue,total);
		}
		return;
	}
}

class Goods{

	public Goods(int id, int price, int level, int appedix) {
		super();
		this.id = id;
		this.level = level;
		this.price = price;
		this.appedix = appedix;
		value=price*level;
		inuse=false;
	}
	int id;
	int level;
	int price;
	int appedix;
	int value;
	boolean inuse;
}
