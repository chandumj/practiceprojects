package corejava.assistedexercise;

public class ConstructorDemo {

	int id;
	String name;
	
	public ConstructorDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		ConstructorDemo demo= new ConstructorDemo(10, "Chandu");
		System.out.println(demo.id);
		System.out.println(demo.name);

	}

}
