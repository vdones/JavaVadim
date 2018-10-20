package JavaCourse;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CurrentTime {

    public static void main(String... args) {

        //Current time in London
        get("Europe/London");

        //Current time in New York
        get("America/New_York");

        //Current time in Tokyo
        get("Asia/Tokyo");

    }

    private static void get(String timeZone) {

        LocalDateTime timeNow;
        DecimalFormat dateFormat = new DecimalFormat("00");

        //Current time in timeZone
        try
        {
            ZoneId zone = ZoneId.of(timeZone);
            timeNow = LocalDateTime.now(zone);
            System.out.println(zone);
            System.out.println(dateFormat.format(timeNow.getHour()) + ":" + dateFormat.format(timeNow.getMinute()));
        }
        catch (Exception e)
        {
            System.out.println("Incorrect Time Zone");
        }





    }


}
