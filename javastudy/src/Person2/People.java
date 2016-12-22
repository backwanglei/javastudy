package Person2;

//引用传递
public class People {
	public String name;
	public int age;
	public void tell(){
		System.out.println("name:"+name+"年龄："+age);
		}
	public static void main(String[] args){
		People peo1 =null;
		People peo2 =null;
		peo1 = new People();//为peo1开辟空间 堆内存 是空的
		peo2 = peo1 ;//共用一个内存
		peo1.name = "张三";
		peo1.age = 16;//peo1 设置属性值
		peo2.age = 2;//peo2 设置属性值 修改了内存中属性值
		System.out.println("per1对象中的内容---");
		peo1.tell();
		System.out.println("per1对象中的内容---");
		peo2.tell();
	
	}

}
