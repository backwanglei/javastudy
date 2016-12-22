
public class ArrayRefDemo {
	public static void main(String[] args){
		int temp[] ={1,3,5};
		fun(temp);
		for(int i =0;i<=temp.length;i++){
			System.out.println(temp[i]+"、");
			
		}
			
	}
      public static  void fun(int x[]){
    	  x[0]=6;
      }
}
