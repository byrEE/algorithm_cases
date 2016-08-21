public class StaticDispatch{
	static class Human{}
	static class Man extends Human{}
	static class Woman extends Human{}

	public void sayHello(Human human){
		System.out.println("Hello, Human");
	}

	public void sayHello(Man human){
		System.out.println("Hello, Man");
	}

	public void sayHello(Woman human){
		System.out.println("Hello, Woman");
	}

	public static void main(String[] args){
		Human man=new Man();
		Human woman=new Woman();
		StaticDispatch sd=new StaticDispatch();
		sd.sayHello(man);
		sd.sayHello(woman);
	}

}