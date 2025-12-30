
public class InsertionSort {
   public static void main(String[] args) {
        int nums[] = {3,5,7,8,4,9,2};
        int size = nums.length;

        for(int i = 1 ; i < size ; i++)
        {
            int j = i-1;
            int key = nums[i];
            while (j >= 0 && nums[j] > key) {  // compare the values ,and put max value and compare with previous values 
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key ; // put the min value at right place
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

   } 
}
