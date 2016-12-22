package Method;

class Person{
	   private String name;
		private String age;
		public Person(String name, String age) {
			super();
			this.name = name;
			this.age = age;
		}
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
		public String getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(String age) {
			this.age = age;
		}
		public String print(){
			return "姓名："+this.getName()+  "年龄："+this.getAge();
		}
		
		}
 public class MethodDemo4 {
	public static void main(String[] args){
		Person person =new Person("张三", "16");
		System.out.println(person.print());
	}
}
