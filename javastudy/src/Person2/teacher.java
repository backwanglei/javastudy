package Person2;
  public class teacher {
	  private String name;
	  private Integer age;
	  private Boolean isman;
	   private Byte sex;
	/*public teacher(String name, Integer age, Boolean isman, Byte sex) {
		super();
		this.name = name;
		this.age = age;
		this.isman = isman;
		this.sex = sex;*/
	   public String getname(){
		   return this.name;}
		public Boolean setname(String name){
			this.name =name;
			return true;}
		public Integer getage(){
			return this.age;}
		public Boolean setage(Integer age){
			if(age>=0){
			this.age=age;
			return true;}
			else{
				return false;}
			
			
		
	}
		@Override
		public String toString() {
			return "teacher [name=" + name + ", age=" + age + ", isman=" + isman + ", sex=" + sex + "]";
		}
	
		
	}
	 
	  

