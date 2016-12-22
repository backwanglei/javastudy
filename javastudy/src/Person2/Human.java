package Person2;

public class Human {

	private String id;
	private Integer age;
	private String name;
	private String work;

	public Human() {
		super();
		System.out.println("这是huamn的无参数构造方法");
	}

	public Human(String id, Integer age, String name, String work) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.work = work;
		System.out.println("这是huamn的四个参数构造方法");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", age=" + age + ", name=" + name + ", work=" + work + "]";
	}

	public static void main(String[] args) {
		Human human = new Human(" 311", 18, "wanglei", "teacher");
		Human human1 = new Human(" 311", 18, "wanglei", "teacher");
		System.out.println(human);
		System.out.println(human1);
	}
}
