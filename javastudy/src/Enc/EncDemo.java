package Enc;


class Person{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public  String setAge(int age) {
		if(age>=0&&age<=100)
			return "true";
		else {
			return "false";
		}
		
	}
	
		
	
	
	public void output(){
		System.out.println("姓名："+getName()+"年龄："+getAge());
		
	}
	
	}
public class EncDemo {
	public static void main(String[] args){
		Person per =new Person();
		per.setName("张三");
	    per.setAge(-20);
	    per.output();
	}
	

}
