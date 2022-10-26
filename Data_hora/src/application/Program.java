package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-10-22");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-22T10:56:23");
		Instant d06 = Instant.parse("2022-10-22T10:56:23Z");
		Instant d07 = Instant.parse("2022-10-22T10:56:23-03:00");
		
		LocalDate d08 = LocalDate.parse("22/10/2022", dtf1); 
		LocalDateTime d09 = LocalDateTime.parse("22/10/2022 11:21", dtf2);
		
		LocalDate d10 = LocalDate.of(2022, 10, 22);
		LocalDateTime d11 = LocalDateTime.of(2022, 10, 22, 11, 32);
		
		
		
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d11.format(dtf2));
		System.out.println(dtf2.format(d11));
		System.out.println(d11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println(dtf3.format(d06));
	}

}
