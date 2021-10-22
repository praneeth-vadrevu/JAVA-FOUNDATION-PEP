public class stack {
    private int[]arr;
    private int tos;
    private int NoOfElements;            // at present stack me kitne elements h
    private int MaxCapacity;            // Max size of the data structure used

    protected void initialize(int size){            //common function for both the constructors
        this.arr=new int[size];
        this.tos=-1;
        this.NoOfElements=0;
        this.MaxCapacity=size;
    }
     public stack(){                    //basic constructor
            initialize(10);
     }
    public stack(int size){                     //dynamic constructor
            initialize(size);
    }

    public int size() {
    	return this.NoOfElements;

    }
    protected int Capacity(){
         return this.MaxCapacity;
    }

    public boolean isEmpty() {
        return this.NoOfElements==0;
    }
    protected void StackEmptyException() throws Exception{
        if(this.NoOfElements==0) throw new Exception("Stack Is Empty");
    }
    protected void StackOverflowException() throws Exception{
        if(this.NoOfElements== this.MaxCapacity) throw new Exception("Stack Overflow");
    }
    public void push_(int data) {                           //kaam krne wala push
        this.tos++;
        this.arr[this.tos]=data;
        this.NoOfElements++;

    }
    protected void push(int data) throws Exception{         //exception push
        StackOverflowException();
         push_(data);
    }
    protected int top_(){               // top function to perform its function after all the exceptions are handled
        return this.arr[this.tos];
    }
    public int top() throws Exception {                  //top function to handle the Exceptions
        StackEmptyException();
        return top_();
    }

    protected int pop_() {
        int rv=this.arr[this.tos];
        this.arr[this.tos]=0;           //aise hi koi bhi default val daaldi, zruri ni h pr kr dene se bdiya h
        this.tos--;
        this.NoOfElements--;
        return rv;
    }
    public int pop() throws Exception{
        StackEmptyException();
        return pop_();
    }
}