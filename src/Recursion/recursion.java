import java.util.Scanner;
public class recursion {
    public static void printIncreasing(int a,int b){
        System.out.print(a+"\t");
        if (a==b)
            return;
        printIncreasing(a+1,b);
    }
    public static void printDecreasing(int a,int b){
        if(a>b) {
            System.out.print(a+"\t");
            if (a == b)
                return;
            printDecreasing(a-1, b);
        }else{
                System.out.print(b+"\t");
            if (b==a)
                return;
            printDecreasing(a,b-1);
        }
    }
    public static void printIncDec(int a,int b){

            if (a > b)
                return;
            System.out.print(a + "\t");
            printIncDec(a + 1, b);
            System.out.print(a + "\t");

    }
    public static void printOddEven(int a,int b){
        if(a>b)
            return;
        if(a % 2 != 0)
            System.out.print(a+"\t");
        printOddEven(a+1,b);
        if(a % 2 == 0)
            System.out.print(a+"\t");
    }
    public static int  fact(int n){
        return n==0 ? 1 : fact(n-1)*n;
    }
    public static int power(int a,int b){
        return b==0 ? 1 : power(a,b-1)*a;
    }
    public  static int powerbtr(int a,int b){
        if(b==0){
            return 1;
        }
        int smallAns= powerbtr(a,b/2);
        smallAns*=smallAns;
        return b%2!=0 ? smallAns*a:smallAns;
    }


   public static void main (String [] args ){
       Scanner scn= new Scanner(System.in);
       int a= scn.nextInt();
       int b=scn.nextInt();
//       printIncreasing(a,b);
//         printDecreasing(a,b);
//       printIncDec(a,b);
//       printOddEven(a,b);
//       System.out.println(fact(a));
//       System.out.println(power(a,b));
       System.out.println(powerbtr(a,b));
   }
}
