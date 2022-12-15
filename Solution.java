class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a = new int[m+n];
        int index = 0, i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                a[index] = nums1[i];
                i++;
            } else {
                a[index] = nums2[j];
                j++;
            }
            index++;
        }
        while (i < m) {
            a[index++] = nums1[i++];
        }
        while (j < n) {
            a[index++] = nums2[j++];
        }
        for (int x = 0; x < a.length; x++) {
            nums1[x] = a[x];
        }
    }
}
