
public class Binary {
    public static void main(String[] args) {
        int nums[] = {2,15,27,38,45};
        int target = 15;

        int result = BinarySearch(nums,target);
        if (result != -1 )
            System.out.println("Element index is : " + result);
        else
            System.out.println("Element not Found");
    }

    public static int BinarySearch(int[] nums, int target) {
      int start = 0;
      int end  = nums.length - 1;

      while(start <= end)
      {
        int mid = (start + end ) / 2;
        if (nums[mid] == target) {
            return mid;
        }else if(nums[mid] < target){
            start = mid + 1;
        }else if(nums[mid] > target){
            end = mid - 1;
        }
      }
      return -1;
    }
}

// time complexity - O(log n) because it track 1 element for every iteration of for loop
