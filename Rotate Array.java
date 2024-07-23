class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        
        // int c=0;
        for(int i=0; i<d; i++){
                int temp=list.get(0);
                list.remove(0);
                list.add(temp);
                // c++;
        }
        
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
    }
}
