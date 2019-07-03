package com.stackroute.pe3;
//a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//assume the digits are a string and use split()
public class SeriesOf7ConsecutiveNumbers {
    public static String checkSeriesOf7(String s)
    {
        String[] numbers=s.split(" ");
        for(int i=1;i<numbers.length;i++)
        {
            if(Math.abs(Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1]))!=1)
            {
                return "is not consecutive";
            }

        }return  "is consecutive";
    }
}
