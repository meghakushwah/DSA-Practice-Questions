class Solution {
    public int count(int coins[], int sum) {
      int arr[]=new int[sum+1];arr[0]=1;
      for(int coin:coins){
          for(int i=coin;i<=sum;i++)arr[i]+=arr[i-coin];
      }
      return arr[sum];
    }
}
