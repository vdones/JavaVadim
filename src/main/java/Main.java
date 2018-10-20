
import JavaCourse.CurrentTime;
import JavaCourse.DayOfWeek;

public class Main {

    public static void main(String[] args) {
//        DayOfWeek.get(2018,12,20);
//        DayOfWeek.main();
//        CurrentTime.main();
        System.out.println("cold start time " + String.format("%,12d",measure()) + " ns");
        System.out.println("warmed JRE time " + String.format("%,12d",measure()) + " ns");
        

    }

    public static long measure() {
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {

        }
        en = System.nanoTime();
        return en - st;
    }

}
