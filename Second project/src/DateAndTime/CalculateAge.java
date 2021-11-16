package DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateAge
{
	public static void main(String[] args) {
		LocalDate t=LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, Month.DECEMBER,14);
		Period p = Period.between(birthday, t);
		
		System.out.println("days:"+p.getDays());
		System.out.println("month:"+p.getMonths());
		System.out.println("year:"+p.getYears());
	}
}
	
	