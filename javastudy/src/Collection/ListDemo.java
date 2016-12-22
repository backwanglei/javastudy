package Collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String []args){
		List<String> str=new ArrayList<String>();
		List<String> str2=new ArrayList<String>();
		PrintStream out =System.out;
		out.println("str:"+str.toString());
		out.println("给str增加内容");
		str.add("Hello");
		str.add("world");
		str.add("I");
		str.add("am");
		out.println("str:"+str);
		out.println("给str2增加内容");
		str2.add("boy");
		out.println("str2:"+str2);
		out.println("给str指定位置增加内容");
		str.add(4, "a");
		out.println("str:"+str);
		out.println("将整个类集加进去");
		str.addAll(str2);
		out.println("str:"+str);
		out.println("是否包含某元素str.contains('am')："+str.contains("am"));
		out.println("是否包含某类集str.containsAll(str2)："+str.containsAll(str2));
		out.println("比较指定的对象是否相等str.equals(str2)"+str.equals(str2));
		out.println("获得列表中指定位置的元素str.get(3)："+str.get(3));
		out.println("显示列表的长度str.size()："+str.size());
		out.println("返回元素索引str.indexOf('am'):"+str.indexOf("am"));
		out.println("返回元素索引str.indexOf('girl'):"+str.indexOf("girl"));
		out.println("判断列表是否包含元素str.isEmpty()"+str.isEmpty());
		str.set(5,"girl");
		out.println("替换元素str："+str);
        out.println("输出指定位置的内容str.subList(1, 4):"+str.subList(1, 4));
		Object[] object=str.toArray();
		for (Object object2 : object) {
			out.print(object2);
			
		}
		
		
	}

	
	}


