// Peak element in Array

public class Demo12 {
    
    // Brute force

    // static int peakElement(int [] arr, int n) {

    //     for (int j = 0; j < n; j++) {

    //         if ((j == 0 || (arr[j] > arr[j - 1]))
    //             && (j == n - 1 || (arr[j] > arr[j + 1]))) {
                
    //                 return j;
    //         }

    //     }

    //     return -1;
    // }

    // optimal 

    static int peakElement(int [] arr, int n) {
        
        if (n == 1) {
            return arr[0];
        }
        
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1]; 
        }

        int low = 1; 
        int high = n - 2;


        while (low <= high) {
            
            int mid = (low + high) / 2;
            
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } 
            else if (arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            } 
            else {
                high = mid - 1;
            }

        }
    
        return -1;
    }

    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 10, 4, 6, 7, 1};

        System.out.println("Peak Element in Array : " + peakElement(arr, arr.length));
    }
}
