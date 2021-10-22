import java.io.*;
import java.util.*;

public class SegPosNeg {
    public static void swap(int [] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }

    public static void SegPosNeg(int [] arr){
        int ptr=-1;
        int itr=0;
        int n=arr.length;
        for(;itr<n;itr++){
            if(arr[itr]<0){

            swap(arr, ++ptr, itr);
            }

        }
    }
    public static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String [] args){
        Scanner scn= new Scanner (System.in) ;
        int [] arr={9,7,-2,-8,6,-3,5,-1};
        SegPosNeg(arr);
        display(arr);

    }
}
