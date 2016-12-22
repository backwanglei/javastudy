package MultThreading;

import java.io.PrintStream;

class Mythread extends Thread implements Runnable {
		/*private int ticket=10;*/
		public void run(){//覆写run方法
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()
						+"运行，i="+i);
				
				
				}
			}
		}


	public class ThreadDemo1 {
		public static void main(String []args){
			PrintStream out=System.out;
		/*	Thread thread=new Mythread();//表明关系 不然会出现类型转换异常
			Mythread mythread=(Mythread)thread;//向下转型
			Mythread mythread2=(Mythread)thread;
			Mythread mythread3=(Mythread)thread;
			mythread.run();
			mythread2.run();
			mythread3.run();
			*/
			Mythread my=new Mythread();
			new Thread(my).start();
			new Thread(my,"线程--A").start();
			new Thread(my,"线程--B").start();
			new Thread(my).start();
			new Thread(my).start();
			
		}
		

	}



