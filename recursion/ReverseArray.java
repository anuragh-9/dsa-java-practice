public class ReverseArray {
    public static void main(String[] var0) {
        int arr[] = {1,2,9,4,5,6,7};
        rev(arr,0,arr.length - 1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
   }

   static void rev(int []arr,int st, int end) {
      if(st >= end )
        return ;

      int temp = arr[end];
      arr[end] = arr[st];
      arr[st] = temp;

      rev(arr, st+1, end-1);
   }
}
