public class Q5 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int p = m + n - 1; // Pointer for the merged array

        // Compare and place elements from the end of the arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Place any remaining elements from nums2 if any
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Q5 solution = new Q5();
        solution.merge(nums1, m, nums2, n);
        System.out.print("Result: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: Result: 1 2 2 3 5 6
    }
}
