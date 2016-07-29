import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.*;

public class TimeDifferenceCalculator {
	public static void main(String[] args) {

		System.out.println("Welcome to the amazing time difference calculator! ");
		System.out
				.println("Please supply 2 dates (in the format mm/dd/yyyy) and I'll tell you how far apart they are.");
		Scanner sc = new Scanner(System.in);
		String startDateStr = sc.nextLine();
		String endDateStr = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		LocalDate startDate = LocalDate.parse(startDateStr, formatter);
		LocalDate endDate = LocalDate.parse(endDateStr, formatter);
		String difference = getTimeDifferenceFromTo(startDate, endDate);
		System.out.println(difference);

	}

	public static String getTimeDifferenceFromTo(LocalDate startDate, LocalDate endDate) {

		Period p = Period.between(startDate, endDate);

		return ("There are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays()
				+ " between these dates.");

	}

}
