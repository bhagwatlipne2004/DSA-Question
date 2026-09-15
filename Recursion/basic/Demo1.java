package basic;

// Palindrome

public class Demo1 {

    static void swap(int [] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    // using single varible 
    static void reverse(int[] arr, int n, int i) {
        if (i >= n / 2) {
            return ;
        }

        swap(arr, i, n - i - 1);
        reverse(arr, n, i + 1);
    }


    // using two pointers

    // static void reverse(int [] arr, int low, int high) {
    //     if (low >= high) {
    //         return ;
    //     }

    //     swap(arr, low, high);
    //     reverse(arr, low + 1, high - 1);    
    // }

    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5};
    
        reverse(arr, arr.length, 0);

        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}