class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<m;i++){
            hm.add(b[i]);
        }
        for(int j=0;j<n;j++){
            if(!hm.contains(a[j])){
                al.add(a[j]);
            }
        }
        return al;
    }
}

 
