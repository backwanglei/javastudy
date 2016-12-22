package Person2;

import java.math.MathContext;

import javax.xml.ws.handler.Handler;

public class Famer implements Comparable<Famer> {
	private String id;
	private Integer age;
	static String NAME = "WANGLEI";
	
	
	
    public Famer() {
		super();
	}

	public Famer(String id, Integer age) {
		super();
		this.id = id;
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Famer [id=" + id + ", age=" + age + "]";
	}

	/**
	 * @return the nAME
	 */
	public static String getNAME() {
		return NAME;
	}

	/**
	 * @param nAME the nAME to set
	 */
	public static void setNAME(String nAME) {
		NAME = nAME;
	}

	public static void  name() {
    	System.out.println("我的名字是王磊！");
    	
    		
		
	}

	public static void main(String[] args ){
		System.out.println(Famer.NAME);
		Famer.name();
		Famer famer = new Famer();
		famer.setNAME("周晨");
		System.out.println(Famer.NAME); 
		
		
		
	}
	@Override
	public int compareTo(Famer o) {
		if(this.getAge().intValue()==o.getAge().intValue()){
			return 0;
		}else if(this.getAge().intValue()>o.getAge().intValue()){
			return 1;
		}else{
			return -1;
		}
		         
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	
	}
	
	
	
		
	
 
	


