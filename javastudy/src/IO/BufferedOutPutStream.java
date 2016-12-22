package IO;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedOutPutStream{
   public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			File file1 = new File("D:\\demo\\shiping\\77ObjectStreamDemo_2016-11-04_115826.wmv ");
			File file2 = new File("D:\\demo\\shiping\\copy2.wmv");
			FileInputStream in = new FileInputStream(file1);
			FileOutputStream out = new FileOutputStream(file2);
			
			BufferedOutputStream fo = new BufferedOutputStream(out);
			BufferedInputStream fi = new BufferedInputStream(in);

			byte[] a = new byte[300];
			int tmp;
			while((tmp=fi.read(a))!=-1){
				fo.write(a, 0, tmp);
				//fo.write(a);
			}
			fi.close();
			fo.close();
			System.out.println("复制完成");
		}

	}
 
