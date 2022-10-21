// LETCODE 1. Two Sum

/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

class Solution {
    public int[] twoSum(int[] nums, int target) {        
        int[] numsIndx = new int[2];
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if( (nums[i] + nums[j]) == target){
                    numsIndx[0] = i;
                    numsIndx[1] = j;
                }    
            }  
        }
        return numsIndx;
    }
}



/* best solution:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
*/

