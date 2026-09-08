// Minimum in Rotated Sorted Array

public class Demo9 {
    
    static int minElement(int [] arr, int n) {
        int min = Integer.MAX_VALUE;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                min = Math.min(min, arr[low]);
                break;
            }

            if (arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid + 1;
            }
            else {
                min = Math.min( min, arr[mid]);
                high = mid - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
    
        int [] arr = {0, 0, 0, 0, 1, 2, 3, 4, 5, 6};

        System.out.println("Minimum element in array : " + minElement(arr, arr.length));
    }
}
