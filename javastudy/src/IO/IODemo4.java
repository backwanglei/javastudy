package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

	public class IODemo4 {
		public static void main(String []args) throws IOException{
		PrintStream out =System.out;
		File file=new File("E:"+File.separator+"temp"+File.separator
					+"test.txt");//声明file文件对象
		InputStream in =new FileInputStream(file);
		Reader reader= new InputStreamReader(in , "GBK");//利用方法读取中文
		char[]b=new char[(int) file.length()];//定义字符数组
		reader.read(b);//调用方法
		out.println(new String(b));//输出内容
		reader.close();//关闭流；
		
		Scanner sac=new Scanner(file);//定义scanner类
		String line=null;//定义字符串line为空
		while((sac.hasNextLine()&&(line=sac.nextLine())!=null)){//条件判断如果有下一行并且下一行不为空；line的内容不断循环

	
			if(!sac.hasNextLine());//下一行为空的时候，获得最后一行的内容
		
	
			}
		out.println("所需要的字符串为："+line);//输出最后一行
		String str =line ;//从读取中文件得到需要的字符串； 
		String pat="\\D+";//定义拆分规则
		Pattern pattern=Pattern.compile(pat);//实例化Pattern类
		String[] s=pattern.split(str);//定义s数组接受拆分的字符串
		int [] m=new int[s.length];//定义整形数组m跟s数组一样长度
		for(int i=0;i<s.length;i++){
				 m[i]=Integer.parseInt(s[i]);//将s数组转换成整形用m数组接收
				 out.print("参数值为:"+m[i]+",");//输出m数组的内容
				
			      
			}
		out.println();
		List<Integer>list=new ArrayList<Integer>();//list借口储存数据；
		for(int n=1;n<1000;n++){  //定义n表示该整数并进行循环
			if (Math.sqrt(n+100) % 1 == 0) {//完全平方的条件判断开平方取余为0
	              if (Math.sqrt(n+100+168) % 1 == 0){//条件判断
	              list.add(n);//将得到的结果加到list中；
	}
	        
	}
	}
		OutputStream on= new FileOutputStream(file,true);
		Writer writer =new OutputStreamWriter(on, "GBK");//定义writer调用方法转换写入的字串
		String chString="\r\n解题思路是：利用循环计算该数字分别加上100和268开平方后取余是不是为0";
		String enString="\r\n计算结果为:"+list.toString();
		writer.write(chString);//调用写入方法
		writer.write(enString);
		writer.close();
		}
		
		}			
		  
			
			
		





