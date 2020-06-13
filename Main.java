package java_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> num_list = new ArrayList<Integer>();
        
        for(int i=0; i<N; i++){
            int number = sc.nextInt();
            if(num_list.contains(number))
                continue;
            num_list.add(number);
        }
        
        for(int i=0; i<num_list.size()-1; i++){
        	int min_idx = i;
            for(int j=i+1; j<num_list.size(); j++){
                if(num_list.get(min_idx)>num_list.get(j)){
                    min_idx = j;
                }
            }
            int temp = num_list.get(min_idx);
            num_list.set(min_idx, num_list.get(i));
            num_list.set(i, temp);
        }
        for(int i=0; i<num_list.size(); i++){
            System.out.println(num_list.get(i));
        }
	}
}