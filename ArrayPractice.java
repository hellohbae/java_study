package java_study;

import java.util.ArrayList;

public class ArrayPractice {
	public static void main(String[] args) {
		ArrayList<Integer> num_list = new ArrayList<Integer>();
		
		num_list.add(1);
		num_list.add(22);
		num_list.add(333);
		
		for(int i=0; i<num_list.size(); i++)
			System.out.println(num_list.get(i));
	}
}
