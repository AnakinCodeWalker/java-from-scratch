package binarysearch.com;
// to find the total occurrence of an element, you can find its last occurrence and its first
// occurrence then subtract it then +1 to find the total number of occurrences
public class TotalOccurrencesOfAnElement {
    public static void main(String[] args) {
        int target = 8;
        int[] arr = {2, 3, 4, 5, 6, 6, 7,8,8,8,8, 9, 12};
        int firstOccurrence = firstOccurrence(arr, target);
        int lastOccurrence = lastOccurrence(arr, target);
        if (firstOccurrence > 0) {
            int totalOccurrence = (lastOccurrence - firstOccurrence) + 1;
            System.out.println("the total occurrence of the " + target + " is : " + totalOccurrence);
        } else {
            System.out.println("no such element is present here");
        }

    }

    private static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if ( target>arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }  return ans;
    }

    private static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
