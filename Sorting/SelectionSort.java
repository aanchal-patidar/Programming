
public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {3,8,2,7,1,9,4};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;  // this is for finding min value index in array (selecting min value)

        System.out.println("Before Sorting...");
        for(int i = 0; i < size ; i++){
            System.out.print(nums[i]+" ");
        }

        for(int i= 0 ; i < size ; i++)
        {
            minIndex = i; // assume min value is exist on first index
           for(int j = i + 1 ; j < size ; j++)
           {
            if (nums[minIndex] > nums[j])
            {
                minIndex = j;
            }
           }
           temp = nums[minIndex];
           nums[minIndex] = nums[i];
           nums[i] = temp;
        }
        System.out.println();
        System.out.println("After Sorting...");
        for(int i = 0; i < size ; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}

// time comlexity (Worst) - O(n^2) because it iterate every element but swap only once in one iteration
  
