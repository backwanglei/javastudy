import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		int intArray[]={92,85,65,83};
		int array[]=new int[5];
		/*System.arraycopy(intArray, 0, array, 3, 2);
		for (int i : array) {
			System.out.println(i);*/
			
		
	    Arrays.sort(intArray);
	    for (int i : intArray) {
	    	System.out.print(i+"\t");
			
		}
	}	
}
	
	


