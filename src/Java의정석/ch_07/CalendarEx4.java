package Java의정석.ch_07;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2005,7,31); //2005년 8월 31일

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE,1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 = ");
        date.add(Calendar.DATE,-6);
        System.out.println(toString(date));

        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE,31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE,31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar calendar){
        return calendar.get(Calendar.YEAR)+"년 "+(calendar.get(Calendar.MONTH)+1)+"월 "+calendar.get(Calendar.DATE)+"일";
    }
}
