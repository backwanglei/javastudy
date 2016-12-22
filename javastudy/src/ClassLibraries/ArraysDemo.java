package ClassLibraries;

import java.io.PrintStream;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArraysDemo {
	public static void main(String []args){
		PrintStream out= System.out;
		int [] temp={2,3,8,6,7,4,1};
		Arrays.sort(temp);
		out.println(Arrays.toString(temp));
		int point=Arrays.binarySearch(temp, 2);
		out.println(point);
		
			
		}
		
		
		
		
		
		
	}


