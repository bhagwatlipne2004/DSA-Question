import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    
    static void mergeSort(int [] arr, int low, int high) {
        
        if (low >= high) {
            return ;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);

    }

    static void merge(int [] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }

    }

    public static void main(String[] args) {
        
        int [] arr = {3, 5, 2, 1, 4, 7, 2, 4, 8, 1, 2, 5};

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + "    ");
        }
    }
}
