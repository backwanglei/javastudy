package Method;

public class MethodDemo {
	public static int addOne(int x,int y){
		int temp = x +  y;
		return temp ;

	}
   public static float addtwo(float a,float b){
	   float temp = a+b;
	   return temp ;
   }
   public static void main(String[] args){
	   int one = addOne(20, 46);
	   float two =addtwo(4.3f, 5.2f);
	   System.out.println("addOne的计算结果为："+one);
	   System.out.println("addTwo的计算结果为："+two);
   }
}

