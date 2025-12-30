
public class Linear {
    public static void main(String[] args) {
        int nums[] = {2,5,7,8,23};
        int target = 8;

        int result = linearSearch(nums,target);
        if (result != -1 )
            System.out.println("Element index is : " + result);
        else
            System.out.println("Element not Found");
    }

    public static int linearSearch(int[] nums, int target) {
      for(int i = 0 ; i < nums.length ; i++)
      {
        if (nums[i] == target){
            return i;
        }
      }
      return -1;
    }
}

// time complexity - O(n) becasue it track every element
