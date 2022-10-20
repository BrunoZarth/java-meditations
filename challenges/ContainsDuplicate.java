// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;
        Set<Integer> hset = new HashSet<Integer>();
        for(int idx: nums){
            if(!hset.add(idx)){
                return true;
            }
        }
        return false;
    }
}
