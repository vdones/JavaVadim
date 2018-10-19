package JavaCourse;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DaysUntilXmas {

    public static void main(String[] args) {


        LocalDateTime today = LocalDateTime.now();
        LocalDateTime xmas = LocalDateTime.of(LocalDateTime.now().getYear(), 12, 25, 0, 0);
        LocalDateTime untilXmas = LocalDateTime.from(today);

        System.out.println("Until christmas: " + untilXmas.until(xmas, ChronoUnit.DAYS) + " days");
    }
}
