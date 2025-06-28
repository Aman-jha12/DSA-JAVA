import java.util.Arrays;
import java.util.Scanner;

class TwoSum{
//    public static void main(String [] args){
//        Scanner sc=new Scanner(System.in);
//        int []arr={2,7,11,15};
//        int target=9;
//        int []new=twoSum(arr,target);
//       System.out.println(Arrays.toString(new));
//    }
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};
        }

}