package ClassLibraries;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
	public static void main(String []args){
		DateFormat df1 =null;
		df1=DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,
				DateFormat.ERA_FIELD,new Locale("zh", "CN"));
		System.out.println("当前时间为："+df1.format(new Date()));
	}

}
