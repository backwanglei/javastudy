package Annotation;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Man {
	@Value
	private int age;
    public Man(int age) {
			super();
			this.age = age;
		}
		
	}


