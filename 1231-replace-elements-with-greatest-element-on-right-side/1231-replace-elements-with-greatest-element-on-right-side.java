class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int largest=-1;
        int new_arr[]=new int[n];
    for(int i=n-1;i>=0;i--){
        new_arr[i]=largest;
        if(arr[i]>largest){
            largest=arr[i];
        }
        



    }
    return new_arr;
    }
}