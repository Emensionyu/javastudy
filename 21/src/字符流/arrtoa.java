package ×Ö·ûÁ÷;

import java.io.*;
import java.util.ArrayList;

public class arrtoa {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array=new ArrayList<String>();
		array.add("It");
		array.add("a");
		array.add("good");
		array.add("day");
		BufferedWriter fs=new BufferedWriter( new FileWriter("hope.txt"));
		for(String s:array) {
			fs.write(s);
			fs.newLine();
			fs.flush();
			
		}
		fs.close();
	}

}
