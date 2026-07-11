package BasicMaths;

public class ReverseNumber {
    static int reverseNum(int num){
        int  reverse=0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 +digit;
            num= num/10;
        }
        return reverse;
    }

    static void main() {
        int num=1234;
//        int reverse= reverseNum(num);
        System.out.println(reverseNum(num));

    }
}
