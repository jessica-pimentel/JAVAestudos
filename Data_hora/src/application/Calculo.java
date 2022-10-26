package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-10-22");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-22T10:56:23");
		Instant d06 = Instant.parse("2022-10-22T10:56:23Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(07);
		LocalDate nextWeekLocalDate = d04.plusDays(07);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(07);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(07);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Instant = " + pastWeekInstant);
		System.out.println("Instant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		System.out.println("Duration t1 = " + t1.toDays());
		System.out.println("Duration t2 = " + t2.toDays());
		System.out.println("Duration t3 = " + t3.toDays());
		
	}

}
