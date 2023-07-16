class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] a = new int[image.length][image[0].length];
        for(int i =0;i<image.length;i++){
            for(int j =0;j<image[i].length;j++){
               if(image[i][image[i].length-1-j] == 1){
                   a[i][j] = 0;
               } else {
                 a[i][j] = 1;   
               }
            }
        }        
        return a;
    }
}
