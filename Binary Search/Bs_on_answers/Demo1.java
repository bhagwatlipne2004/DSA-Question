// Finding Sqrt of a number using Binary Search

public class Demo1 {

    // static int findSqrt(int num) {
    //     int ans = 0;

    //     for (int i = 1; i < num; i++) {
    //         if (i * i <= num) {
    //             ans = i;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     return ans;
    // } 

    static int findSqrt(int num) {
        int low = 1;
        int high = num / 2;
        int ans = 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid <= num) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    } 

    public static void main(String[] args) {
        System.out.println(findSqrt(36));
    }
}