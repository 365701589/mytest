import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		Scanner scanner= new Scanner(System.in);
		while(true){
			System.out.println("=====================================");
			System.out.println("欢迎使用学员管理系统：");
			System.out.println("");
			System.out.println("1.添加	2.修改	3.删除	 4.查询所有	5退出：");
			System.out.println("---------------------------------------");
			int op = scanner.nextInt();
			switch (op) {
			case 1:
				add(scanner);
				break;
			case 2:
				xiuGai(scanner);
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
				System.out.println("输入错误");
				break;
			}
		}
	}
		//添加
	private static void add(Scanner scanner) throws IOException {
		System.out.println("请输入要添加的学号");
		String stuNo = scanner.next();
		ArrayList<Student> stuList= readAll();
		for (int i = 0; i < stuList.size(); i++) {
			Student stu =stuList.get(i);
			
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("数据已经存在");
				return;
				
			}
		}System.out.println("请输入学生姓名");
		String name = scanner.next();
		System.out.println("请输入学生年龄");
		String age = scanner.next();
		System.out.println("请输入学生性别");
		String sex = scanner.next();
		Student stu = new Student(stuNo, name, age, sex);
			stuList.add(stu);
			writeFile(stuList);
			System.out.println("数据添加成功");
				
	}
		//覆盖方法
	private static void writeFile(ArrayList<Student> stuList) throws IOException {
			BufferedWriter out = new BufferedWriter(new FileWriter("Data.txt"));
			for (int i = 0; i <stuList.size(); i++) {
				Student stu = stuList.get(i);
				out.write(stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				out.newLine();
			}out.close();
		
	}
		//修改
	private static void xiuGai(Scanner scanner) throws IOException {
		System.out.println("请输入要修改的学员");
		String stuNo = scanner.next();
		System.out.println("-----------------------------------------------------------------");
		ArrayList<Student> stuList = readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("学员信息为："+stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				System.out.println("请输入姓名");
				String name = scanner.next();
				System.out.println("请输入年龄");
				String age = scanner.next();
				System.out.println("请输入性别");
				String sex = scanner.next();
					stu.setName(name);
					stu.setAge(age);
					stu.setSex(sex);
					
					writeFile(stuList);
					System.out.println("数据已经被修改");
					return;
					
				
			}
		}System.out.println("学员不存在");
		}
		
	
		//删除
	private static void delete(Scanner scanner) throws IOException {
		System.out.println("请输入要删除的学号");
		String stuNo = scanner.next();
		ArrayList<Student> stuList= readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("你要删除的学员为："+stu.getStuNo()+","+stu.getName()+","+stu.getAge()+","+stu.getSex());
				System.out.println("确定要删除吗"+"1.删除    2.取消");
				int n = scanner.nextInt();
				if (n==1) {
					stuList.remove(i);
				}
			}writeFile(stuList);
			System.out.println();
		}
		
	}

		//打印所有
	private static void findAll(Scanner scanner) throws IOException {
		ArrayList<Student> stuList = readAll();
		if (stuList==null||stuList.size()==0) {
			System.out.println("无数据");
		}else{
			System.out.println("\t学号\t姓名\t年龄\t成绩");
			System.out.println("---------------------------------------------");
			
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			System.out.println("\t"+stu.getStuNo()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getSex());
		}
		}
		
		
	}		//写入方法
	public static ArrayList<Student> readAll() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("data.txt"));
		ArrayList<Student> stuList = new ArrayList<>();
		String row = null;
		while((row=in.readLine())!=null){
			String[] strArray= row.split(",");
			Student stu = new Student(strArray[0], strArray[1], strArray[2], strArray[3]);
			stuList.add(stu);
		}in.close();
		return stuList;
		
	}

}
