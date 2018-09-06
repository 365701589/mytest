import java.beans.DefaultPersistenceDelegate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.activation.UnsupportedDataTypeException;
import javax.xml.crypto.Data;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		Scanner  scanner = new Scanner(System.in);
		while (true){
		System.out.println("===================================");
		System.out.println("��ӭʹ��ѧԱ����ϵͳ");
		System.out.println("");
		System.out.println("1.���    2.�޸�    3.ɾ��    4.��ѯ����    5.�˳�");
		System.out.println("======================================");
		int  op = scanner.nextInt();
		switch(op){
			case 1 :
				add(scanner);
				break;
			case 2 :
				update(scanner);
				break;
			case 3:
				delete(scanner);
				break;
			case 4:
				findAll(scanner);
				break;
			case 5:
				System.out.println("ллʹ��");
				break;
			default:
				System.out.println("��������");
				break;
		}
	}
}

	private static void add(Scanner scanner) throws IOException {
		System.out.println("������Ҫ��ӵ�ѧԱ");
		String stuNo = scanner.next();
		ArrayList<Student> stuList = readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			if(stu.getStuNo().equals(stuNo)){
				System.out.println("�����Ѿ�����");
				return;
			}
		}
				
			
			System.out.println("������ѧԱ����");
			String name = scanner.next();
			System.out.println("������ѧԱ����");
			String age = scanner.next();
			System.out.println("������ѧԱ�Ա�");
			String sex = scanner.next();
			Student stu = new Student(stuNo, name, age, sex);
			stuList.add(stu);
			writeFile(stuList);
			System.out.println("ѧԱ��ӳɹ�");
			
		
		
		
	}
	private static void writeFile(ArrayList<Student> stuList) throws IOException {
			BufferedWriter out = new BufferedWriter(new FileWriter("data.txt"));
			for (int i = 0; i <stuList.size(); i++) {
				Student stu = stuList.get(i);
				out.write(stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				out.newLine();
			}out.close();
			
		
	}

	//��ȡ�ļ��ķ���
	private static ArrayList<Student> readAll() throws IOException  {
		BufferedReader in = new BufferedReader(new FileReader("data.txt"));
		ArrayList<Student> stuList = new ArrayList<>();
		String row = null;//��ȡÿ���ļ�
		while((row=in.readLine())!=null){
			//����
			String[] strArray = row.split(",");
			Student stu = new Student(strArray[0],strArray[1],strArray[2],strArray[3]);
			stuList.add(stu);
			
		}in.close();
		return stuList;
	}

	private static void update(Scanner scanner) throws IOException {
			System.out.println("������Ҫ�޸ĵ�ѧԱ");
			String stuNo = scanner.next();
			ArrayList<Student> stuList = readAll();
			for (int i = 0; i <stuList.size(); i++) {
				Student stu = stuList.get(i);
				if (stu.getStuNo().equals(stuNo)) {
					System.out.println("Ҫ�޸ĵ�ѧԱ��ϢΪ��"+stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
					System.out.println("������ѧԱ����");
					String name = scanner.next();
					System.out.println("������ѧԱ����");
					String age = scanner.next();
					System.out.println("������ѧԱ�Ա�");
					String sex = scanner.next();
					stu.setName(name);
					stu.setAge(age);
					stu.setSex(sex);
					stuList.add(stu);
					writeFile(stuList);
					System.out.println("�����޸ĳɹ�");
					return;
				}
			}System.out.println("���ݲ�����");
		
	}

	private static void delete(Scanner scanner) throws IOException {
		System.out.println("������Ҫɾ����ѧԱ���");
		String stuNo = scanner.next();
		ArrayList<Student> stuList = readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("Ҫɾ����ѧԱ��ϢΪ��"+stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				System.out.println("ȷ��Ҫɾ�����ѧԱ��1.����   2.ȡ��");
				int op = scanner.nextInt();
				if (op==1) {
					stuList.remove(i);
					writeFile(stuList);
					System.out.println("�����Ѿ�ɾ��");
				}else{
					System.out.println("�����Ѿ�ȡ��");
					
				}
				return;
			}
		}System.out.println("ѧ�Ų�����");
		
	}

	private static void findAll(Scanner scanner) throws IOException {
			ArrayList<Student> stuList = readAll();
				System.out.println("************************************");
				if (stuList==null||stuList.size()==0) {
					System.out.println("������");
				}else{
					System.out.println("\tѧ��\t����\t����\t�Ա�");
					System.out.println("*****************************************");
				}
				for (int i = 0; i <stuList.size(); i++) {
					Student stu = stuList.get(i);
					System.out.println("\t"+stu.getStuNo()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getSex());
					
				}
				
				
			}
		
	}

