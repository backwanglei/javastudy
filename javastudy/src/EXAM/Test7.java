package EXAM;
import java.lang.reflect.Method;

class Run implements Runnable{
	public void run(){
		try{
			Class<?> c1=Class.forName("EXAM.Test6"); 
			Method met=c1.getMethod("say"); 
				met.invoke(c1.newInstance());
			}catch(Exception e){
				e.printStackTrace();
		}
	}
}
public class Test7 {
	public static void main(String []args){
	  Run r=new Run();
	  Thread thread=new Thread(r);
	   thread.start();

}
}