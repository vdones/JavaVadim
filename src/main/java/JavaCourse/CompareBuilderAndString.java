package JavaCourse;

public class CompareBuilderAndString {

    public static void main(String... args) {

        long start, end;
        int n = 10;

        StringBuilder s1 = new StringBuilder();
        String s2 = "";

        //StringBuilder  measure time
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s1.append(i);
        }
        end = System.nanoTime();

        System.out.print("String: " + s1 + "\nSpent time: ");
        System.out.println(end-start);

        //String  measure time
        start = System.nanoTime();
        for (int i = 0; i < n; i++){
            s2+=i;
        }
        end = System.nanoTime();

        System.out.print("StringBuilder: " + s2 + "\nSpent time: ");
        System.out.println(end-start);

    }
}
