

import java.util.Scanner;

public class rotateKtimes {
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void   reverse (int []arr,int i ,int j){
        while(i<j){
            swap(arr,i++,j--);              //"i" increment ho rha h ,"j"decrement ho rha h
        }
    }
    public static void rotate(int[]arr,int r){
        int n=arr.length;
        r=r%n;              //check whether r is positive or neg
        if(r<0){
            r=r+n;
        }
        reverse(arr,0,n-1);             // complexity iski notes me calculated h
        reverse(arr,n-r,n-1);
        reverse(arr,0,n-r-1);
        

    }
    public static void display(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String [] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int a= scn.nextInt();           // length of the array
        System.out.println("Enter the elements of the array");
        int [] arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("by how much the array should rotate");
        int r=scn.nextInt();
        rotate(arr,r);



    }
}

