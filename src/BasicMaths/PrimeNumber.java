package BasicMaths;

public class PrimeNumber {

    static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");
                return false;
            } else {
                System.out.println("it is a prime number");
                return true;
                //yaha tabhi ayege jb loop se  bahar niklege
                //or loop se tabhi bahar niklege jb kabhi bhi remainder me 0 nhi ayee
                // uska mtlb it is a prime number

            }
        }
        return true;

    }

    static void main() {
        int num = 11;
        System.out.println(isPrime(num));

    }
}
