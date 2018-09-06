import java.beans.DefaultPersistenceDelegate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("***************************");
		System.out.println("欢迎使用学员管理系统");
		System.out.println("");
		System.out.println("1.添加     2.修改      3.删除      4.查询所有      5.退出");
		System.out.println("******************************");
		int op = scanner.nextInt();
		switch (op) {
		case 1:
			add(scanner);
			break;
		case 2:
			updata(scanner);
			break;
		case 3:
			delete(scanner);
			break;
		case 4:
			findAll(scanner);
			break;
		case 5:
			System.out.println("谢谢使用");
			break;

		default:
			System.out.println("输入有误");
			break;

		}
	}
	}
		//添加
	private static void add(Scanner scanner) throws IOException {
			System.out.println("请输入要添加的学号");
			String stuNo = scanner.next();
			ArrayList<Student> stuList =readAll();
			for (int i = 0; i <stuList.size(); i++) {
				Student stu = stuList.get(i);
				if (stu.getStuNo().equals(stuNo)) {
					System.out.println("数据已经存在");
					return;
				}
					
				}System.out.println("请输入姓名");
				String name = scanner.next();
				System.out.println("请输入年龄");
				String age = scanner.next();
				System.out.println("请输入性别");
				String sex = scanner.next();
				Student student  = new Student(stuNo, name, age, sex);
				stuList.add(student);
				writerFile(stuList);
				System.out.println("数据添加成功");
			}
		
	

	private static void writerFile(ArrayList<Student> stuList) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("data.txt"));
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			out.write(stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
			out.newLine();
		}out.close();
		
	}
	private static void updata(Scanner scanner) throws IOException {
		System.out.println("请输入要修改的学员");
		String stuNo =scanner.next();
		System.out.println("------------------------------------------------------");
		ArrayList<Student> stuList =readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu =stuList.get(i);
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("你要修改的学员信息为："+stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				System.out.println("请输入姓名");
				String name = scanner.next();
				System.out.println("请输入年龄");
				String age = scanner.next();
				System.out.println("请输入性别");
				String sex = scanner.next();
				stu.setName(name);
				stu.setAge(age);
				stu.setSex(sex);
			
				writerFile(stuList);
				System.out.println("修改成功");
				return;
				
			}
			
		}System.out.println("找不到数据");
	}

	private static void delete(Scanner scanner) throws IOException {
		System.out.println("请输入要删除的学号");
		String stuNo = scanner.next();
		ArrayList<Student> stuList = readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("要删除的学员为："+stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				System.out.println("确认要删除吗(1.删除    2.取消)");
				int op = scanner.nextInt();
				if (op==1) {
					stuList.remove(i);
					writerFile(stuList);
					System.out.println("信息已删除");
				}else{
					System.out.println("操作已取消");
				}return;
			}
		}
	}

	private static void findAll(Scanner scanner) throws IOException {
		ArrayList<Student> stuList = readAll();
		
			if (stuList==null||stuList.size()==0) {
				System.out.println("无数据");
			}else{
				System.out.println("\t学号\t姓名\t年龄\t性别");
			for (int i = 0; i <stuList.size(); i++) {
				Student stu =stuList.get(i);
				System.out.println("\t"+stu.getStuNo()+"\t"+stu.getName()+","+stu.getAge()+","+stu.getSex());
				
		}
			}
	}

	private static ArrayList<Student> readAll() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("data.txt"));
		ArrayList<Student> stuList = new ArrayList<>();
			String row = null;
			while((row= in.readLine())!=null){
				String[] strArray = row.split(",");
				Student stu = new Student(strArray[0],strArray[1], strArray[2], strArray[3]);
				stuList.add(stu);
			}
			in.close();
		return stuList;
	}
}
