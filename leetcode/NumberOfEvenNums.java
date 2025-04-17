//leetcode question link="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/"

class NumberOfEvenNums {
    public static void main(String [] args){
        int  nums[] = {12,345,2,6,7896};
        System.out.println("The number of even no is"+findNumbers(nums));
    }

                public static int findNumbers(int[] nums){
                int count = 0;
                for (int num : nums) {
                    if ((int) (Math.log10(num) + 1) % 2 == 0) {
                        count++;
                    }
                }
                return count;
            }
    }