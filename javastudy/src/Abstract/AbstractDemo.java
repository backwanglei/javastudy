package Abstract;




abstract class A{
		public static final String Flag="CHINA";
		private String name="王磊";
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
		
		
		public abstract void print();
	}
	   class B extends A{
		   public void print(){
		   System.out.println("FLAG="+Flag);
		   System.out.println("姓名="+getName());
		   
		   
	   }
}
	     public class AbstractDemo{
	    	 public static void main(String[] args){
	    		 B b = new B();
	    		 b.print();
	    		 
	    		 
	    	 }
		}