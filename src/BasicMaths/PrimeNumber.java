package BasicMaths;

public class PrimeNumber {

    static boolean isPrime(int num) {

          // dono me se koisa bhi loop chala skte hai
        for(int i =2;i*i<=num;i++) {
            if (num % i == 0) {
                System.out.println("it is not  a palindrome");
                return false;
//        for (int i = 2; i <= num-1 ; i++) {
//            if (num % i == 0) {
//                System.out.println("not a prime number");
//                return false;
            }
        }
                System.out.println("it is a prime number");
                return true;
                //yaha tabhi ayege jb loop se  bahar niklege
                //or loop se tabhi bahar niklege jb kabhi bhi remainder me 0 nhi ayee
                // uska mtlb it is a prime number

            }



    static void main() {
        int num = 17;
        System.out.println(isPrime(num));

    }
}
