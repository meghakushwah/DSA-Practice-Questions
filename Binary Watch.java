class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<String>();
       for(int hours=0;hours<=11;hours++)
       {
           for(int min=0;min<60;min++)
           {
               if(Integer.bitCount(hours)+Integer.bitCount(min)==turnedOn)
               {
                    StringBuilder sb=new StringBuilder();
                sb.append(hours).append(":");
                if(min<10)
                {
                    sb.append("0");
                }
                sb.append(min);
               
               list.add(sb.toString());
               }
           }
       } 
       return list;
    }
}
