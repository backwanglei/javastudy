package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.regex.Pattern;

public class IODemo3 {
	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File file = new File("E:" + File.separator + "temp" + File.separator + "text2.txt");// 声明file文件对象
		InputStream in = new FileInputStream(file);
		Reader reader = new InputStreamReader(in, "GBK");// 利用方法读取中文
		char[] b = new char[(int) file.length()];// 定义字符数组
		reader.read(b);// 调用方法
		out.println(new String(b));// 输出内容
		reader.close();// 关闭流；
		BufferedReader buf=new BufferedReader(new FileReader(file));
		String line=null;
		while((line=buf.readLine())!=null){
			if(line.contains("#"))
				out.println(line);
				}
		    out.println("所需要的字符串为："+line);
			String str = line;// 从读取中文件得到需要的字符串；
			String pat = "\\D+";// 定义拆分规则
			Pattern pattern = Pattern.compile(pat);// 实例化Pattern类
			String[] s = pattern.split(str);// 定义s数组接受拆分的字符串
			int[] m = new int[s.length];// 定义整形数组m跟s数组一样长度
			for (int i = 0; i < s.length; i++) {
				m[i] = Integer.parseInt(s[i]);// 将s数组转换成整形用m数组接收
				out.print("参数值为:" + m[i] + ",");// 输出m数组的内容
			}
			}
			
		}
		        
		
	

