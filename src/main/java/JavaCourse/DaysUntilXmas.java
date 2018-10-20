package JavaCourse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilXmas {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDate xmas = LocalDate.of(LocalDate.now().getYear(), 12, 25);
        LocalDate untilXmas = LocalDate.from(today);

        System.out.println("Until christmas: " + untilXmas.until(xmas, ChronoUnit.DAYS) + " days");
    }
}
