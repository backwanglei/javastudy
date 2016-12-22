package Reflect;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
class Point{
	private Object x;
	private Object y;
	
}


public class ReflectDemo2 {
	public static void main(String []args){
		Point point=new Point();
		point.setX(10);
		point.setY(30);
		int x=(int) point.getX();
		int y=(int) point.getY();
		System.out.println("整数表示，X坐标为"+x);
		System.out.println("整数表示，Y坐标为"+y);
		
	}

}
