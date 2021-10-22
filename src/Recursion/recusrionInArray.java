import java.util.ArrayList;
import java.util.Scanner;
public class recusrionInArray {
    public static int  maximum(int [] arr,int idx){
        if(idx==arr.length)
            return (int)-1e9;           //-1e9 in java is a double value so it has to be typecasted into int value.
        int max= maximum(arr,idx+1);
        return Math.max(max,arr[idx]);
    }
    public static int  minimum(int [] arr,int idx){
        if(idx==arr.length)
            return (int) 1e9;           //1e9 in java is a double value so it has to be typecasted into int value.
        int min= minimum(arr,idx+1);
        return Math.min(min,arr[idx]);
    }
    public static boolean find(int []arr,int idx ,int data ){
        if(idx==arr.length)
            return false;
        return arr[idx]==data || find(arr,idx+1,data);
    }
    public static int  firstIdx(int []arr,int idx,int data){
        if(idx==arr.length )
            return-1;
        return arr[idx]==data ? idx: firstIdx(arr,idx+1,data);
    }

        public static int lastIndex(int[] arr, int idx, int data) {
            if (idx == arr.length)
                return - 1;
            int smallRes = lastIndex(arr, idx + 1, data);
            if (smallRes != - 1)
                return smallRes;

            return arr[idx] == data ? idx : - 1;
        }
//    public static int[]  allIdx(int [] arr, int idx,int data ,int count ){
//
//    }
    public static ArrayList<String> gss(String str, int idx){            // get subsequence
       /* if(str.length() == 0){
            ArrayList <String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char ch= str.charAt(0);
        String ros= str.substring(1);
        ArrayList<String> ans= gss(ros);

        ArrayList<String> myAns= new ArrayList<>();
        for(String rstr: ans){
            myAns.add("" + rstr);

        }
        for(String rstr : ans){
            myAns.add(ch+ rstr);
        }
        return myAns;
        */

// one more approach :
        if(idx== str.length()){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;

        }
        ArrayList<String> recAns= gss(str,idx+1); ;
        ArrayList<String> myAns= new ArrayList<>(recAns);
        for(String s: recAns ){
            myAns.add(str.charAt(idx )+ s);
        }
        return myAns;
    }




    public static void main (String [] args){
        Scanner scn= new Scanner(System.in);
//        System.out.println("size of the array : ");
//        int n=scn.nextInt();
//        int [] arr= new int [n];
//        System.out.println(" elements of the array : ");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=scn.nextInt();
//        }
//        System.out.println("the max value in the array is : "+ maximum(arr,0) );
//        System.out.println("the min value in the array is : "+ minimum(arr,0) );
//        System.out.println('data u wanna search');
//        int data=scn.nextInt();
//        System.out.println(find(arr,0 , data));
        String str= scn.next();
        System.out.println(gss(str));
    }
}
