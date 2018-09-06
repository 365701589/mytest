
import java.util.Scanner;
public class Demo6 {
	/*键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中,
	输出结果如:我的姓名是张三,年龄25岁,身高180CM
	(提示姓名是String类型,需要使用Scanner的next()方法.)*/
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入姓名");
			String name =scanner.next();
		
			System.out.println("请输入年龄");
			int age = scanner.nextInt();
			
			System.out.println("请输入身高");
			int tall = scanner.nextInt();
			System.out.println(name+","+age+"岁"+","+tall+"cm");
}
}