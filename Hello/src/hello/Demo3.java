package hello;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��������5λ��������");
		int n = scanner.nextInt();
			String string = n+"";
			int x = string.length();
			if (x>5||x<0) {
				System.out.println("�������");
			}
			StringBuilder str = new StringBuilder(string);
			str.reverse();
			System.out.println("��ת�����λ"+str);
			System.out.println(x);
				
		
		
		
	
		
		}
	}
	
