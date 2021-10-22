import java.util.ArrayList;
import java.util.Scanner;

public class practice {
    public static void heightOfTree(int []arr, int idx){
        if(idx>=arr.length){
            return -1;
        }
        int lh= heightOfTree(arr,2*idx+1);
        int rh= heightOfTree(arr,2*idx+2);

        return Math.max(lh,rh)+1;

    }
    public static void main(String [] args){

    }
}

public class Heap {
    private ArrayList<Integer> arr;
    private boolean isMaxHeap= true;

    void constructHeap(){
        for(int i=arr.size();i>=0;i--){
            downHeapify(i);
        }
    }
    void defaultValue(boolean isMaxHeap){    //we ar assigning a default value(or initializing) to the pre-declared ArrayList
        this.arr=new ArrayList<>();
        this.isMaxHeap= isMaxHeap;
    }

    heap(){                                 //constructor (default maxheap) user khud ek ek krke data add krega heap me using add fucn.
        defaultValue(true);
    }
    heap(boolean isMaxHeap){                // user decide v krega ki max/min bnaenge, user khud ek-ek krke elements add krega
        defaultValue(isMaxHeap);
    }
    heap(int [] arr,boolean isMaxHeap){     //constructor jisme array(jisko heap me hmko bnana hoga) and type of heap dono user dega
        defaultValue(isMaxHeap);
        for(int ele: arr)
            this.arr.add(ele);              //apne local ArrayList me store krva rhe h(inplace rkhne ke liye)
        constructHeap();
    }
    void add(){

    }
    int remove(){
        int rEle= this.arr.get(0);

        int n=this.arr.size();
        swap(0,n-1);
        this.arr.remove(n-1);

        downHeapify(0);

        return rEle;

    }
    int top(){
        return this.arr.get(0);
    }
    int size(){
        return this.arr.size();
    }
    boolean isEmpty(){
        return this.arr.size()==0;
    }
    private void swap(int i , int j){
        int temp= this.arr.get(i);
        arr.set(i , this.arr.get(j));
        arr.set(j , temp);
    }
    private void downHeapify(int pi){   /* func to heapify any array*/
        int maxIdx=pi;
        int lci= 2 * pi + 1;
        int rci= 2 * pi + 2;

        if(lci < arr.size() && this.arr.get(lci)> this.arr.get(maxIdx))
            maxIdx= lci;
        if(rci <arr.size() && this.arr.get(rci) < this.arr.get(maxIdx))
            maxIdx= rci;

        if(maxIdx != pi){
            swap(pi , maxIdx);
            downHeapify(maxIdx);
        }
    }
    public static void main (String [] args ){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr= new arr[n];
        for(int i=0;i<n;i++){

        }
    }

}

