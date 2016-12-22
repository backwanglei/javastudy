package MultThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DrawRunable implements  Runnable{
	private final Lock lock  = new ReentrantLock();
	private  Account account;
	private  Double drawAmount;
	
	public DrawRunable() {
		;}
	public DrawRunable(Account account, Double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}
   public  void run(){
	     lock.lock();
           if(account.getBalance()>drawAmount){
		   System.out.println("取钱成功：取出钱为："+drawAmount);
		   double balance =account.getBalance()-drawAmount;//剩下的余额
		   account.setBalance(balance);//新的余额
		   System.out.println("取钱后剩下的余额："+balance);
	   }else{
		   System.out.println("没钱可以取");
	   }
	     lock.unlock();
   }
		
   }	

public class DrawMoneyRunableDemo {
	public static void main(String []args){
		Account account=new Account("123456", 2000D);
		DrawRunable drawRunable=new DrawRunable(account,700d);
		Thread myT=new Thread(drawRunable); 
		Thread myT1=new Thread(drawRunable);
		Thread myT2=new Thread(drawRunable);
		myT.start();
		myT1.start();
		myT2.start();
		
		
	}

}
