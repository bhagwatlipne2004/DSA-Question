public class InsertionSort {
    
    static void insertionSort(int [] arr) {
        
        for (int i = 0; i < arr.length; i++) {

            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

                System.out.println("runs");
            }
            System.out.println("runs");
            // for (int j = i; j > 0; j--) {
            //     if (arr[j] < arr[j - 1]) {
            //         int temp = arr[j];
            //         arr[j] = arr[j - 1];
            //         arr[j - 1] = temp;
            //     }   
            //     System.out.println("runs");
            // }
            
        }
    }


    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};

        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}
