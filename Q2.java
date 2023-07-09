public class Q2 {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Counter for non-occurrences of val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        Q2 solution = new Q2();
        int result = solution.removeElement(nums, val);
        System.out.println("Count: " + result);
        System.out.print("Modified Array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: Count: 2
        //         Modified Array: 2 2
    }
}
