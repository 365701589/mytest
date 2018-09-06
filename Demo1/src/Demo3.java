import java.util.ArrayList;
import java.util.Set;

public class Demo3 {
	//{“Just”,“Have”,”Faith”},遍历该数组，
	//拿到每个元素，
	//截取每个元素的后两个字符并打印在控制台上
	public static void main(String[] args) {
		String[] arr ={"Just","Have","Faith"};
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(arr[i].substring(arr[i].length()-2,arr[i].length()));
		}
	/*ArrayList<Book> list = new ArrayList<>();
		Book book= new Book();
		book.setName("Java基础入门");
		book.setAuthor("传智播客");
		book.setPublisher("清华大学出版社");
		Book book1 = new Book();
		book1.setName("Java学习笔记");
		book1.setAuthor("林信良");
		book1.setPublisher("人民邮电出版社");
		Book book2 = new Book();
		book2.setName("C语言入门经典");
		book2.setAuthor("霍顿");
		book2.setPublisher("清华大学出版社");
			list.add(book);
			list.add(book1);
			list.add(book2);
			
			for (int i = 0; i <list.size(); i++) {
				//String ss= list.toString();
				//Book b = list.get(i);
			//String string =b.getPublisher();
			
				
				if("清华大学出版社".indexOf(list.get(i).getPublisher())!=-1){
				//	if((list.get(i).getPublisher()).indexOf("清华大学出版社")!=-1){
				
				//Book b = list.get(i);
				//if ("清华大学出版社".equals(b.getPublisher())) {
					System.out.println(list.get(i).getAuthor()+","+list.get(i).getName()+","+list.get(i).getPublisher());
				}
			}
		*/
	}
}

