package com.ar.springex.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

public class DateUtil {

    public static final SimpleDateFormat ddMMyyyy_dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static final SimpleDateFormat yyyyMMdd_dateFormat = new SimpleDateFormat("yyyyMMdd");

    public static final SimpleDateFormat yyyyMMdd_HHmmss_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final SimpleDateFormat yyyyMMddHHmmss_dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    public static final SimpleDateFormat ddMMM_dateFormat = new SimpleDateFormat("dd/MMM");

    public static Date getDateWithTime(Date anyDate,
                                       String hhmmss) throws ParseException {

        Calendar calendar = Calendar.getInstance();

        String[] time = hhmmss.split(":");

        Integer hours = Integer.valueOf(time[0]);
        Integer minutes = Integer.valueOf(time[1]);
        Integer seconds = Integer.valueOf(time[2]);

        Long miliseconds = (long) (1000 * (seconds + 60 * minutes + 60 * 60 * hours));

        String anyDateString = ddMMyyyy_dateFormat.format(anyDate);
        Date anyDateParsed = ddMMyyyy_dateFormat.parse(anyDateString);

        calendar.setTimeInMillis((anyDateParsed.getTime() + miliseconds));

        return calendar.getTime();
    }

    public static Date getNow(final TimeZone timeZone) {
        final Calendar now = Calendar.getInstance();
        Calendar converted = new GregorianCalendar(timeZone);
        converted.setTimeInMillis(now.getTimeInMillis() + timeZone.getOffset(now.getTimeInMillis())
                                      - TimeZone.getDefault().getOffset(now.getTimeInMillis()));

        return converted.getTime();
    }

    public static Date getNow() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT-3:00");
        return getNow(timeZone);
    }

    public static List<Date> getDatesBetween(Date since,
                                             Date to,
                                             int unit,
                                             int amount,
                                             boolean includeTo) {

        List<Date> dates = new ArrayList<Date>();

        Calendar pivot = Calendar.getInstance();
        pivot.setTime(since);

        while (pivot.getTime().before(to)) {
            dates.add(pivot.getTime());
            pivot.add(unit, amount);
        }
        if (includeTo) {
            dates.add(to);
        }

        return dates;

    }

    public static Date addTime(Date since,
                               int unit,
                               int amount) {
        Calendar pivot = Calendar.getInstance();
        pivot.setTime(since);
        pivot.add(unit, amount);
        return pivot.getTime();
    }

    public static void wait(Long timeMillis) {

        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static String formatDate(Date date,
                                    SimpleDateFormat format) {

        return date == null ? "" : format.format(date);
    }

    public static Date parseDate(String string,
                                 SimpleDateFormat format) {

        try {
            return format.parse(string);
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return null;

    }

}
