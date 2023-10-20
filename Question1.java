//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        You can return the answer in any order.
//
//        Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = scan.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter the Array Elements: ");
        for(int i = 0; i<size; i++){
            nums[i] = scan.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = scan.nextInt();

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    System.out.println("["+i+","+j+"]");
                    break;
                }    
            }
        }

    }
}