import java.awt.event.MouseWheelEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.xml.crypto.Data;

import org.omg.CORBA.DomainManagerOperations;

public class Demo1 {

	public static void main(String[] args) throws IOException {
			int a = 10;
/*			int b  = 20;
			if(a==b){
				System.out.println(true);
			}else{
				System.out.println(false);
			}int c =10;
			if (a==c) {
				System.out.println(true);
			}else{
				System.out.println(false);
			}*/
			/*Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一个数字");
			int n = scanner.nextInt();
			if(n%2==0){
				System.out.println(true);
				
			}else{
				System.out.println(false);*/
			/*Scanner scanner = new Scanner(System.in);
			System.out.println("请输入成绩");
			int  n = scanner.nextInt();
			if (n==100) {
				System.out.println("满分");
			}else if(n>=60&&n<=90){
				System.out.println("及格");
			}else if(n>=0&&n<60){
				System.out.println("不及格");
			}else{
				System.out.println("输入错误");
			}*/
/*			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入1-7的数字");
			int n = scanner.nextInt();
			switch(n){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6 :
				System.out.println("星期六");
				break;
			case 7 :
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入错误");
				break;
			}*/
	/*		String arrA[]= {"a","b","c","d","e"};
			String arrB[] = new String[5];
			int c= 0;
			for (int i = arrA.length-1;i>=0;i--) {
				arrB[c] = arrA[i];
				c++;
			}for (int i = 0; i < arrB.length; i++) {
				System.out.print(arrB[i]);
			}*/
		/*	Scanner scanner  = new Scanner(System.in);
			System.out.println("请输入一个字符串");
			String ss = scanner.next();
			char[] arr=ss.toCharArray();
			String n = "";
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>='0'&&arr[i]<='9'){
					n += arr[i];
					System.out.print(arr[i]);
				}
				}	*/
		/*	Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一个字符串");
			String ss = scanner.next();
			char[]  arr = ss.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>='0'&&arr[i]<='9'){
					System.out.print(arr[i]);
				}
			}*/
			/*BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
			ArrayList<String> strList = new ArrayList<>();
			Random random = new Random();
			String ss;
			while((ss=reader.readLine())!=null){
				strList.add(ss);
				
				}
			String n = strList.get(random.nextInt(strList.size()));
			System.out.println(n);*/
			/*BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
			ArrayList<String> strList = new ArrayList<>();
			Random random = new Random();
			String ss;
			while ((ss= reader.readLine())!=null){
				strList.add(ss);
			}
			String n = strList.get(random.nextInt(strList.size()));
			System.out.println(n)*/
		/*	ArrayList<Empl> list = new ArrayList<>();
			Empl empl = new Empl(100);
			Empl empl2 = new Empl(300);
			Empl empl3 = new Empl(567);
			list.add(empl);
			list.add(empl2);
			list.add(empl3);
			for (int i = 0; i<list.size(); i++) {
				Empl ss = list.get(i);
				int c = ss.getSalary();
				if (c<=300) {
					list.remove(i);
					i--;
				}else{
					ss.setSalary(c+100);
					
					
				}
			}for (int i = 0; i <list.size(); i++) {
				Empl sEmpl = list.get(i);
				System.out.println(sEmpl.getSalary());
			}
				*/
			/*	ArrayList<Empl> list = new ArrayList<>();
				Empl empl = new Empl(100);
				Empl empl2 = new Empl(300);
				Empl empl3 = new Empl(567);
				list.add(empl);
				list.add(empl2);
				list.add(empl3);
				for (int i = 0; i <list.size(); i++) {
					Empl ss= list.get(i);
					int n = ss.getSalary();
					if (n<=300) {
						list.remove(i);
						i--;
					}else{
						ss.setSalary(n+100);
					}
				}for (int i = 0; i <list.size(); i++) {
					Empl c = list.get(i);
					System.out.println(c.getSalary());
				}*/
			/*ArrayList<Empl> list = new ArrayList<>();
			Empl empl = new Empl(100);
			Empl empl2 = new Empl(300);
			Empl empl3 = new Empl(567);
			list.add(empl);
			list.add(empl2);
			list.add(empl3);
			for (int i = 0; i <list.size(); i++) {
				Empl ss= list.get(i);
				int c = ss.getSalary();
				if (c<=300) {
					list.remove(i);
					i--;
				}else{
					ss.setSalary(c+100);
				}
			}for (int i = 0; i <list.size(); i++) {
				Empl s = list.get(i);
				System.out.println(s.getSalary());
			}*/
/*
		int x = 3;
			while(x>0){
				if(x>2){
					System.out.print("a");
				}
				x=x-1;
				System.out.print  ("-");
			
				if (x==2) {
					System.out.print("b c");
				}
					if (x==1) {
						System.out.print("d");
						x=x-1;
				
					
				}*/
			/*int x= 1;
			while(x<3){
				System.out.print("Doo");
				System.out.print("Bee");
				x= x+1;
			}
			if (x==3) {
				System.out.println("Do");
			}*/
			/*BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
			ArrayList<String> list = new ArrayList<>();
			String ss;
			while((ss=reader.readLine())!=null){
				
			}
			}
			}
			*/
	}		
	

	


