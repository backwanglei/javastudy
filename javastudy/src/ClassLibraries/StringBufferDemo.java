package ClassLibraries;

import java.io.PrintStream;

public class StringBufferDemo {
	public static void main(String []args){
		PrintStream out =System.out;
		StringBuffer buf = new StringBuffer();
		buf.append("Hello World");
		buf.append("CHINA");
		buf.append(18);
		buf.append(18.2d);
		out.println(buf.toString());
		out.println("返回添加之前当前容量："+buf.capacity());
		out.println("buf的长度："+buf.length());
		buf.append("lol");
		out.println("buf添加之后的长度："+buf.length());
		out.println("添加指定序列："+buf.toString());
		out.println("返回当前容量："+buf.capacity());
		out.println("返回指定位置："+buf.codePointAt(5));
		buf.delete(0, 1);
		out.println("删除指定位置的字符串："+buf.toString());
		out.println("删除指定位置的字符:"+buf.deleteCharAt(4));
		buf.ensureCapacity(30);
		out.println("指定容量："+buf.toString());
		out.println("反转字符串："+buf.reverse());
		buf.append(1).append("l");
		out.println(buf.toString());
		buf.insert(0, "wanglei");
		out.println(buf.toString());
		if(buf.indexOf("hello")==-1){
			out.println("没有查到指定的字符串");
		}else{
			out.println("查到指定的字符串");
		}
	}
	
	

}
