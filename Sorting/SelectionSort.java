public class SelectionSort {

    static void selectionSort(int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        
        int [] arr = {4, 2, 5, 6, 23, 5 , 0, 57};

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + "    ");
        }

    }
    
}