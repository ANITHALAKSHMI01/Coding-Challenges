package com.chainsys.codingchallenge;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
public class DateTemporal {
	public static void main(String[] args) {
		System.out.println(LocalDate.parse("2024-06-30").until(LocalDate.now(), ChronoUnit.DAYS));
		LocalDate date = LocalDate.now();
		System.out.println("Current date: " + date);

		LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of this month: " + firstDayOfMonth);

		LocalDate lastDayOfYear = date.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last day of this year: " + lastDayOfYear);

		LocalDate nextMonday = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("Next Monday: " + nextMonday);
	}
}
