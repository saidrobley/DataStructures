import java.util.LinkedList;
import java.util.Scanner;

public class MaximumConsecutiveDecreasingOrderSubstring {
	
	public static void main(String[] args) {
		
		getMaxConsec();
	}
	
	public static void getMaxConsec() {
		Scanner input = new Scanner(System.in);
		LinkedList<Character> max = new LinkedList<>();
		LinkedList<Character> list = new LinkedList<>();
		
		System.out.println("Enter a string: ");
		String str = input.next();
		
		for(int i = 0; i < str.length(); i++ ) {
			
			
			if(list.size() > 0 && (str.charAt(i) >= list.getLast())) {
				char now = str.charAt(i);
				char last = list.getLast();
				list.clear();
			}
			
			
			list.add(str.charAt(i));
			
			if(list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
			
		}
		
		for(Character ch: max) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
}



















