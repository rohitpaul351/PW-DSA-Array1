public class Q7 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Q7 solution = new Q7();
        solution.moveZeroes(nums);
        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: Result: 1 3 12 0 0
    }
}