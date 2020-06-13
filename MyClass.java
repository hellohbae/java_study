package java_study;

import static java.lang.System.out;
import java.util.ArrayList;

public class MyClass{
	public static void main(String[] args)
	{
		out.println("hello! java!!!");
		
		Dog dog_1 = new Dog();
		dog_1.setName("coco");

		Dog dog_2 = new Dog();
		dog_2.setName("cookie");

		Dog dog_3 = new Dog();
		dog_3.setName("popi");
		
		ArrayList<Dog> dog_list = new ArrayList<Dog>();
		dog_list.add(dog_1);
		dog_list.add(dog_2);
		dog_list.add(dog_3);
		
		for(int i=0; i<dog_list.size(); i++) {
			dog_list.get(i).introduce();
		}
		
		Cat cat_1 = new Cat();
		cat_1.setName("nabi");
		cat_1.introduce();	
	}
}