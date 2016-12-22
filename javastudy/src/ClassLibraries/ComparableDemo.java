package ClassLibraries;

import java.util.Arrays;

class Student implements Comparable<Student>{
	private String  name;
	private int age ;
	private float score;
	public Student(String name,int age, float score){
		this.name=name;
		this.age=age;
		this.score=score;
	}
	public String toString(){
		return name+"\t\t"+this.age+"\t\t"+this.score;
	}
	public int compareTo(Student stu){
		if(this.score>stu.score){
		  return -1;
		}else if(this.score<stu.score){
			return 1;
		}else{
			if(this.age>stu.age){
				return -1;
			}else if(this.age<stu.age){
				return 1;
			}else{
				return 0;
			}
		}
		
	}
}

public class ComparableDemo {
	public static void main(String []args){
		Student stu[]={new Student("张三", 20, 90.0f),
				new Student("李四", 22, 90.f),
				new Student("王五", 28, 90.f),
				new Student("赵六", 22, 91.f),
				new Student("孙七", 20, 100f),};
		Arrays.sort(stu);
		for(int i=0;i<stu.length;i++){
			System.out.println(stu[i]);
		}
	}
	

}
