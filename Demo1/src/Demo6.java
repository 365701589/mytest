
import java.util.Scanner;
public class Demo6 {
	/*����¼���Լ�������(String),����(int),���(int)���浽��Ӧ�ı�����,
	��������:�ҵ�����������,����25��,���180CM
	(��ʾ������String����,��Ҫʹ��Scanner��next()����.)*/
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������");
			String name =scanner.next();
		
			System.out.println("����������");
			int age = scanner.nextInt();
			
			System.out.println("���������");
			int tall = scanner.nextInt();
			System.out.println(name+","+age+"��"+","+tall+"cm");
}
}