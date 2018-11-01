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

    //Output bidimentional int array to console
    public static void outArray(int[][] array){
        for (int i[] : array) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
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

    //Bubble sort of int array
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length ; i++){
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flag = false;
                }
            if (flag) break;
        }
        return array;
    }

    public static boolean isMagicSquare(int[][] array){

        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < array.length; i++) {
            sumDiagonal1 += array[i][array.length - i - 1];
            sumDiagonal2 += array[i][i];
        }

        if (sumDiagonal1 != sumDiagonal2) return false;

        for (int i = 0; i < array.length; i++) {
            int sumVertical = 0;
            int sumHorizontal = 0;

            for (int j = 0; j < array.length; j++) {
                sumHorizontal += array[i][j];
                sumVertical += array[j][i];
            }

            if (sumHorizontal != sumVertical)
                return false;
            else
                if (sumHorizontal != sumDiagonal1)
                    return false;
        }
        return true;

    }

}
