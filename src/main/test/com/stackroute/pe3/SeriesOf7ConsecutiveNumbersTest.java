package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesOf7ConsecutiveNumbersTest {
    @Test
    public void Seriesof7ShouldReturnIsConsecutive()
    {
        String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("1 2 3 4 5 6 7");
        assertEquals("is consecutive",result);
    }
    @Test
    public void Seriesof7ShouldReturnIsNotConsecutive()
    {
        String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("0 0 0 0 0 0 0 ");
        assertEquals("is not consecutive",result);
    }
    @Test
    public void Seriesof7ShouldReturnIsConsecutive1()
    {
        String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("10 11 12 13 14 15 16 17");
        assertEquals("is consecutive",result);
    }
    @Test
    public void Seriesof7ShouldReturnIsConsecutive2()
    {
        String result=SeriesOf7ConsecutiveNumbers.checkSeriesOf7("-10 -11 -12 -13 -14 -15 -16 -17");
        assertEquals("is consecutive",result);
    }


}