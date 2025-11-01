class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
       HashSet<Integer> set=new HashSet<>();
       int left=0;
       for(int right=0;right<n;right++){
        if(set.contains(nums[right])){
            return true ;
        }
        set.add(nums[right]);
        if(right-left>=k){
            set.remove(nums[left]);
            left++;
        }

       }
       return false;
    }
}
