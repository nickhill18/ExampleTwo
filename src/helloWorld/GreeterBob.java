package helloWorld;

public class GreeterBob {
	
	private String name;
	private int age;
	
	public GreeterBob(){
		name = "Bob";
		age = 69;
	}

	public GreeterBob(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "GreeterBob [name=" + name + ", age=" + age + "]";
	}
	
	

}
