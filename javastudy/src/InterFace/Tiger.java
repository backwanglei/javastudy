package InterFace;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("我是一只狮子，我要吃肉");
		
}
     public void sing(){
    	 System.out.println("我是一只狮子，我可以唱歌");
     }
	public static void main(String[] args) {
		Animal animal = new Tiger();
		animal.eat();
		animal.sing();

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

}
