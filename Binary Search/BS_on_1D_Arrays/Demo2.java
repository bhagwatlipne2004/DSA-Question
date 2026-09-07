
// Implement Lower Bound

public class Demo2 {
    
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

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("LowerBound of target : " + lowerBound(arr, 9,  arr.length));

    }
}
