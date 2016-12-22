package Collection;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;

import Person2.Famer;

public class LinkedListDemo {
	public static void main(String []args){
		PrintStream out=System.out;
		LinkedList<Famer> str =new LinkedList<Famer>();
		out.println("str:"+str);
		out.println("str.size()"+str.size());
		
		str.add(new Famer("id---001",18));
		str.add(new Famer("id---002",19));
		str.add(new Famer("id---003",20));
		str.add(new Famer("id---004",21));
		str.add(new Famer("id---005",22));
		out.println("str赋值后的:"+str);
		out.println("str.size()赋值后"+str.size());
		str.addFirst(new Famer("id---000",17));
		str.addLast(new Famer("id---006",23));
		out.println("str:"+str);
		Iterator<Famer> iterator=str.descendingIterator();
		while (iterator.hasNext()) {
			Famer famer = (Famer) iterator.next();
			out.println(famer);
			
		}
		out.println("获取不移除头的元素str.element()"+str.element());
		out.println("获取不移除最后一个元素str.peekLast()"+str.peekLast());
		out.println("获取并移除头元素str.poll()"+str.poll());
		out.println("被移除头元素str"+str);
		out.println("获取并移除最后一个元素str.pollLast()："+str.pollLast());
	    out.println("被移除最后一个元素str"+str);
	    out.println("弹出一个元素："+str.poll());
	    str.push(new Famer("id---008",24));
	    out.println("推入堆栈str"+str);
	}
	
			
		
		
	}




