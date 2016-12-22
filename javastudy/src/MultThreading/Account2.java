package MultThreading;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Account2 {
	private String accontNum;
	private Double balance;
	private boolean hasMoney =false;
	public Account2() {
		super();
	}
	public Account2(String accontNum, Double balance) {
		super();
		this.accontNum = accontNum;
		this.balance = balance;
	}
	//存钱方法
	public synchronized void draw(double drawamount,int i){
		if(!hasMoney){//当前没人存钱进去
			try {
				System.out.println(Thread.currentThread().getName()
						+"等到wait执行"+"wait执行"+"--i="+i);

				wait();
			  System.out.println(Thread.currentThread().getName() + " 执行了wait操作" + " 执行了wait操作" + " -- i=" + i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}else{//开始取钱
				System.out.println(Thread.currentThread().getName()
						+"取钱--执行完毕"+drawamount+"--i="+i);
				setBalance(getBalance()-drawamount);
				System.out.println("取钱后余额为："+getBalance());
				
				hasMoney=false;
				notifyAll();
				System.out.println(Thread.currentThread().getName() + "-- 取钱 -- 执行完毕"
				+ " -- i=" + i);
		}
		
	}
	public synchronized void deposit(double depositeamount,int i){
		if(hasMoney){
			try {
				System.out.println(Thread.currentThread().getName()
						+"开始执行wait操作"+"--i="+i);
				wait();
				System.out.println(Thread.currentThread().getName() + " 执行了wait操作" + " -- i=" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			}else{
				System.out.println(Thread.currentThread().getName() + " 存款:" + depositeamount + " -- i=" + i);
		}       setBalance(getBalance()+depositeamount);
		         System.out.println("存钱后的余额"+getBalance());
		         hasMoney=true;
		         notifyAll();
		         System.out.println(Thread.currentThread().getName() + "-- 存钱 -- 执行完毕" + " -- i=" + i);
	}
}
           
