class NumArray {

	int[] arr;
	int totalSum = 0;

	public NumArray(int[] nums) {
		arr = nums;

	
		for (int n : arr) {
			totalSum += n;
		}
	}

	public void update(int index, int val) {
		totalSum -= arr[index];
		arr[index] = val;
		totalSum += val;
	}

	public int sumRange(int left, int right) {
		int ans = totalSum;

		for (int i = 0; i < left; i++) {
			ans -= arr[i];
		}
		
		for (int i = right + 1; i < arr.length; i++) {
			ans -= arr[i];
		}

		return ans;
	}
}
