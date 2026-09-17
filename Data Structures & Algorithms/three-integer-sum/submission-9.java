class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> mainlist = new ArrayList<>();

        for (int start = 0; start < nums.length - 2; start++) {

            // Skip duplicate first numbers
            if (start > 0 && nums[start] == nums[start - 1]) {
                continue;
            }

            int i = start + 1;
            int end = nums.length - 1;

            while (i < end) {

                int sum = nums[start] + nums[i] + nums[end];

                if (sum == 0) {

                    List<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[i]);
                    list.add(nums[end]);

                    mainlist.add(list);

                    i++;
                    end--;

                    // Skip duplicate second numbers
                    while (i < end && nums[i] == nums[i - 1]) {
                        i++;
                    }

                    // Skip duplicate third numbers
                    while (i < end && nums[end] == nums[end + 1]) {
                        end--;
                    }

                } else if (sum < 0) {

                    i++;

                } else {

                    end--;
                }
            }
        }

        return mainlist;
    }
}