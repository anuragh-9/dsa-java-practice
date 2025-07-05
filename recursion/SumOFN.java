public class SumOFN {
    public static void main (String[] args){
        int n = 10;
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum (int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n -1);
    }
}
