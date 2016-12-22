package InterFace;

public class People implements Animal, Biology {

	@Override
	public void run() {
		System.out.println("我是人，我跑的比猪快");

	}

	@Override
	public void speak() {
		System.out.println("我是人，我经常说自己很帅");

	}

	@Override
	public void eat() {
		System.out.println("我是人，我吃肉");

	}

	@Override
	public void sing() {
		System.out.println("我是人，我唱歌");

	}

	public static void main(String[] args) {
		Animal animal = new People();
		Biology bio = new People();
		animal.eat();
		animal.sing();
		animal.run();
		animal.speak();

	}

}
