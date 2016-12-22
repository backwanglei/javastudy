package getURL;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DATE {
   public static void main(String []args){
	   String url=null;
	   Calendar calendar=Calendar.getInstance();
	    calendar.set(2009,00,16);
	    String str="2016/12.14";
	    for(int i=0;i<3;i++){
	    	calendar.add(Calendar.DAY_OF_MONTH, 1);
		    SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM.dd");
		    String dString=sd.format(calendar.getTime());
		   url="http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/"+dString+".json";
		   System.out.println(url); 
		   if(url.equals("http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/2009/01.18.json")){
		    	System.out.println("1");
	    }
	   
	    }
	    }
	    
	    
   }

