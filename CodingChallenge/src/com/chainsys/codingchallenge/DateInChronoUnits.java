package com.chainsys.codingchallenge;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class DateInChronoUnits {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate futureDate = LocalDate.of(2025, 1, 1);

		long daysBetween = ChronoUnit.DAYS.between(today, futureDate);
		System.out.println("Days until 2025: " + daysBetween);

		LocalDate twoWeeksLater = today.plus(2, ChronoUnit.WEEKS);
		System.out.println("Date after 2 weeks: " + twoWeeksLater);

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime truncated = now.truncatedTo(ChronoUnit.HOURS);
		System.out.println("Truncated to hour: " + truncated);
	}
}
