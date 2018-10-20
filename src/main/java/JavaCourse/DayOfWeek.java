package JavaCourse;

import java.time.LocalDate;

public class DayOfWeek {

    public static void main(String... args) {

        //Day of week on 18.10.1985
        LocalDate day = LocalDate.of(1985, 10, 18);
        System.out.println(day + " is " + day.getDayOfWeek());

    }

    public static void get(int year, int month, int dayOfMonth) {

        //Day of week
        try
        {
            LocalDate day = LocalDate.of(year, month, dayOfMonth);
            System.out.println(day + " is " + day.getDayOfWeek());
        }
        catch (Exception e)
        {
            System.out.println("Incorrect data");
        }

    }

}
