class Solution {

    public int search(int[] nums, int target) {

        int n = nums.length;

        // 1. Find deflection point
        int left = 0;
        int right = n - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int deflection = left;


        // 2. Choose which sorted part
        if (target >= nums[deflection] &&
            target <= nums[n - 1]) {

            // Right part
            return binarySearch(nums, deflection, n - 1, target);

        } else {

            // Left part
            return binarySearch(nums, 0, deflection - 1, target);
        }
    }


    // 3. Normal binary search
    private int binarySearch(int[] nums, int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}