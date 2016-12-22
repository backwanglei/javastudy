package MultThreading;
/*class Mythread extends Thread{
	
}*/

import java.io.PrintStream;

public class ThreadDemo {
	public static void main(String []args) throws InterruptedException{
		PrintStream out=System.out;
		Thread thread=Thread.currentThread();	
		out.println("返回当前线程的名称："+thread.getName());
		out.println("返回线程的优先级："+thread.getPriority());
		out.println("返回线程的标识符："+thread.getId());
		out.println("返回该线程的状态："+thread.getState());
		out.println("检测线程是否已经中断："+thread.interrupted());
		out.println("当前时间："+System.currentTimeMillis());
		thread.sleep(3000);
		out.println("检测是否处于活动状态："+thread.isAlive());
		out.println("当前时间："+System.currentTimeMillis());
		
	}

}
