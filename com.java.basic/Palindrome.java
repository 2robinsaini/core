public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int number = 12321;
        String input = "12321";
        boolean isNumberPalindrome = palindrome.checkNumberPalindrome(number);
        boolean isStringPalindrome = palindrome.checkStringPalindrome(input);
        System.out.println("Number " + number +" is palindrome: " + isNumberPalindrome);
        System.out.println("String " + input +" is palindrome: " + isStringPalindrome);
    }

    private boolean checkNumberPalindrome(int numberString) {
         return checkStringPalindrome(Integer.valueOf(numberString).toString());
    }

    private boolean checkStringPalindrome(String input){
        char[] chars = input.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            if(chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
