package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String []args) throws FileNotFoundException{
		PrintStream out =System.out;
		Scanner sca =new Scanner(System.in);
		int m;double s;
		out.println("请输出数字");
		if (sca.hasNextInt()) {
			m=sca.nextInt();
			s=3*5*m;
			out.println("计算s的结果为"+s);
			
		}else{
			out.println("无法计算");
		}
		sca.close();
		
		File file= new File("F:"+File.separator+"temp"+File.separator+"test.txt");
	    InputStream is= new FileInputStream(file);
	    Scanner scanner2= new Scanner(is,"GBK");
	    out.println("文件内容是");
	    while (scanner2.hasNextLine()) {
			out.println(scanner2.nextLine());
			
		}
	    scanner2.close();
	}

}
