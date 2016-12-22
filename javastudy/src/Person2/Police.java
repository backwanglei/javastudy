package Person2;

public class Police {
	private String id;
	private Integer age;
	private String work;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public Police(String id, Integer age, String work) {
		this.id = id;
		this.age = age;
		this.work = work;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Police)) {
			return false;
		}
		Police other = (Police) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Police [id=" + id + "]";
	}

	public static void main(String[] args){
		Police police1 = new Police("id--9887",26,"Worker");
		Police police2 = new Police("id--9887", 26, "Worker");
		Police police3 = new Police("id--66541", 18,"Worker");
		Police police4 ;
		
		if (police1.equals(police2)) {
			System.out.println("police.equals(police2):"+(police1.equals(police2)));
			
		}
		else {
			System.out.println("!polic.equals(police2):"+(!police1.equals(police2)));
			
		}
		police4 =police3;
		System.out.println("police3:"+police3);
		System.out.println("police4:"+police4);
		police4.setId("id-8852");
		System.out.println("police3:"+police3);
		System.out.println("police4:"+police4);
		
		
		
	}
}
          