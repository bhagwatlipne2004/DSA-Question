// Find out how many times the array has been rotated

public class Demo10 {
 
    static int minElement(int [] arr, int n) {
        int min = Integer.MAX_VALUE;
        int low = 0, high = n - 1;
        int index = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                break;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            else {
                if (arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
    
        int [] arr = {1, 2, 3, 4, 5, 6, 0};

        System.out.println("No of time Array is rotated : " + minElement(arr, arr.length));

    }
}
