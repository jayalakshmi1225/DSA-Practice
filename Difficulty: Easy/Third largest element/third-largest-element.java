class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
                
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        return third;
        
        
        
    }
}