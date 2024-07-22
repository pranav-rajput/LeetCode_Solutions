//person = row
//acc=col
class Solution {
    public int maximumWealth(int[][] accounts) {
    int ans = Integer.MIN_VALUE;
    for(int person = 0; person < accounts.length; person++){
        int sum=0;
        for(int acc=0; acc<accounts[person].length; acc++){
            sum+=accounts[person][acc];

        }
        if(sum>ans){
            ans=sum;
        }
     }
    return ans;
   }
}