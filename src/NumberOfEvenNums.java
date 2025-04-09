//leetcode question link="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/"

import java.util.Scanner;
class NumberOfEvennums{
    public static void main(String [] args){
        int  nums[] = {12,345,2,6,7896};
        System.out.println("The number of even no is"+findNumbers(nums));
    }

        public static int findNumbers(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                int num=nums[i];
                int s=0;
                while(num>0){
                    s++;
                    num/=10;
                }
                if(s%2==0){
                    count++;
                }

            }
            return count;
        }
    }