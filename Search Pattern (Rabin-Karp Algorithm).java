class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> al=new ArrayList<>();
        int len=pattern.length();//4
        int i=0;
        int n=len;//4
        while(i<text.length()-len+1){
           String substr= text.substring(i,n);
          // System.out.println("substr "+substr);
           if(substr.equals(pattern))
            al.add(i+1);
            
            i++;
            n++;
        }
        return al;
        
    }
}
