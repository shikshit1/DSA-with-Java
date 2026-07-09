package BasicMaths;

public class DigitNumber {
    static void printDigit(int num) {
      //agr mere number ki value 0 ajae toh me ruk jauga
      // agr mere num kii value 0 nhi aye toh processing krta rahuga
      //num!=0
        while(num!=0){
            int digit = num%10;
            System.out.println(digit);
            num=num/10;
        }
    }

    static void main() {
        int num=34343;
        printDigit(num);
    }
}
