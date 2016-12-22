package Abstract;

public class Monkey extends Creature {
	private String  breed;

	public Monkey(String weight, String colar, Integer age, String breed) {
		super(weight, colar, age);
		this.breed = breed;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String  outprint(){
		return "colar:"+this.getColar()+"age:"+this.getAge()+"breed:"+this.getBreed();
	}
     public static void  main(String[] args){
    	 Monkey monkey = new Monkey("78", "黄色", 2, "猴子");
    	System.out.println(monkey.outprint());
    	 
     }
}
