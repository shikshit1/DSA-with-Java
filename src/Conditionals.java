public class Conditionals {

    static void main() {

        //if case
//        int dailyPractice = 12;
//        if (dailyPractice >= 7) {
//            System.out.println("good consistency");
//        }
//        int age = 19;
//        if(age>18){
//            System.out.println("eligible");
//        }
//
        //if -else case

//        int score = 422;
//        if (score >=59) {
//            System.out.println("pass");
//        } else {
//            System.out.println("fail");
//        }

//        int age = 20;
//        if (age > 18){
//        System.out.println("eligible");
//    }else{
//            System.out.println("not eligible");
//        }

        // if-else-if ladder
//        int accuracy = 78;
//        if (accuracy >=90) {
//            System.out.println("excellent");
//        }
//        else if (accuracy >=75) {
//            System.out.println("good");
//        }
//        else if(accuracy >=60){
//            System.out.println("average");
//        }

        //nested if -else
        boolean hasSubscription = true;
        int solvedProblem = 240;

        if(hasSubscription) {
            if (solvedProblem >= 200) {
                System.out.println("unlocked");
            } else {
                System.out.println("practice more ");
            }
        }else {
            System.out.println("upgrade to premium");

        }
    }
}
