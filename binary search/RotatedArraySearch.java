public class RotatedArraySearch {
    public static void main(String[] args) {
        int arr[] = {6,7,8,9,10,11,12,1,3,5};
        int target = 3;
        int ind = RSA(arr,target);
        System.out.println(ind);
    }
    static int RSA(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if (target >= arr[low ] && target <= arr[mid]){
                    high = mid -1;
                }else{
                    low = mid +1;
                }
            } else {
                if (arr[high] >= target && target >= arr[mid]){
                    low = mid +1;
                }else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}
