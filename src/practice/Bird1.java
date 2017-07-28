package practice;

import java.util.Scanner;

public class Bird1 {
	
	public StringBuilder display(StringBuilder name){
		
	return name.reverse();	
	}
	
	public static void main(String[] args) {
		Bird1 b = new Bird1();
		System.out.println("enter the String to reverse");
		Scanner scan = new Scanner(System.in);
		String name=scan.next();
		StringBuilder sb =new StringBuilder(name);
		
		System.out.println(b.display(sb));
		
	}

}
