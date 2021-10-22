import java.util.Scanner;

public class ArrayQues {
    public static void swap(int[] arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void SegZeroOne(int []arr){
        int n=arr.length;
        int ptr=-1;
        for(int itr=0;itr<n;itr++){
            if(arr[itr]==0){
                swap(arr,++ptr,itr);
            }
        }
    }
    public static void SegPositiveNeg(int [] arr){
        int n=arr.length;
        int ptr=-1;
        for(int itr=0;itr<n;itr++){
            if(arr[itr]<0)
                swap(arr,++ptr,itr);
        }

    }
    public static int[] SegZeroOneTwo(int [] arr){
        int n=arr.length;
        int ptr=-1;
        int ptr1=n-1;
        for( int itr=0;itr<ptr1;itr++){
            if(arr[itr]==0)
                swap(arr,++ptr,itr);
            if(arr[itr]==2) {
                while (arr[ptr1] == 2) {
                    ptr1--;
                }
                swap(arr, itr, ptr1);
                itr--;
            }
        }
        return arr;

    }
    public static void max config{

    }
    public static void main(String [] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
//        SegPositiveNeg(arr);
//        SegZeroOne(arr);
       arr= SegZeroOneTwo(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
