package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderWriterDemo {
	public static void main(String[]args) throws IOException{
		File file =new File("F:"+File.separator+"temp"+File.separator
				+"test1.txt");
		File file2 =new File("F:"+File.separator+"temp"+File.separator
				+"test.txt");
		Reader reader = new FileReader(file);
		char[]c=new char[1024];
		reader.read(c);
		System.out.println("c"+c);
		System.out.println(new String(c));
		System.out.println("");
		
		InputStream ion =new FileInputStream(file2);
	       Reader reader2=new InputStreamReader(ion, "GBK");
	       char[]b2=new char[(int) file2.length()];
	       reader2.read(b2);
	       System.out.println("b2"+b2);
	       System.out.println(new String(b2));//将全部的字符数组变成字符串
	       
	}
	 
}
