package Collection;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import javax.imageio.ImageTypeSpecifier;

import Person2.Famer;

public class TreeSetDemo {
	public static void  main(String []args){
		TreeSet<Famer> otr =new TreeSet<Famer>();
		PrintStream out =System.out;
		out.println("otr"+otr);
		out.println("otr"+otr.size());
		otr.add(new Famer("id---001",17));
		otr.add(new Famer("id-002",18));
		otr.add(new Famer("id-003",19));
		otr.add(new Famer("id-004",20));
		otr.add(new Famer("id-005",21));
		otr.add(new Famer("id-006",22));
		out.println("otr"+otr);
		out.println("otr"+otr.size());
		out.println("返回大于或等于的最小元素"+otr.ceiling(new Famer("id100",18)));
		out.println("返回包含元素的逆试图otr.descendingSet()"+otr.descendingSet());
		out.println("返回小于等于元素的最大元素"+otr.floor(new Famer("id-00",26)));
		out.println("返回部分视图"+otr.headSet(new Famer("id-007",17)));
		
		out.println("返回部分视图"+otr.headSet(new Famer("id-00",15) ));
		out.println("返回元素大于等于给定的视图"+otr.tailSet(new Famer("id-007",19)));
		Iterator<Famer> iterator=otr.iterator();
		while (iterator.hasNext()) {
			Famer famer = (Famer) iterator.next();
			out.println(famer);
			
		}
		TreeSet<Famer> otr2= (TreeSet<Famer>) otr.clone();
		out.println(otr);
		out.println(otr2);
		out.println("修改otr2的內容");
		for (Famer famer : otr2) {
			famer.setAge(27);
			}
		out.println(otr);
		out.println(otr2);
		
		
		
	}
}