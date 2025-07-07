public class MaxInArray {
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5,4,3,6,7,5,4,3};
        int maxVal = max(arr,0,arr.length-1);
        System.out.println(maxVal);
    }
    static int max (int []arr , int i,int n){
        if (i == n){
            return arr[i];
        }
        int max = max(arr, i+1, n);
        return Math.max(max , arr[i]);
    }
}
