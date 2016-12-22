package MultThreading;
class MyRunable2 implements Runnable{
	private int i;
	public void run(){
		System.out.println("in MyRunable run");
		for(i =0;i<3;i++){
			System.out.println(Thread.currentThread().getName()
					+"运行--->"+i);
		}
	}
}

public class RunableDemo2 {
	public static void main(String []args){
		MyRunable myRunable=new MyRunable();
		Thread thread= new Thread(myRunable,"线程");
		System.out.println("程序运行执行之前："+thread.isAlive());
		thread.start();
		System.out.println("程序运行执行之后："+thread.isAlive());	
		for(int i=0;i<5;i++){
			System.out.println("main运行--->"+i);
			
		}
       System.out.println("代码执行之后-->"+thread.isAlive());
}
	}
