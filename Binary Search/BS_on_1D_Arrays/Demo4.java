// Search Insert Position

public class Demo4 {
    
    static int insertPosition(int [] arr, int target, int n) {
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

        System.out.println(insertPosition(arr, 1,  arr.length));

    }
    
}
