package Abstract;

abstract class Person { // 定义抽象类person
	private String name;// 定义name属性
	private Integer age;// 定义age属性

	public Person(String name, Integer age) {// 构造方法
		super();
		this.name = name;
		this.age = age;
		System.out.println("我是抽象类父类的两个参数的构造方法");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	public abstract String print();
}

class Student extends Person {
	private String school;

	public Student(String name, Integer age, String school) {
		super(name, age);
		this.school = school;
		System.out.println("我是子类的三个参数的构造方法");

	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school
	 *            the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	public String print() {
		return "姓名:" + this.getName() + "年龄:" + this.getAge() + "学校:" + this.getSchool();
	}
}

public class AbstractDemo1 {
	public static void main(String[] args) {
		Student stu = new Student("张三", 16, "清华大学");
		System.out.println(stu.print());
	}
}
