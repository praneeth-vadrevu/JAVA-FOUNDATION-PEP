import java.io.*;
import java.util.*;
import java.util.Scanner;

public class leetcode {
    public static int lengthOfLongestSubstringTwoDistinct(String s){
        int n= s.length(), si=0, ei=0, count =0, len=0;
        int [] freq= new int [128];
        if(s.length() <=2) return s.length();
        while(ei<n) {
            if (freq[s.charAt(ei++)]++ == 0) count++;

            while (count >= 3) {
                if (freq[s.charAt(si++)]-- == 1) count--;

            }
            len= Math.max(len, ei-si);
        }

        return len ;

    }
    public static void main(String [] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter a String ");
        String s= scn.nextLine();
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));




    }
}
