package MultThreading;
class MyThread5 implements Runnable{
	private int ticket =5;
	public  /*synchronized*/ void run(){
		for(int i=0;i<=100;i++){
			synchronized (this) {
				if(ticket>0){
				/*try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				System.out.println("卖票：ticket"+ticket--);
			}
			
		}
	}
}
}
public class ThreadDemo4 {
	public static void main(String []args){
	  MyThread5 myT=new MyThread5();
		Thread t1=new Thread(myT);
		Thread t2=new Thread(myT);
		Thread t3=new Thread(myT);
		Thread t4=new Thread(myT);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
