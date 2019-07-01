package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsFromStringsTest {
    @Test
    public void placesWithVowelsRemoved()
    {
        RemoveVowelsFromStrings r=new RemoveVowelsFromStrings();
        String result=r.places("India pakistan");
        assertEquals("nd pkstn",result);
    }
    @Test
    public void placesWithVowelsRemoved2()
    {
        RemoveVowelsFromStrings r=new RemoveVowelsFromStrings();
        String result=r.places("India pakistan canada");
        assertEquals("nd pkstn cnd",result);
    }

    @Test
    public void placesWithVowelsRemoved3()
    {
        RemoveVowelsFromStrings r=new RemoveVowelsFromStrings();
        String result=r.places("aeiou Aeiou");
        assertEquals("",result);
    }

}