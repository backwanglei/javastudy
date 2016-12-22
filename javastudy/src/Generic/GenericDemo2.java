package Generic;


public class GenericDemo2 {
	public static void  main(String []args){
		Integer[] i=fun1(1,2,3,4,5,6);//返回泛型数组
		fun2(i);//输出数组内容 
	} 
	public static<T> T[] fun1(T...arg){// 表示可以接收可变参数 可以是多个；
		return  arg;
	}
	public static<T> void fun2(T array[]){//接收泛型数组
		System.out.println("接收整形数组");
		for (T t : array) {
			System.out.print(t+",");
			
		}
		System.out.println();
	}

}
