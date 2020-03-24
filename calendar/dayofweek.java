import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    int y =year;
    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
    y -= (month < 3) ? 1 : 0; 
    int c= (y + y/4 - y/100 + y/400 + t[month-1] + day) % 7;
        String s=null;
        if(c==6)
            s="SATURDAY";  
        if(c==0)
            s="SUNDAY"; 
        if(c==1)
            s="MONDAY"; 
        if(c==2)
            s="TUESDAY";
        if(c==3)
            s="WEDNESDAY";
        if(c==4)
            s="THURSDAY";
        if(c==5)
             s="FRIDAY"; 
        return s;
    }

}

public class Solution {
