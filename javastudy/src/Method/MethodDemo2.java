package Method;

public class MethodDemo2 {
	public static int print(int x ,int y){
		int temp = x+y;
		return temp;
		
	}
	public static int print(int x,int y,int z){
		int temp = x+y+z;
		return temp;
	}
   public static float print(float x,float y){
	   float temp = x+y;
	   return temp;
   }
   public static void  main(String[] args){
	   int  a= print(5,6 );
	   int b = print(2, 4,6);
	   float c =print(2.3f, 4.5f);
	   System.out.println("a的计算结果为:"+a);
	   System.out.println("b的计算结果为:"+b);
	   System.out.println("c的计算结果为:"+c);
   }
}
