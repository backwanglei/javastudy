package Collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetDemo {
	public static void main(String []args){
		Set<Integer> str=new HashSet<Integer>();
		Set<Integer> str2=new HashSet<Integer>();
        PrintStream out =System.out;
		out.println("str:"+str);
		str.add(11);
		str.add(12);
		str.add(13);
		str.add(14);
		out.println("str:"+str);
		out.println("类集长度str.size():"+str.size());
		str2.add(12);
		str2.add(15);
		str2.add(16);
		str2.add(17);
		out.println("str2:"+str2);
		out.println("类集长度str.size():"+str.size());
		str.addAll(str2);
		out.println("str:"+str);
		out.println("类集长度str.size():"+str.size());
		out.println("是否包含指定元素str.contains(14)："+str.contains(14));
		out.println("是否包含所有元素str.containsAll(str2):"+str.containsAll(str2));
		out.println("判断对象是否相等str.equals(str2)"+str.equals(str2));
		out.println("判断是否有元素str.isEmpty()："+str.isEmpty());
		out.println("移除元素str.remove(14)"+str.remove(14));
		out.println("str:"+str);
		Object[] object=str.toArray();
		for (Object object2 : object) {
			out.print(object2);
			}
		out.println();
		Object[]object1=str.toArray(new Integer[2]);
		for (Object object2 : object1) {
			out.print(object2);
			
		}
		out.println();
		List<Integer> intlist=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			intlist.add(i+10);
	}
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		intlist.add(11);
		out.println("intlist:"+intlist);//判断是不是有重复的元素
		List<Integer> intList2 = new ArrayList<Integer>();
		intList2.add(11);
		out.println("intList.removeAll(intList2) :" + intlist.removeAll(intList2));
		out.println("intList :" + intlist);
		intlist.removeAll(str);
		out.println("intList :" + intlist);
		
		
		}
	  
	}
