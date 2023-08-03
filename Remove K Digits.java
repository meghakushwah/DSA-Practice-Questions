class Solution {
    public String removeKdigits(String num, int k) {
    	char[] arr = num.toCharArray();
        int n = arr.length, pos = -1, start = 0, len = n - k;
        if (n <= k)
        	return "0";
        for (int i = 0; i < n; i++) {
        	for (; pos >= 0 && k > 0 && arr[i] < arr[pos]; pos--, k--);
        	arr[++pos] = arr[i];
        }
        while (start < len - 1 && arr[start] == '0')
        	start++;
        return String.valueOf(arr, start, len - start);
    }
}
