// Implement Upper Bound

public class Demo3 {
    
    static int upperBound(int [] arr, int target, int n) {

        int low =0;
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

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Upper Bound of target :" + upperBound(arr, 6, arr.length));
    }
}
