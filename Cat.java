package java_study;

public class Cat {
	private String name;
	
	public void setName(String name){
		this.name = name;
	}

	public void introduce(){
		System.out.println("I'm a cat, " + name + ".");

		System.out.println("Mew~ Mew~");
	}
}
