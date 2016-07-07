import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Harnoor
 */
public class Singlenumber {

    
    
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,2,5};
        singlenumber(nums);
    }
    public static int[] singlenumber(int[] nums){
     int diff = 0;
     {
    
    
     for (int i: nums)
     diff ^= i; /* XOR all the numbers */ 
     
     }
    diff &= -diff;
    
    int [] a = {0,0};
    { for (int i:nums){
        if ((diff & i)==0) /* if the bit is set*/
            a[0]=i;
        else            /* if the bit is not set */
            a[1]=i;
    
    }
    System.out.println(a);
   return a; 
    }
}
}
