public class MinInRotatedArray {
     public static void main(String[] args) {
        int arr[] = {7,8,9,10,11,12,0,2,3,6};
        int min = Min(arr);
        System.out.println(min);
    }
    static int Min(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return arr[low];
    }
}
