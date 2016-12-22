package ArrayRef;

public class ArrayRefDemo1 {
	public static  void  main(String []args){
		int []temp={1,3,5};//定义数组  并静态初始化
		fun(temp);
		for(int i=0;i<temp.length;i++){
		System.out.println(temp[i]);}
	}
	public  static void   fun(int x[]){
		x[0]=6;
	}
	

}
