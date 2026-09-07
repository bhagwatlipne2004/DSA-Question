package BS_on_1D_Arrays;

// Binary Search 

public class Demo1 {

    // Binary Search 

    static int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] == target)
                return mid;

            else if(target > nums[mid]) 
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;

    }


    public static void main(String[] args) {
        
        int [] nums = {1, 2, 3, 4, 5,  6, 7, 8};

        System.out.println(search(nums, 6));
        
    }
}