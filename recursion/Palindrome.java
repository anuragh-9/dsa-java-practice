public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean Palindrome = P(str,0,str.length()-1);
        System.out.println(Palindrome);
    }
    static boolean P(String str,int first , int last){
        if (first >= last)
            return true;
        if (str.charAt(last)!= str.charAt(first))
            return false;
        return P(str, first+1, last-1);
    }
}
