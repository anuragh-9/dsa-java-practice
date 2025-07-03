public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,9};
        int target = 10;
        int ind = BS(arr,target);
        System.out.println(ind);
    }
    static int BS(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
