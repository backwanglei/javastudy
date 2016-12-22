package Abstract;

import javax.print.attribute.standard.RequestingUserName;

public abstract class Creature {
	private String weight;
	private String colar;
	private Integer age;
	public Creature(String weight, String colar, Integer age) {
		super();
		this.weight = weight;
		this.colar = colar;
		this.age = age;
	}
	/**
	 * @return the colar
	 */
	public String getColar() {
		return colar;
	}
	/**
	 * @param colar the colar to set
	 */
	public void setColar(String colar) {
		this.colar = colar;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	public  abstract  String    outprint();
	   
		
	}
	


