package JavaProblemSolving;

public class PrimeNumber {

    public static boolean isPrime(int number){
        if (number < 1) return false;
        else
            for (int i = 2; i < number / 2; i++)
                if (number % i == 0) return false;
        return true;
    }

    public static void primeSmallerThan(int number){
        for (int i = 0; i < number; i++)
            if (isPrime(i)) System.out.println(i);
    }

}
