class Solution {
    public int[] twoSum(int[] nums, int target) {
   //better ---hashmap
   int n=nums.length;
   int ans[]=new int[2];
   HashMap<Integer,Integer> map=new HashMap<>();
   for(int i=0;i<n;i++){
            
            int no=nums[i];
            int more_needed=target-no;
            if(map.containsKey(more_needed)){
                ans[0]=map.get(more_needed);
                ans[1]=i;
            }
            map.put(nums[i],i);




   }
return ans;


    }
}