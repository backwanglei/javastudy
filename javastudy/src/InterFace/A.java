package InterFace;

import java.security.PublicKey;

public interface A {
	void printA();
public interface B{
	void printB();
}
interface C extends A,B{
	 void printC();
}
class X implements C{
	 public void printA(){
		 System.out.println("A.Hello World");
	 }
	public void printB(){
		System.out.println("B.Hello MLDN");
	}
	public void  printC(){
		System.out.println("C.Hello  LXH");
	}
}
public static void  main(String[] args){
	X x = new X();
	x.printA();
	x.printB();
	x.printC();
}
	
}
