package Person2;

import java.lang.reflect.Constructor;

public class ReflectDemo2{
	 
public static void main(String []args)  {
		 Human human =new Human();
		 System.out.println(human.getClass().getName());
		 Class<?> c=null;
		 try{
			 c=Class.forName("Person2.Human");
			 
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		 Human hum=null;
		 Constructor<?> cons[]=c.getConstructors();//声明一个表示构造方法的数组
		 try{
			 hum=(Human)cons[0].newInstance("张武",108,"007","teacher"); //创建此对象表示的一个新的实例
		 }catch(Exception e){//因为只有一个构造方法，所以下标为0
			 e.printStackTrace();
		 }
		 /*hum.setName("张五");
		 hum.setAge(108);
		 hum.setId("007");
		 hum.setWork("teacher");*/
		 System.out.println(hum);
	 }
	 
}



