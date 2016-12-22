package ClassLibraries;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDemo2 {
	public static void main(String []args){
		PrintStream out=System.out;
		Calendar calendar=new GregorianCalendar();
		out.println("年："+calendar.get(Calendar.YEAR));
		out.println("月："+calendar.get(Calendar.MONTH)+1);
		out.println("日："+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		out.println("时："+calendar.get(Calendar.HOUR_OF_DAY));
		out.println("分："+calendar.get(Calendar.MINUTE));
		out.println("秒："+calendar.get(Calendar.SECOND));
		out.println("毫秒："+calendar.get(Calendar.MILLISECOND));
		
		
	}

}
