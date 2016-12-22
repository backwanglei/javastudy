package base;

import java.io.PrintStream;

public class MyPrint {
	public static void main(String[] args){
		args[0] = "123";
		args[1] = "456";
		PrintStream out =System.out;
		out.println("Hello World");
		out.println("我的年龄是" + args[0] + "我的身高是 " + args[1]);

	}

		}
