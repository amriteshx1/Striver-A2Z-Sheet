// Check if an array represents a min-heap or not

class Solution {
    public boolean isHeap(int[] nums) {
        int n = nums.length;
        
        for(int i = n/2 - 1; i >= 0; i--) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            
            if(leftChild < n && nums[leftChild] < nums[i])
                return false;
                
            if(rightChild < n && nums[rightChild] < nums[i])
                return false;
        }
        
        return true;
    }
}