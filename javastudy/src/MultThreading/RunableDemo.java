package MultThreading;
class MyRunable implements Runnable{
	private int i=0;
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()
					+"i="+i);
		}
	}
	
}

	


public class RunableDemo {
	public static void main(String []args){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()
					+"i="+i);
			if(i==3){
				MyRunable myrunable =new MyRunable();
				Thread thread1=new Thread(myrunable);
				Thread thread2=new Thread(myrunable,"线程");
				thread1.start();
				thread2.start();
				
		}
		 
			
		}
	}

}
