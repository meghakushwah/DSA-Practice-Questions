class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int c=0;
        int[]arr=new int[q];
        
                for(int i=0;i<query.length;i++){
                    
                    for(int j=0;j<b.length;j++){
                        if(a[query[i]]>=b[j]){
                            c++;
                        }
                    }
                    arr[i]=c;
                    c=0;
                }
                return arr;
    }
}
