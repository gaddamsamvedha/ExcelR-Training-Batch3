class LTCode005{
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};  
    }

    public static void main(String[] args) {
        LTCode005 solution = new LTCode005();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.print("Indices of the two numbers that add up to " + target + ": ");
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}