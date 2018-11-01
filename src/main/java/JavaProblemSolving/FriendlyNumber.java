package JavaProblemSolving;

import java.util.ArrayList;

public class FriendlyNumber {

    private static double[] abundancyArray(int number){
        double[] a = new double[number];
        for (int j = 1; j < number; j++) {
            int sum = 0;
            for (int i = 1; i < j; i++)
                if (j % i == 0)
                    sum += i;
            double d = (double)(sum) / j;
            a[j] = d;
        }
        return a;
    }

    public static void printFriendlyNumbers(int bound){
        double[] arrayAbundancy = abundancyArray(bound);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < bound; i++)
            for (int j = 1; j < bound; j++)
                if (arrayAbundancy[i]==arrayAbundancy[j] && i != j) {
                    for (Integer q : arrayList)
                        if (j==q)
                            System.out.println(j + " " + i);
                    arrayList.add(i);
                }
    }

}

