public class dynamicStack {
    public dynamicStack(){                      //nrml constructor
        super();
    }
    public dynamicStack(int size){              //dynamic constructor
        super(size);
    }
    public dynamicStack(int []arr){             //dyn. constructor given an array
        int n=arr.length;
        super.initialize(2 * n);

        for(int ele : arr)
             super.push_(ele);
    }
}
