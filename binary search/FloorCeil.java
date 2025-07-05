public class FloorCeil {
     public static void main(String[] args) {
        int arr[] = {1,2,3,6};
        int target = 3;
        int f = F(arr,target);
        int c = C(arr,target);
        System.out.println(f+" "+c);
    }
    static int F(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                ans = arr[mid];
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    static int C(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = arr[mid];
                high = mid -1;
            }else{    
                low = mid +1;
            }
        }
        return ans;
    }
}
