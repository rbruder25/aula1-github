package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Proj_calendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf2.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month   = 1+cal.get(Calendar.MONTH);
		
		System.out.println("Minutes : "+minutes);
		System.out.println("Month : "+month);

	}

}
