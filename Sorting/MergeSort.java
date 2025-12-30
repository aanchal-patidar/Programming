public class MergeSort {

    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r); 

            merge(arr, l , mid , r);
        }
   } 
   private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid -l + 1;
        int n2 = r - mid;
        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        for(int i = 0 ; i < n1 ; i++)
        {
            larr[i] = arr[i+l];
        }

        for(int j = 0 ; j < n2 ; j++)
        {
            rarr[j] = arr[j+mid +1];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;
                k++;
            }else{
                 arr[k] = rarr[j];
                j++;
                k++;
            }
        }

        while(i < n1){
            arr[k] = larr[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }

   }
   public static void main(String[] args) {
    int arr[] = {2,9,6,4,34,78,23,56};
    mergeSort(arr,0,arr.length-1);
    
    System.out.println("After Merging...");
    for (int i : arr) {
        System.out.print(i+ " ");
    }
   }

   
}
