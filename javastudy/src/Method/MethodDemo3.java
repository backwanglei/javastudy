package Method;

import java.security.Timestamp;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.print.attribute.standard.RequestingUserName;

public class MethodDemo3 {
	public static double fun(double x){
		  double temp = 0;
		  if(x==1){
			  temp =1;
		
	}
	      for(x=2;x<=30;x++){
	    	 temp =x*(x-1);
	    	  
			  
			  
		  }
		      return temp;
	}
	       
       public static  void main(String[] arsg  ){
    	    double sum = fun(1)+fun(30);
    	   System.out.println("sum的结果是"+sum);
    	   
    	   
    	   
    	   
    	   
       }
}
