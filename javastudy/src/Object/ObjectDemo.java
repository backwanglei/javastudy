package Object;

import lombok.Getter;
import lombok.Setter;

class Man{
	@Getter@Setter
	private String name;
	@Getter@Setter
	private int age;
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	public boolean equals(Object obj){
		if(this==obj){
		return true;
		}
	   if(obj==null){
		   return false;
	   }
	   if(!(obj instanceof Man)){
		   return false;
	   }
	   	Man other=(Man)obj;
	   	if(name==null){
	   		if(other.name!=null){
	   			return false;
	   		}
	   		
	   	}else if(!name.equals(other.name)){
	   		return false;
	   	}
	   	
		return true;
		
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Man)) {
			return false;
		}
		Man other = (Man) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	
		
	}
*/
}

public class ObjectDemo {
	public static void main(String[]args){
		Man man=new Man("张三", 18);
		Man man2=new Man("张三", 19);
		System.out.println(man.equals(man2));
		
		
	}

}
