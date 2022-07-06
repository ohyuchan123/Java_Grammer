package Java의정석.ch_07;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015,0,31); //2005년 1월 31일
        System.out.println(toString(date));
        date.roll(Calendar.MONTH,1);
        System.out.println(toString(date));
    }
    public static String toString(Calendar calendar){
        return calendar.get(Calendar.YEAR)+"년 "+calendar.get(Calendar.MONTH)+"월 "+calendar.get(Calendar.DATE)+"일";
    }
}
