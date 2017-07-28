package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cool {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("20180430",DateTimeFormatter.ISO_LOCAL_DATE);
				date.plusDays(2);
				//date.plusHours(3); ** he method is undefined     ***
			
		System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
	}

}
