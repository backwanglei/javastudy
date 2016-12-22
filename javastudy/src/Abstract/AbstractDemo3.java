package Abstract;

import lombok.Getter;
import lombok.Setter;

abstract class Per{
	@Getter
	private final String country="中国";
	@Getter@Setter
	private String name="张三";
	@Getter@Setter
	private int  age=18;
	/*public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}*/
	public abstract void print();
		
		
}
class Stu extends Per{
	
  public void print(){
		System.out.println(getCountry()+"有个人叫"+getName()+"他今年"+getAge()+"岁");
	}
	
	}
 public class AbstractDemo3{
	 public static void main(String []args){
		 Stu student=new Stu();
		 student.print();
	 }
}

