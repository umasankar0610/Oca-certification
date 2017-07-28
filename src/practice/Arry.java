package practice;

import java.util.ArrayList;

public class Arry {
public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<>(3);//[" java.lang.IndexOutOfBoundsException:]
		    list.add(1001);
			 list.add(1002);
			 System.out.println(list.get(list.size()));//could not give the element in specified place
}
}
