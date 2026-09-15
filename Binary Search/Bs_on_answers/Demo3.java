// Koko Eating Bananas

public class Demo3 {
    
    // Returning maximun element in Array
    static int maxElement(int [] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int calculateTotalHours(int [] arr, int hourlyRate) {
        int totalHours = 0;

        for (int i = 0; i < arr.length; i++) {
            totalHours += (int) Math.ceil((double) arr[i] / hourlyRate);   
        }
        return totalHours;
    }

    static int minRateToEatBanana(int []arr, int hourlyRate) {
        int low = 1;
        int high = maxElement(arr);

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalHours = calculateTotalHours(arr, mid);

            if (totalHours <= hourlyRate) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
    
        int [] arr = {30,11,23,4,20};

        int h = 5;

        System.out.println(minRateToEatBanana(arr, h));
    }
}
