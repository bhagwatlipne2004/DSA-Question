// Search Element in a Rotated Sorted Array - I

public class Demo8 {
    
    static boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1;   
                } 
                else {
                    low = mid + 1;
                }
            }
            else {
                if (nums[mid] <= target && nums[high] >= target) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int [] nums = {2, 2, 2, 3, 3, 3, 1, 1, 2, 2, 2};

        System.out.println(search(nums, 4));
    }
}
