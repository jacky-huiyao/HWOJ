package �ַ����ӽ���;

import java.util.Scanner;

/*
 * �ַ����ӽ���
 * ��������Ӣ����ĸʱ���ø�Ӣ����ĸ�ĺ�һ����ĸ�滻��ͬʱ��ĸ�任��Сд,����ĸaʱ���滻ΪB����ĸZʱ���滻Ϊa��
 * ������������ʱ��Ѹ����ּ�1����0�滻1��1�滻2��9�滻0��
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String pwd=sc.nextLine();
		String encrypt=sc.nextLine();
		char aucResult[]=new char[pwd.toCharArray().length];
		Encrypt(pwd.toCharArray(),aucResult);
//		aucResult[pwd.toCharArray().length]='\0';
		System.out.println(String.valueOf(aucResult));
		char password[]=new char[encrypt.toCharArray().length];
		unEncrypt(encrypt.toCharArray(),password);
//		password[encrypt.length()]='\0';
		System.out.println(String.valueOf(password));
	}
	//����
	static void Encrypt (char aucPassword[], char aucResult[]){
		int diff='a'-'A';
		for(int i=0;i<aucPassword.length;i++){
			if(aucPassword[i]>='a' && aucPassword[i]<'z'){
				aucResult[i]=(char) (aucPassword[i]+1-diff);
				continue;
			}
			if(aucPassword[i]>='A' && aucPassword[i]<'Z'){
				aucResult[i]=(char) (aucPassword[i]+1+diff);
				continue;
			}
			if(aucPassword[i]=='z'){
				aucResult[i]='A';
				continue;
			}
			if(aucPassword[i]=='Z'){
				aucResult[i]='a';
				continue;
			}
			if(aucPassword[i]>='1' && aucPassword[i]<'9'){
				aucResult[i]=(char) (aucPassword[i]+1);
				continue;
			}
			if(aucPassword[i]=='9'){
				aucResult[i]='0';
				continue;
			}
			aucResult[i]=aucPassword[i];
		}
	}
	//����
	static int unEncrypt (char result[], char password[]){
		int diff='a'-'A';
		for(int i=0;i<result.length;i++){
			if(result[i]>'a' && result[i]<='z'){
				password[i]=(char) (result[i]-1-diff);
				continue;
			}
			if(result[i]>'A' && result[i]<='Z'){
				password[i]=(char) (result[i]-1+diff);
				continue;
			}
			if(result[i]=='A'){
				password[i]='z';
				continue;
			}
			if(result[i]=='a'){
				password[i]='Z';
				continue;
			}
			if(result[i]>'1' && result[i]<='9'){
				password[i]=(char) (result[i]-1);
				continue;
			}
			if(result[i]=='0'){
				password[i]='9';
				continue;
			}
			password[i]=result[i];
		}
		return 1;
	}

}
