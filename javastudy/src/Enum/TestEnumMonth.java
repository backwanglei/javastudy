package Enum;

import java.io.PrintStream;


public class TestEnumMonth{
	PrintStream out =System.out;
	public static void print( MonthDemo shr){ //定义方法  MOnthEnum2为参数类型
		PrintStream out =System.out;
		switch(shr){
		case January:
			out.println("一月");
			break;
		case February:
			out.println("二月");
			break;
		case march:
			out.println("三月");
			break;
		case April:
			out.println("四月");
			break;
		case may:
			out.println("五月");
			break;
		default:
			out.println("空白");
		}
		}
	public static void print2( MonthEnum2 shr){
		PrintStream out=System.out;
		switch(shr){
		case January:
			PrintMonth(shr, out);
			break;
		case February:
			PrintMonth(shr, out);
			break;
		case march:
			PrintMonth(shr, out);
			break;
		case April:
			PrintMonth(shr, out);;
			break;
		case may:
			PrintMonth(shr, out);
			break;
		default:
			out.println("空白");
		}
		
	}
	private static void PrintMonth(MonthEnum2 shr, PrintStream out) {
		out.println(shr.getFate()+"-----"+shr.getSeason());
	}
		public static void main(String[] args){
		// print(MonthDemo.January);
		/* print(MonthEnum2.February);
		 print(MonthEnum2.march);
		 print(MonthEnum2.April);
		 print(MonthEnum2.may);
		 print(MonthEnum2.June);*/
		 print2(MonthEnum2.January);
		 print2(MonthEnum2.February);
		 print2(MonthEnum2.march);
		 print2(MonthEnum2.April);
		 print2(MonthEnum2.may);
		 print2(MonthEnum2.June);
		 System.out.println("--------------");
		 for (MonthEnum2 c : MonthEnum2.values()) {
			 System.out.println(c.name()+":"+c.getFate()+"---"+c.getSeason());
						}
}

}
