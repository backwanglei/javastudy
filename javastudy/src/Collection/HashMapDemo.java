package Collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
public static  void  main(String []args){
		HashMap<Long, Integer> str =new HashMap<Long,Integer>();
		PrintStream out=System.out;
	    out.println("str.size()"+str.size());
	    str.put(11L, 1);
	    str.put(12L, 2);
	    str.put(13L, 3);
	    str.put(14L, 4);
	    str.put(15L, 5);
	    out.println("str"+str);
	    out.println("str.size()"+str.size());
	  Set<Map.Entry<Long, Integer>>allset= str.entrySet();
	    for (Entry<Long, Integer> entry : allset) {
	    	out.println("entry"+entry);
	    	out.println(entry.getKey()+"---"+entry.getValue());
			
		}
	    
	    out.println("str.get(14L)"+str.get(14L));
	    out.println("輸出所有的key");
	    for (Long key :str.keySet() ) {
	    	out.println(key);
			
		}
	    
	    out.println("检验是否存在");
	    out.println("str.containsKey(14L)"+str.containsKey(14L));
	    out.println("str.containsKey(19L)"+str.containsKey(19L));
	    out.println("str.containsKey(11)"+str.containsKey(11));	
	    out.println("str.containsValue(4)"+str.containsValue(4));
	    out.println("str.containsValue(0)"+str.containsValue(0));
	    out.println("str.containsValue(11L)"+str.containsValue(11L));
	    out.println("删除映射");
	    str.remove(14L);
	    out.println("str"+str);
	    str.replace(15L, 150);
	    out.println("str"+str);
	    str.replace(15L, 150,175);
	    out.println("str"+str);
	    for (Integer entry : str.values()) {
	    	out.println(entry);
			
		}
	    
		}
       
	}


