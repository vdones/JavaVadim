package JavaProblemSolving;

public class Palindrome {

    //First variant
    public static boolean isPalindromeOne(String palindrome){
        return palindrome.equals((new StringBuilder(palindrome)).reverse().toString());
    }

    //Second variant
    public static boolean isPalindromeTwo(String palindrome){
        return palindrome.equals(reverseString(palindrome));
    }

    private static String reverseString(String palindrome){
        StringBuilder r = new StringBuilder();
        for (int i = palindrome.length() - 1; i >= 0; --i)
            r.append(palindrome.charAt(i));
        return r.toString();
    }

}
