import java.util.HashSet;
import java.util.Set;

public class Q8 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;  // Expected sum of all numbers from 1 to n
        int duplicate = -1;
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                duplicate = num;
            } else {
                numSet.add(num);
                sum -= num;
            }
        }

        int missing = sum;

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        Q8 solution = new Q8();
        int[] result = solution.findErrorNums(nums);
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: Result: 2 3
    }
}

