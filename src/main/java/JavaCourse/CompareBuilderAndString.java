package JavaCourse;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class CompareBuilderAndString {

    public static void main(String... args) {

        long start, end;
        int n = 10;
        DecimalFormat secondFormat = new DecimalFormat("###.###");

        StringBuilder s1 = new StringBuilder();
        String s2 = "";

        //StringBuilder  measure time
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s1.append(i);
        }
        end = System.nanoTime();

        System.out.print("StringBuilder: " + s1 + "\nSpent time in nanoseconds: ");
        System.out.println(end-start);
        System.out.println("Spent time in milliseconds: " + secondFormat.format((double)(end-start) / 1000000.0));

        //String  measure time
        start = System.nanoTime();
        for (int i = 0; i < n; i++){
            s2+=i;
        }
        end = System.nanoTime();

        System.out.print("String: " + s2 + "\nSpent time: ");
        System.out.println(end-start);
        System.out.println("Spent time in milliseconds: " + secondFormat.format((double)(end-start) / 1000000.0));

    }
}
