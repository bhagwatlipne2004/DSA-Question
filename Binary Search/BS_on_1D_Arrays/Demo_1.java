
public class Demo_1 {

    // Using Recursion

    static int search(int[] nums, int low, int high, int target) {

        if (low > high){
            return  -1;
        }

            int mid = (low + high) / 2;

            if(nums[mid] == target)
                return mid;

            else if(target > nums[mid]) 
                return search(nums, mid + 1, high, target);

            else
                return search(nums, low, mid - 1, target);
        
    
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(search(nums, 0, nums.length - 1, 13));
    }
    
}