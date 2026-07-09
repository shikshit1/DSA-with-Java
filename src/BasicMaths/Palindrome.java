package BasicMaths;

import static BasicMaths.ReverseNumber.reverseNum;

public class Palindrome {
    static boolean isPalindrome(int num){
        int originalNum= num;
        int reverseNum= reverseNum(num);
        if(originalNum==reverseNum){
            System.out.println("it is a palindrome");
            return true;
        }

        else{
            System.out.println("not a palindrome");
            return false;
        }
    }
    static void main() {
        boolean ans=  isPalindrome(1221);
        System.out.println(ans);

    }
}
