public class FirstLastElement {
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5,5,5,5,5,5,6};
        int target  = 5;
        int first = first(arr,0,arr.length-1,target);
        int last = last(arr,0,arr.length-1,target);
        System.out.println(first);
        System.out.println(last);
    }
    static int first(int []arr , int low , int high, int target){
        if(low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid ] == target){
            int ans = first(arr, low, mid - 1, target);
            return (ans == -1) ? mid : ans;
        }else if (arr[mid ] > target ){
            return first(arr, low, mid - 1, target);
        }else{
            return first(arr, mid +1, high, target);
        }
        
    }
    static int last(int []arr , int low , int high, int target){
        if(low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid ] == target){
            int ans = last(arr, mid +1, high, target);
            return (ans == -1) ? mid : ans;
        }else if (arr[mid ] > target ){
            return last(arr, low, mid - 1, target);
        }else{
            return last(arr, mid +1, high, target);
        }
        
    }
}
