// First & Last occurrence in a sorted array

import java.util.ArrayList;
import java.util.List;

public class Demo6 {
    
    // Brute

    // static int lastOccurence(int [] arr, int target) {
    //     int first = -1;
    //     int last = -1; 

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             if(first == -1) first = i;
    //             last = i;
    //             
    //         }   
    //     }

    //     return ans;
    // }

    static int lowerBound(int [] arr, int target, int n) {
        int low = 0;
        int high = n -1 ;
        int lowerBound = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                lowerBound = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return  lowerBound;
    }    

    static int upperBound(int [] arr, int target, int n) {

        int low = 0;
        int high = n - 1;
        int upperBound = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                upperBound = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return upperBound;
    }

    static List<Integer> firstLastOccurence(int [] arr, int target, int n) {

        int lb = lowerBound(arr, target, arr.length);
        int ub = upperBound(arr, target, arr.length);

        if (lb == n || arr[lb] != target) {
            return new ArrayList<>(List.of(-1,-1));
        }

        return new ArrayList<>(List.of(lb, ub - 1));
    }


    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 4, 4, 5, 6};

        List<Integer> list = new ArrayList<>(firstLastOccurence(arr, 4, arr.length));

        System.out.println(list);
    }
}
