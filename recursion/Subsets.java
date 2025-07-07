import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<Integer> set = new ArrayList<>();
        subsets(arr,set,0);
    }
    public static void subsets(int []arr,ArrayList<Integer> set,int ind){
        if(ind == arr.length)
            {
                System.out.print(set);
                return;
            }
        set.add(arr[ind]);
        subsets(arr, set, ind+1);
        

        set.remove(set.size()-1);
        subsets(arr, set, ind+1);
        

    }
}
