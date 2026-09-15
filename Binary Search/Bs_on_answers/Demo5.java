// Capacity To Ship Packages Within D Days

import java.util.Arrays;

public class Demo5 {
    
    static int daysNeeded(int [] weights, int capacity) {
        int currentLoad = 0;
        int days = 1;

        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] > capacity) {
                currentLoad = weights[i];
                days++;
            }
            else {
                currentLoad += weights[i];
            }
        }
        
        return days;
    }

    static int shipWithinDays(int [] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while (low <= high) {
            int mid = (low + high) / 2;

            int capacity = daysNeeded(weights, mid);

            if (capacity <= days) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,2,4,1,4};

        System.out.println(shipWithinDays(arr, 3));
    }
}
