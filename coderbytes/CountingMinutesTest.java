package coderbytes;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

import java.text.*;

public class CountingMinutesTest {

	static Long CountingMinutes(String str) throws ParseException {
		String[] times = str.split("-");
		String time1 = times[0];
		String time2 = times[1];

		SimpleDateFormat format = new SimpleDateFormat("hh:mma");

		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);

		if (date2.before(date1)) {
			date2 = new Date(date2.getTime() + TimeUnit.DAYS.toMillis(1));
		}

		return (date2.getTime() - date1.getTime()) / 1000 / 60;
	}

	public static void main(String[] args) throws ParseException {
		String s = "9:00am-10:00am";	// 60
		System.out.println(CountingMinutes(s));
		String s1 = "1:00pm-11:00am";	// 1320
		System.out.println(CountingMinutes(s1));
		String s2 = "12:30pm-12:00am";	// 690
		System.out.println(CountingMinutes(s2));
		String s3 = "1:23am-1:08am";	// 1425
		System.out.println(CountingMinutes(s3));

	}

}
