import java.util.Scanner;
public class questions {

    // Other imports go here
// Do NOT change the class name

        public static void primeTillN(int n){
            for(int i=2;i<=n;i++){
                int div;
                for( div=2;div*div<=n;div++){
                    if(i%div==0)
                        break;
                }
                if(div*div>n)
                    System.out.println(i);

            }
        }
        public static void main(String[] args)
        {
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            primeTillN(n);

        }
    }

