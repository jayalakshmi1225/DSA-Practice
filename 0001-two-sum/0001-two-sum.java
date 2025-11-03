class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int arr[]=new int[2];
HashMap<Integer,Integer> map=new HashMap<>();
for(int fix=0;fix<n;fix++){
    int more=target-nums[fix];
    if(map.containsKey(more)){
        arr[0]=fix;
        arr[1]=map.get(more);
    }
    map.put(nums[fix],fix);
}        
return arr;
    }
}
  