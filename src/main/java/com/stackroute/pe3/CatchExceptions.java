package com.stackroute.pe3;
/*a program that will generate exceptions of type NegativeArraySizeException,
        IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
        displaying the message stored in the exception object.*/
public class CatchExceptions{
    public static void main(String[] args) {
        try{
           int[] arr=new int[-2];
        }catch (NegativeArraySizeException e)
        {
            e.printStackTrace();
        }
        try{
            int[] arr=new int[2];
            arr[3]=7;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try{
            String s=null;
            s.indexOf('a');
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
