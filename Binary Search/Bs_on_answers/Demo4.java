// Find the Smallest Divisor Given a Threshold

import java.sql.Array;
import java.util.Arrays;

public class Demo4 {
    
    static int sumOfDivisors(int [] arr, int d) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / (double) d);
        }
        
        return sum;
    }

    static int smallestDivisior(int [] arr, int n, int limit) {

        if (n > limit) {
            return -1;
        }

        int low = 1; 
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sumOfDivisors(arr, mid) <= limit) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};   
        
        System.out.println(smallestDivisior(arr, arr.length, 8));
    }
}
