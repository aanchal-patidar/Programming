
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {23,45,43,12,87,34};

        quickSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];  // pick last element as pivot element
        int temp = 0;

            for(int j = low; j < high ; j++)
            {
                if(pivot > arr[j])
                {
                    i++;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }        
            }
            temp= arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            return i + 1;
    }
       
}

// time conplexity - O(n log(n)) because we use only one for loop to track all element and use multiple variables
