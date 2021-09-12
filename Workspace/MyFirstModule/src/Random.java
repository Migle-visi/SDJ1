// 29/08/2021

import java.util.Locale;
import java.util.Scanner;



public class Random
{
    public static void main (String [] args)
    {
        String city;
        city = "San Francisco";

        int stringLength;       // Holds the number of characters
        stringLength = city.length();

        char oneChar;           // Names the letters as one char
        oneChar = city.charAt(0);

        String upperCity;
        upperCity = city.toUpperCase();

        String lowerCity;
        lowerCity = city.toLowerCase();

        System.out.println(stringLength);
        System.out.println(oneChar);
        System.out.println(upperCity);
        System.out.println(lowerCity);
    }

}