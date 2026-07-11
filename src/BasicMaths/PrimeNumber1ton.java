package BasicMaths;


public class PrimeNumber1ton {
    static void main() {


//    static boolean printallprime(int n){
//        //print all prime number 1 to n
//        // 1 is not a prime number
//        for(int num=2; num<=n;num++){
//            boolean isprime= printallprime(num);
//            if(isprime==true){
//                System.out.println(num);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    static void main() {
//        int num=100;
//        printallprime(num);
//    }
//}
        int n = 100;

        for (int num = 2; num <= n; num++) {

        boolean isPrime = true;
        //check all prime
            
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " ");
        }
    }
}
}

