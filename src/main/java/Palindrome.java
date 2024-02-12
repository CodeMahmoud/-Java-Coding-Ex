public class Palindrome {
    public static String palindromeCheck (String args) {
        String smallChars = args.toLowerCase();
        String output = "";
       if  (isPalindrome(smallChars)) {
//           System.out.println("the sentence is palindrome");
           output = "the sentence is palindrome";
       } else {
//           System.out.println("the sentence is NOT palindrome");
           output = "the sentence is NOT palindrome";
       }
       return output;
    }
    public static boolean isPalindrome (String smallChars) {
        int left = 0;
        int right = smallChars.length() -1;

        while ( left < right) {
            if (smallChars.charAt(left) != smallChars.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
