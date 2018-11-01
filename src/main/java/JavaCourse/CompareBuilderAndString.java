package JavaCourse;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class CompareBuilderAndString {

    public static void main(String... args) {

        long start, end;
        int n = 10;
        DecimalFormat secondFormat = new DecimalFormat("###.###");

        StringBuilder stringBuilder = new StringBuilder();
        String string = "";

        //StringBuilder  measure time
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i);
        }
        end = System.nanoTime();

        System.out.print("StringBuilder: " + stringBuilder + "\nSpent time in nanoseconds: ");
        System.out.println(end-start);
        System.out.println("Spent time in milliseconds: " + secondFormat.format((double)(end-start) / 1000000.0));

        //String  measure time
        start = System.nanoTime();
        for (int i = 0; i < n; i++){
            string+=i;
        }
        end = System.nanoTime();

        System.out.print("String: " + string + "\nSpent time: ");
        System.out.println(end-start);
        System.out.println("Spent time in milliseconds: " + secondFormat.format((double)(end-start) / 1000000.0));

    }
}
