import java.util.*;

public class BitManipulation {

    public static void OddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static int GETithBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
     

    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }


    public static int clearBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
          
    }

    public static int clearBitsinRange(int n , int i , int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean Nandaphawar(int n) {
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0){
           if(( n & 1) != 0); {
             count++;
         
            }
            n = n>>1;
        
      }
      return count;
    }

    public static int FastExponention(int a , int n) {
        int ans = 1;
        while(n > 0 ) {
           if((n & 1) != 0){
            ans = ans*a;
           }
        a = a * a ;

        n = n>>1;

        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println(FastExponention(9, 9));
    }
}
