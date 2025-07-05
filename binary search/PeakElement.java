class PeakElement{
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,0,3,7,5,8,4,5,10};
        int target = 3;
        int ind = PE(arr,target);
        System.out.println(ind);
    }
    static int PE(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid+1] && mid < arr.length) {
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}