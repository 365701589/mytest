package hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("number.txt"));
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			int n = random.nextInt(100)+1;
			out.write(n+"");
			out.newLine();
		}
		
		out.close();
	}

}
