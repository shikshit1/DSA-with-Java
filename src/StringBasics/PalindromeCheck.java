package StringBasics;

import static StringBasics.ReverseString.reverseString;

public class PalindromeCheck {

    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);
        //compare
        for(int i =0;i<original.length();i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1!=ch2){
                //no match
                return false;
            }
        }

        //loop se bahar tabhi ayege
        //jab saree character match krege
        //iska mtlb return true
        return true;
    }
    static void main() {
        String  str = "1111";
        System.out.println(isPalindrome(str));

    }
}
