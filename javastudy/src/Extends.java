import lombok.Getter;
import lombok.Setter;
class Person{
	@Getter@Setter
	private String  name;
	@Getter@Setter
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	}
class Student extends Person{
	@Getter@Setter
	private String school;
 public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
public void print(){
	System.out.println("濮撳悕锛�"+getName()+"骞撮緞锛�"+getAge()+"瀛︽牎锛�"+getSchool());
}
}	  
	  
 public class Extends {
	 public static void main(String []args){
		 Student student=new Student("寮犱笁", 20, "瀹堕噷韫插ぇ瀛�");
		 student.print();
		 
		 
	 }
	


}
