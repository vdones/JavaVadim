package JavaCourse;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeUntilXmas {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime xmas = LocalDateTime.of(LocalDateTime.now().getYear(), 12, 25, 0, 0);
        LocalDateTime untilXmas = LocalDateTime.from(today);

        long months = untilXmas.until(xmas, ChronoUnit.MONTHS);
        untilXmas = untilXmas.plusMonths(months);

        long days = untilXmas.until(xmas, ChronoUnit.DAYS);
        untilXmas = untilXmas.plusDays(days);

        long hours = untilXmas.until(xmas, ChronoUnit.HOURS);

        System.out.println("Until christmas: " +  months + " months, " + days +" days, " + hours + " hours");
    }
}
