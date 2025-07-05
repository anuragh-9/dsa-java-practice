public class BinarySearchR {
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int target = 6;
        int ans = BS(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int BS (int[] arr,int target,int low,int high){
        if(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                return BS(arr,target,low,mid-1);
            }else if(arr[mid] < target){
                return BS(arr,target,mid+1,high);
            }
        }
        return -1; 
    }
}


