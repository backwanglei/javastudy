package ArrayRef;

public class ArrayRefDemo2 {
	public static int []fun(){
		int score[]={1,3,5,7,9};
		return score;
	}
	public static void  print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]+"、");
		}
	}
    public  static void  main(String []args){
    	int []temp=fun();
    	print(temp);
    }
}
