
<<<<<<< HEAD
import JavaCourse.*;
import JavaProblemSolving.*;
import static JavaProblemSolving.MyArray.*;

=======
import JavaCourse.CurrentTime;
import JavaCourse.DayOfWeek;
>>>>>>> Clear code first commit

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        float x[];
        x = randomFloatArray(5);
        outArray(x);
        outArray(reverseArray(x));


=======
//        DayOfWeek.get(2018,12,20);
//        DayOfWeek.main();
//        CurrentTime.main();
        System.out.println("cold start time " + String.format("%,12d",measure()) + " ns");
        System.out.println("warmed JRE time " + String.format("%,12d",measure()) + " ns");

//        System.out.println(1+1+"1"+"1"+"1");

    }

    public static long measure() {
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {

        }
        en = System.nanoTime();
        return en - st;
>>>>>>> Clear code first commit
    }

}
