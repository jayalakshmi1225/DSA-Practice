class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count_0 +=1;
            }
            else if(nums[i]==1){
                count_1 +=1;
            }
            else if(nums[i]==2){
                count_2 +=1;
            }
        }
         for(int p=0;p<count_0;p++){
            nums[p]=0;

         }
         for(int j=count_0;j<count_0+count_1;j++){
            nums[j]=1;
         }
         for(int k=count_0+count_1;k<n;k++){
            nums[k]=2;
         

        }





        



        
    }
}