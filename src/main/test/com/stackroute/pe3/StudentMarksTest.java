package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    @org.junit.Test
    public void checkInvalidityShouldReturnTrue(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkInvalidity(0));
    }

    @org.junit.Test
    public void checkInvalidityShouldReturnTrue1(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkInvalidity(100));
    }
    @org.junit.Test
    public void checkInvalidityShouldReturnFalse(){
        StudentMarks sm=new StudentMarks();
        assertEquals(false,sm.checkInvalidity(66));
    }
}