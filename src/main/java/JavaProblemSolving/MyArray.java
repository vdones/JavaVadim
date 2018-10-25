package JavaProblemSolving;

import java.util.Random;

public class MyArray {

    //Reverse array return function
    public static float[] reverseArray(float[] array){
        for (int i = 0; i < (array.length/2); i++) {
            float t = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = t;
        }
        return array;
    }

    //Output float array to console
    public static void outArray(float[] array){
        for (float anArray : array) System.out.print(anArray + " ");
        System.out.println();
    }

    //Output int array to console
    public static void outArray(int[] array){
        for (int anArray : array) System.out.print(anArray + " ");
        System.out.println();
    }

    //Random float array (0.0-10.0) generation function
    public static float[] randomFloatArray(int arrayLength){
        Random random = new Random();
        float[] array = new float[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextFloat() * 10;
        return array;
    }

    //Random int array (0-10) generation function
    public static int[] randomIntArray(int arrayLength){
        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextInt(10) + 1;
        return array;
    }

    //Sum of odd and even numbers
    public static void sumOddAndEvenNumbers(int[] array){
        int sumOdd = 0;
        int sumEven = 0;
        for (int anA : array) {
            if (anA % 2 == 0)
                sumEven += anA;
            else sumOdd += anA;
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
    }

    //Count of odd and even numbers
    public static void countOddAndEvenNumbers(int[] array){
        int countOdd = 0;
        int countEven = 0;
        for (int anA : array) {
            if (anA % 2 == 0)
                countEven++;
            else countOdd++;
        }
        System.out.println("Count of odd numbers: " + countOdd);
        System.out.println("Count of even numbers: " + countEven);
    }

}
