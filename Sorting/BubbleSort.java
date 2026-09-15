public class BubbleSort {

    static void bubbleSort(int [] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = 1;
                }    
            }

            if (swap == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        
        int [] arr = {4, 2, 5, 6, 23, 5 , 0, 57};

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}
