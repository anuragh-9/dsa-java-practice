class Power{
    public static void main(String[] args) {
        int a = 2, b = 3;
        int pow = pow(a ,b);
        System.out.println(pow);
    }
    static int pow(int a, int b){
        if (b == 0)
            return 1;
        int ans = pow(a,b/2);
        ans *=ans;
        if(b % 2 != 0)
            return a * ans;
        return ans;
    }
}