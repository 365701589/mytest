package hello;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个不多于5位的正整数");
		int n = scanner.nextInt();
			String string = n+"";
			int x = string.length();
			if (x>5||x<0) {
				System.out.println("输入错误");
			}
			StringBuilder str = new StringBuilder(string);
			str.reverse();
			System.out.println("反转后的数位"+str);
			System.out.println(x);
				
		
		
		
	
		
		}
	}
	
