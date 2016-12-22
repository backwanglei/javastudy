package Runnable;

import java.io.PrintStream;





class MyThreada implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
		System.out.println(Thread.currentThread().getName()
				+"运行-->"+i);
		
	}
	}	
}
public class RunnableDemo {
	public static void main(String []args) throws InterruptedException{
		PrintStream out= System.out;
		MyThreada my=new MyThreada();
		new Thread(my,"线程").start();
		my.run();
		Thread T=new Thread(my,"线程");
		out.println("判断线程是否已经启动："+T.isAlive());
		T.start();
		out.println("判断线程是否已经启动："+T.isAlive());
		for(int i=0;i<50;i++){
			if(i>10){
				T.join(); 
			
			}
			out.println("main 线程运行-->"+i);
		}
		
		
	 }

}
