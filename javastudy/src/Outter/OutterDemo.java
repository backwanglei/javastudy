package Outter;

class Outter{
	private String temp="Hello World";
	public void fun(int age){
	 class Inner{
	 public void print(){
		 System.out.println(temp);
		 System.out.println(age);
		 
	 }
}	       
	   new Inner().print();
	}
}
public class OutterDemo {
	public static void  main(String []args){
		/*Outter out=new Outter();
		Outter.Inner inner= out.new Inner();
		inner.print(); */
		new Outter().fun(30);
	}
}

