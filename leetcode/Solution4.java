class Solution4 {
    public int[] sortArray(int[] nums) {
          if (nums == null || nums.length < 2) {
            return nums;
        }
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    private void merge(int[] nums, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = nums[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = nums[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 2, 3, 1}; 
        int[] sortedNums = solution.sortArray(nums); 
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
}
