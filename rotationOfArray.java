import java.util.ArrayList;
import java.util.List;


/*
Given an array, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
class Solution {
    public void rotate(int[] nums, int k) {
        if(k>0){
            int n = nums.length;
            int t=n-k;
            while(t<0){
                t=t+n;
            }
            List<Integer> temp = new ArrayList<>();
            for(int i=t;i<n;i++){
                temp.add(nums[i]);
            }
            for(int i=0;i<t;i++){
                temp.add(nums[i]);
            }
            for(int i=0;i<temp.size();i++){
                nums[i]=temp.get(i);
            }


        }
    }
}