package MultThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Account {
	private final Lock lock = new  ReentrantLock();
	private String AccountNO;
	private Double balance;
	public Account() {
		super();
	}
	public Account(String accountNO, Double balance) {
		super();
		AccountNO = accountNO;
		this.balance = balance;
	}
	
	public String getAccountNO() {
		return AccountNO;
	}

	 
	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}
	
	
	public Double getBalance() {
		return balance;
	}
	
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
