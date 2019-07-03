package com.stackroute.pe3;
//a program to set up an array of places, Loop round and remove the vowels.
public class RemoveVowelsFromStrings {
   String[] places;String result="";
    public String places(String input)
    {   input=input.replaceAll("a|e|i|o|u","");
        input=input.replaceAll("A|E|I|O|U","");
        places=input.split(" ");
        for(String s:places)
        {
            result=result.concat(s).concat(" ");
        }
        return result.trim();
    }
}
