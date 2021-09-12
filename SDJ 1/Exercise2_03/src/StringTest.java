import java.util.Scanner;

public class StringTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = keyboard.nextLine();

        int stringSize = string.length();
        System.out.println("The length of string is: " + stringSize);

        char firstLetter = string.charAt(0);
        System.out.println("The first character of a string is: " + firstLetter);

        char lastLetter = string.charAt(stringSize - 1);
        System.out.println("The last character of a string is: " +lastLetter);

        String upper = string.toUpperCase();
        System.out.println("Word in upper cases: " + upper);

        String lower = string.toLowerCase();
        System.out.println("Word in lower cases: " + lower);

        String first5 = string.substring(0,5);
        String last5 = string.substring(stringSize -5,stringSize);

        System.out.println("The first 5 characters of word " + first5);
        System.out.println("The last 5 characters of word " + last5);

        boolean endsWith = string.endsWith("abc");
        System.out.println("Is my string ending with abc? " + endsWith);

        int indexA = string.indexOf('a') +1;
        int indexB = string.indexOf('b') +1;
        int indexX = string.indexOf('x') +1;

        System.out.println("In which place of your word there is letter a? " + indexA);
        System.out.println("In which place of your word there is letter b? " + indexB);
        System.out.println("In which place of your word there is letter X? " + indexX);

        String replaceAwithX = string.replace('a','X');
        System.out.println("Now your word will make no sense " + replaceAwithX);

    }
}
