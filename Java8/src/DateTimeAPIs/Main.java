package DateTimeAPIs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// 1. LocalDate, LocalTime, LocalDateTime

		// 2017�� 1�� 31�� ǥ��
		LocalDate localDate1 = LocalDate.of(2017, 1, 31);
		 
		// 1~12 �� �����ʿ� �ָ�. ��ü�� Month �� �����Ǵ� �Ϳ� �ѹ� �� �ָ�
		{
		    // �� ���
		    Month month = localDate1.getMonth();
		    System.out.println(month.getValue());
		}
		 
		// 10�� 5�� 40�� ǥ��
		LocalTime time = LocalTime.of(10, 5, 40);
		 
		// ��¥�� �ð��� ����
		{
		    LocalDateTime dateTime = LocalDateTime.of(localDate1, time);
		    System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		}
		
		 /*
		  * Print Result
		  * 1
		  * 2017-01-31T10:05:40
		  */
		
		// 2. ��¥ ����
		// 2017�� 1�� 31�� ǥ��
		LocalDate localDate2 = LocalDate.of(2017, 1, 31);
		 
		// 2016 �� 1�� 5�Ϸ� ����.
		LocalDate withDate =  localDate2.withYear(2016).withDayOfMonth(5);
		System.out.println(withDate.format(DateTimeFormatter.ISO_DATE));
		 
		// 2017 �� 1�� 31���� 2�� �ڴ�?
		LocalDate plusDays =  localDate2.plusDays(2);
		System.out.println(plusDays.format(DateTimeFormatter.ISO_DATE));
		 
		// 2017 �� 1�� 31���� 3�� ����?
		LocalDate minusDays =  localDate2.minusDays(2);
		System.out.println(minusDays.format(DateTimeFormatter.ISO_DATE));
		 
		/* 
		* 2016-01-05
		* 2017-02-02
		* 2017-01-29
		*/ 

		
		// 3. Duration, Period
		// 10:00 ~ 23:20 ����
		Duration duration = Duration.between(LocalTime.of(10, 00), LocalTime.of(23, 20));
		 
		// 2016.1.5 ~ 2018.1.20 ����
		Period period = Period.between(LocalDate.of(2016, 1, 5), LocalDate.of(2018, 1, 20));
		 
		// 5�� ����
		Period fiveDays = Period.ofDays(5);

		
		// 4. Time Parsing and Formatting
		LocalDate date = LocalDate.parse("2017-04-07", DateTimeFormatter.ISO_LOCAL_DATE);
		 
		Optional.of(date).map(d -> d.format(DateTimeFormatter.ofPattern("yyyy. MM. dd"))).ifPresent(System.out::println);
		 
		// PRINT RESULT
		// 2017. 04. 07

		// 5. Ư�� �ð��� ����
		ZoneId zoneId = ZoneId.of("Europe/Jersey");
		 
		 
		LocalDateTime date1 = LocalDateTime.now();
		ZonedDateTime zonedDateTime = date1.atZone(zoneId);
		 
		System.out.println(date1.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_INSTANT));
		 
		// Print Result
		// 2017-04-05T00:47:21.346
		// 2017-04-05T00:47:21.346+01:00[Europe/Jersey]
		// 2017-04-04T23:47:21.346Z


	}

}
