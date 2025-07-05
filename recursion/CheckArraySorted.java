public class CheckArraySorted {
    public static void main (String[] args){
        int arr[] = {1,2,3,4,2,5,6,7};
        boolean ans = isS(arr,arr.length);
        System.out.println(ans);
    }
    static boolean isS (int[] arr,int n){
        if(n == 0 || n == 1){
            return true;
        }
        return  arr[n-1]> arr[n-2] && isS(arr,n-1); 
    }
}
