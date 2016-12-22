package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IODemo2 {
	public static void main(String []args) throws IOException{
		File src=new File("F:"+File.separator+"temp"+File.separator
				+"text3.wmv");
		File file=new File("F:"+File.separator+"temp"+File.separator
				+"text3copy.wmv");
		BufferedInputStream buf=new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream str=new BufferedOutputStream(new FileOutputStream(file));
		byte b[]=new byte[36*1024*1024];
		 buf.read(b, 0, 36*1024*1024-1);
		        str.write(b);
			
		   buf.close();
		   str.close();
		}
       
}
