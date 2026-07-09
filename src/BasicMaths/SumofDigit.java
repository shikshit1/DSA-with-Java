package BasicMaths;

public class SumofDigit {

    static int sumofdigit(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum= sum+ digit;
            num=num/10;
        }
        return sum;
    }
    static void main() {
        int num=324234;
        int sum= sumofdigit(num);
        System.out.println(sum);

    }
}
