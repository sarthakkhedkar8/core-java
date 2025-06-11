public class plindrome{
    public static void main(String[] args) {
        String str = "madam";
        String rev = " ";
        boolean isPalindrome = true;

        for (int i = str.length()-1;i<=0;i--) {
            System.out.println(charAt(i));
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
