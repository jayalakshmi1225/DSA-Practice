class Solution {
    public int maxProfit(int[] prices) {
        //optimal aaproach  
        int n=prices.length;
        int maxpro=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           if(prices[i]<minprice) {
            minprice=prices[i];
           }
           maxpro=Math.max(maxpro,prices[i]-minprice);
        }
return maxpro;










    }
}