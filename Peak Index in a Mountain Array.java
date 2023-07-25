class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 1;
        int e = arr.length-2;
        int mid = (s+e)/2;
        while(s<=e){
            mid = (s+e)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]>arr[mid-1])
                s = mid+1;
            else
                e = mid-1;
        }
        return -1;
    }
}
