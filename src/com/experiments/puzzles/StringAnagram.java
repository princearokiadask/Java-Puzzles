package com.experiments.puzzles;

import java.util.Arrays;

public class StringAnagram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
 
        String s1WithNoSpace = s1.replaceAll("\\s", "");
 
        String s2WithNoSpace = s2.replaceAll("\\s", "");
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(s1WithNoSpace.length() != s2WithNoSpace.length())
        {
            //Setting status as false if s1WithNoSpace and s2WithNoSpace doesn't have same length
 
            status = false;
        }
        else
        {
            //Changing the case of characters of both s1WithNoSpace and s2WithNoSpace and converting them to char array
 
            char[] s1Array = s1WithNoSpace.toLowerCase().toCharArray();
 
            char[] s2Array = s2WithNoSpace.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
    }
}