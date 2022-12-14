// LEETCODE 88. Merge Sorted Array

/* 
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}



/* Best solution found:

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n != 0){
            int[] copy = Arrays.copyOfRange(nums1, 0, m);
            int c1 = 0, c2 = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (c2 == nums2.length) {
                    c2--;
                    nums2[c2] = Integer.MAX_VALUE;
                }
                if (c1 == copy.length) {
                    c1--;
                    copy[c1] = Integer.MAX_VALUE;
                }
                if (copy[c1] > nums2[c2]) {
                    nums1[i] = nums2[c2++];
                } else {
                    nums1[i] = copy[c1++];
                }
            }
        }
    }
}

*/
