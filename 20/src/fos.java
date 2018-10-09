import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class fos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("fos.txt");
		fos.write("goood night".getBytes());

	}

}
