import java.beans.DefaultPersistenceDelegate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("**********************************************");
		System.out.println("��ӭʹ��ѧԱ����ϵͳ");
		System.out.println("");
		System.out.println("1.���     2.�޸�     3.ɾ��     4.��ѯ����     5.�˳�");
		System.out.println("*************************************************");
		int op = scanner.nextInt();
		switch(op){
			case 1 :
				add(scanner);
				break;
			case 2:
				updata(scanner);
				break;
			case 3:
				delete(scanner);
			case 4:
				findAll(scanner);
				break;
			case 5:
				System.out.println("ллʹ��");
				System.exit(0);
			default:
				System.out.println("�������");
				break;
			}
		}
	}
		//���
	private static void add(Scanner scanner) throws IOException {
		System.out.println("������Ҫ��ӵ�ѧԱ");
		String stuNo = scanner.next();
		ArrayList<Student> stuList = readAll();
		for (int i = 0; i <stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getStuNo().equals(stuNo)) {
				System.out.println("�����Ѵ���");
			}
		}System.out.println("����������");
			String name = scanner.next();
		System.out.println("����������");
		String age = scanner.next();
		System.out.println("�������Ա�");
		String sex = scanner.next();
		Student stu = new Student(stuNo, name, age, sex);
		stuList.add(stu);
		WriterFile(stuList);
		System.out.println("������ӳɹ�");
			
		}
		
	

	private static void WriterFile(ArrayList<Student> stuList) throws IOException {
			BufferedWriter out = new BufferedWriter(new FileWriter("data.txt"));
			for (int i = 0; i < array.length; i++) {
				
			}
		
	}
	private static void updata(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void delete(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	private static void findAll(Scanner scanner) throws IOException {
		ArrayList<Student> stuList = readAll();
		if (stuList==null||stuList.size()==0) {
			System.out.println("������");
		}else{
			System.out.println("\tѧ��\t����\t����\t�Ա�");
		}for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			System.out.println("\t"+stu.getStuNo()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getSex());
		}
		
	}

	private static ArrayList<Student> readAll() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("data.txt"));
		ArrayList<Student> stuList = new ArrayList<>();
		String row = null;
		while((row = in.readLine())!=null){
			String[] str = row.split(",");
			Student stu = new Student(str[0], str[1], str[2], str[3]);
			stuList.add(stu);
			in.close();
		}
		return stuList;
	}


}
