class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int rows= mat.length;
        int col = mat[0].length;
        k = k % col;
        for(int i = 0; i < rows; i++){
            swap(mat[i], 0, k - 1);
            swap(mat[i], k, col - 1);
            swap(mat[i], 0, col - 1);
        }
        return mat;
    }
    
    void swap(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }
}
