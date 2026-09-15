public class QuickSort {
    
    static void quickSort(int [] arr, int low, int high) {
        if (low < high) {
            int partionI = qS(arr, low, high);

            quickSort(arr, low, partionI - 1);
            quickSort(arr, partionI + 1, high);
        }
    }

    static int qS(int [] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (low < high) {
            while (arr[low] <=  ) {
                
            } 
        }

        return 4;
    }

    public static void main(String[] args) {
        
        int [] arr = {3, 4, 2, 6, 1,  2, 3, 7, 3, 2, 4};

        quickSort(arr, 0, arr.length - 1);

    }
}
