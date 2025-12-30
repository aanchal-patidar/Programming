
public class BubbleSort {
    public static void main(String[] args) {
          int nums[] = {3,8,2,7,1,9,4};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting...");
        for(int i = 0; i < size ; i++){
            System.out.print(nums[i]+" ");
        }

        for(int i= 0 ; i < size ; i++)
        {
            for(int j = 0; j < size - i - 1; j++) //loop for swap every element and if already sorted , ignore it
            {
                if (nums[j] > nums[j+1])
                {
                    // for swaping
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("After Sorting...");
        for(int i = 0; i < size ; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}

// time comlexity (Worst) - O(n^2) because it uses two loops to iterate every element
  
