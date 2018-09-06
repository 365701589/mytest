import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		
		String ss=null;
		int count =0;
		while((ss= reader.readLine())!=null){
			
			if(ss.indexOf("Java")!=-1){
				count++;
				System.out.println(ss);
			}
		}
		System.out.println(count);
	}

}