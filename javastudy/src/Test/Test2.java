package Test;

import java.lang.reflect.Method;
/*class Run implements Runnable{
	public  void run(){
		try{
			Class<?> c1=Class.forName("Test.Calculate"); 
			Method met=c1.getMethod("print"); 
				met.invoke(c1.newInstance());
			}catch(Exception e){
				e.printStackTrace();
		}
	
		}
	}
*/

public class Test2 {
	public static void main(String []args) throws ClassNotFoundException{
		Class<?> c1=Class.forName("Test.Calculate"); 
		Calculate cal=new Calculate();
		Thread thread=new Thread(cal,"子线程");
		try{
			Method met=c1.getMethod("print"); 
			met.invoke(c1.newInstance());
		}catch(Exception e){
			e.printStackTrace();
		}
		 thread.start();
		 
	}

}
		
	




