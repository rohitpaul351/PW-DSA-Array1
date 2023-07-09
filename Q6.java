import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Q6 solution = new Q6();
        boolean result = solution.containsDuplicate(nums);
        System.out.println("Result: " + result);
        // Output: Result: true
    }
}
