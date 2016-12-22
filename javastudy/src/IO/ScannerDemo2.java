package IO;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//程序有问题 无法显示正常时间；
public class ScannerDemo2 {
  public static void main(String []args){
	  PrintStream out =System.out;
	  Scanner sca= new Scanner(System.in);
	  out.println("输入时期(yyyy-MM-dd):");
	  String str=null;
	  Date date=new Date();
	  if(sca.hasNext("\\d{4}[^\\d]\\d{1,2}[^\\d]\\d{1,2}")){
		  str=sca.next("\\d{4}[^\\d]\\d{1,2}[^\\d]\\d{1,2}");
		  try{
			  date=new SimpleDateFormat("yyyy-MM-dd").parse(str);
		  }catch(ParseException e){
			  e.printStackTrace();
		  }
	  }else{
		  System.out.println("输入的日期格式错误!");
	  }
	  System.out.println(date);
	  
  }
}
