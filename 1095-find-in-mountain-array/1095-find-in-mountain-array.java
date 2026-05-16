/**
 * // This is MountainArray's API interface.
 * // You should not implement it
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // STEP 1 : find peak
        int s = 0;
        int e = n - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        int peak = s;

        // STEP 2 : search left increasing side
        s = 0;
        e = peak;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            int val = mountainArr.get(mid);

            if (val == target) {
                return mid;
            }

            if (val < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        // STEP 3 : search right decreasing side
        s = peak + 1;
        e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            int val = mountainArr.get(mid);

            if (val == target) {
                return mid;
            }

            // reversed because descending order
            if (val < target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }
}