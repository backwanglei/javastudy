package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import lombok.Getter;
import lombok.Setter;

interface China{
	public static final String NATIONAL="China";//定义全局常量
	public static final String AUTHOR="王磊";
	public abstract  void sayChina();//定义无参的抽象方法
	public abstract String sayHello(String name,int age);//定义有参的抽象方法
	
	
	}

 class Person implements China{
	@Getter@Setter
	private String name;
	@Getter@Setter
	private  int age;
	public Person() {//无参的构造方法
		super();
	}
	public Person(String name) {//一个参数的构造方法
		super();
		this.name = name;
	}
	public Person(String name, int age) {//两个参数的构造方法
		super();
		this.name = name;
		this.age = age;
	}
     public void sayChina(){//定义sayChina方法
    	 System.out.println("作者："+AUTHOR+"国籍："+NATIONAL);
     }
	public  String  sayHello(String name,int age){//定义sayHello方法
		return name+",你好！我今年"+age+"岁了！"; 
	}
	}
public class ReflectDemo{
	public static void  main(String[]args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException{
		Person person=new Person();
		person.sayChina();
		person.sayHello("王磊", 18);
		Class<?>c1=Class.forName("Reflect.Person");
		Class<?>c[]=c1.getInterfaces();//取得全部实现的接口
		Class<?>c2=c1.getSuperclass();//取得父类
		Constructor<?>c3[]=c1.getConstructors();//取得全部构造方法
		for(int j=0;j<c3.length;j++){
	    Class<?>p[]=c3[j].getParameterTypes();//列出构造中的参数类型
		System.out.print(" 构造方法:");
		int mo=c3[j].getModifiers();//取出权限
		System.out.print(Modifier.toString(mo)+" ");//还原权限
		System.out.print(c3[j].getName());//输出构造方法名称
		System.out.print("(");//输出（
		for(int n=0;n<p.length;n++){
			System.out.print(p[n].getName()+"arg"+j);
			                            //打印参数类型
		  if(n<p.length-1){//判断是不是最后一个参数
			  System.out.print(",");//输出分隔符
		  }
		}
		System.out.println("){}");
		}
		Method m[]=c1.getMethods();//定义数组取出全部的方法
		for(int a=0;a<m.length;a++){//循环输出
			Class<?> r=m[a].getReturnType();//得到方法的返回值类型；
			System.out.print("返回值类型："+r.getName()+",");//得到方法返回值类型的名称
			System.out.print("方法名称:"+m[a].getName());//得到全部方法的名称			
			}
		System.out.println();
		System.out.println("父类名称："+c2.getName());
		for(int i=0;i<c.length;i++){
		System.out.println("实现的接口名称:"+c[i].getName());
		}
		Field f[]=c1.getDeclaredFields();//取得本类属性；
		for(int b=0;b<f.length;b++){//循环输出
			Class<?>R=f[b].getType();//取得属性的类型
			int mo=f[b].getModifiers();//得到修饰符数字；
			System.out.print("本类属性");
			System.out.print(Modifier.toString(mo));//输出修饰符
			System.out.print(R.getName());//输出属性类型
			System.out.print(f[b].getName());//输出属性名称；
			System.out.print(",");
			}
		   System.out.println();
		   Method met =c1.getMethod("sayChina");//次方法没有参数
		   met.invoke(c1.newInstance());//调用方法
	 Method met2=c1.getMethod("sayHello", String.class,int.class);
	                                        //此方法需要两个参数
	  String rv=(String) met2.invoke(c1.newInstance(),"王磊",18);
	                        //传递对象实例，并赋两个值将内容传递给字符串；
	  System.out.println(rv);
	    Object obj=c1.newInstance();//实例化对象
	    Field nField=c1.getDeclaredField("name");//取得name属性
	    Field aField=c1.getDeclaredField("age");//取得age属性
	    nField.setAccessible(true);//修改name的修饰符改成可见
	    nField.set(obj, "周晨");//设置name属性内容
	    aField.setAccessible(true);//将age属性设置成外部可见
	    aField.set(obj, 19);//设置age属性
	    System.out.println("姓名："+nField.get(obj));//通过get取得属性内容
	    System.out.println("年龄："+aField.get(obj));//通过get取得属性内容
	    
	
	}  
	
}		

