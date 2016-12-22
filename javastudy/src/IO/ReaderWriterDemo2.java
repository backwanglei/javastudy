package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class ReaderWriterDemo2 {
	public static void  main(String []args) throws IOException{
		File file= new File("F:"+File.separator+"temp"+File.separator+
				"test.txt");
		File file2= new File("F:"+File.separator+"temp"+File.separator+
				"test1.txt");
		Writer writer=new FileWriter(file,true);
		OutputStream in=new FileOutputStream(file2,true);
		Writer writer2 =new OutputStreamWriter(in, "GBK");
		System.out.println("向尾部追加内容");
		String enstring = "\r\n我超帅";
		String cnString ="\r\nwanglei" ;
		writer2.write(enstring);
		writer.write(cnString);
		writer.close();
		writer2.close();
		System.out.println("向尾部追加内容");
	
	
}

}
