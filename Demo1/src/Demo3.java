import java.util.ArrayList;
import java.util.Set;

public class Demo3 {
	//{��Just��,��Have��,��Faith��},���������飬
	//�õ�ÿ��Ԫ�أ�
	//��ȡÿ��Ԫ�صĺ������ַ�����ӡ�ڿ���̨��
	public static void main(String[] args) {
		String[] arr ={"Just","Have","Faith"};
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(arr[i].substring(arr[i].length()-2,arr[i].length()));
		}
	/*ArrayList<Book> list = new ArrayList<>();
		Book book= new Book();
		book.setName("Java��������");
		book.setAuthor("���ǲ���");
		book.setPublisher("�廪��ѧ������");
		Book book1 = new Book();
		book1.setName("Javaѧϰ�ʼ�");
		book1.setAuthor("������");
		book1.setPublisher("�����ʵ������");
		Book book2 = new Book();
		book2.setName("C�������ž���");
		book2.setAuthor("����");
		book2.setPublisher("�廪��ѧ������");
			list.add(book);
			list.add(book1);
			list.add(book2);
			
			for (int i = 0; i <list.size(); i++) {
				//String ss= list.toString();
				//Book b = list.get(i);
			//String string =b.getPublisher();
			
				
				if("�廪��ѧ������".indexOf(list.get(i).getPublisher())!=-1){
				//	if((list.get(i).getPublisher()).indexOf("�廪��ѧ������")!=-1){
				
				//Book b = list.get(i);
				//if ("�廪��ѧ������".equals(b.getPublisher())) {
					System.out.println(list.get(i).getAuthor()+","+list.get(i).getName()+","+list.get(i).getPublisher());
				}
			}
		*/
	}
}

