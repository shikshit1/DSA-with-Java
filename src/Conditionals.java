import java.util.Scanner;

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
//        boolean hasSubscription = true;
//        int solvedProblem = 240;
//
//        if(hasSubscription) {
//            if (solvedProblem >= 200) {
//                System.out.println("unlocked");
//            } else {
//                System.out.println("practice more ");
//            }
//        }else {
//            System.out.println("upgrade to premium");
//
//        }
//        int age = 19;
//        char gender = 'M';
//
//        if(gender == 'M') {
//            System.out.println("you are a male");
//            if (age > 18) {
//                System.out.println("you are male and age >18");
//            } else {
//                System.out.println("you are a male and age <=18");
//            }
//        }
//        else {
//            System.out.println("you are not a male");
//            if(age>18) {
//                System.out.println("you are not a male and age>18");
//            }
//            else {
//                System.out.println("you are not a male and age<=18");
//            }
//
//        }

        //ternary operators

//        int streaksDays = 5;
//        String status = (streaksDays>=30) ? "consistent" : "irregular";
//        System.out.println(status);
//
//        int age = 10;
//        int ans = (age >18)? 22:12;
//        System.out.println(ans);


        //switch statement

        //   int day = 5;
        //   switch(day){
        //       case 1 :
        //           System.out.println("monday");
        //           break;
        //       case 2:
        //           System.out.println("tue");
        //           break;
        //           case 3 :
        //       System.out.println("wed");
        //               break;
        //       case 4 :
        //           System.out.println("thrusday");
        //           break;
        //       case 5:
        //           System.out.println("fri");
        //           break;
        //       case 6 :
        //           System.out.println("sat");
        //           break;
        //       case 7:
        //               System.out.println("sun");
        //           break;
        //       default:
        //           System.out.println("invalid");

        //   }

// percentage of 5 subjects

        // int a = 10;
        // int b = 22;
        // int c = 44;
        // int d = 32;
        // int e = 32;
        // double percentage = (a+b+c+d+e)/5;
        // System.out.println(percentage);

        //vote eligibility

        // Scanner Sc = new Scanner(System.in);
        //         System.out.println("enter age ");

        // int age = Sc.nextInt();

        // if(age >= 18) {
        //     System.out.println(" eligible to vote");
        // } else {
        //     System.out.println(" not eligible to vote");
        // }

        //upper to lowercase

        // Scanner sc  = new Scanner(System.in);

        // char ch = sc.next().charAt(0);
        // char lower = (char)(ch + 32);

        // System.out.println("Lowercase: " + lower);

        //lower to uppper

        // Scanner sc = new Scanner(System.in);
        // char ch = sc.next().charAt(0);
        // char upper= (char)(ch- 32);
        // System.out.println("uppercase:" +upper);


        //drop least marks and find percentage of top 4 

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int min = Math.min(a,
                Math.min(b,
                        Math.min(c,
                                Math.min(d, e))));

        int sum = a + b + c + d + e - min;
        double percentage = sum / 4.0;

        System.out.println("Percentage = " + percentage);


    }
}
