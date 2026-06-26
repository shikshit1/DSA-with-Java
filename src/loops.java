import org.w3c.dom.ls.LSOutput;

public class loops {
    static void main() {

//        //first loop
//        for (int i=1;i<=5;i++)
//            System.out.println("value of i:" + i);
//
//        for (int i=1;i<=10;i++) {
//            System.out.println("aman is chodu");
//        }

//        for(int i =1;i<=10;i+=2){
//            System.out.println(i);
//        }

//            for(int i=1; i<=4;i++){
//             for (int j=1 ;j<=4; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //nested loop

//        for(int i =1;i<=3;i++){
//            for(int j =1;j<=3;j++){
//                System.out.println("i= " + i  + " j = " + j);
//            }
//        }

        //break and continue keyword

//        for(int i = 1; i<=10;i++){
//            if(i==5){
//                break; // stop the loop on this keyword
//            }
//            System.out.println(i);
//        }

        //continue keyword

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue; //skip this interation only
//            }
//            System.out.println(i);
//        }

        //while loop

        //init
//        int i = 1;
//         //condition
//        while(i<=10){
//            //process
//            System.out.println("yash");
//            //updation
//            i++;
//        }

        //nested while loop
//
//        int i =1;
//        while(i<=2){
//            int j =1;
//
//            while(j<=3){
//                System.out.println("i="+ i +",j="+j);
//            j++;
//            }
//
//            i++;
//        }

        //do while loop


        //init
//        int i =1;
//        do {
//            System.out.println(i);
//
//            //updation
//            i++;
//
//            //condition
//        }while(i<=5);

//        int i=1;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<0);


        //practice

        //print counting from 1 to n
//        int n=14;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i + " ");
//        }


        //n to 1
//int n =10;
//        for(int i =n; i>=1;i--){
//            System.out.println(i);
//        }

        //print the first 10 multiles of n
//       int n=2;
//        for(int i =1;i<=10;i++){
//            System.out.println(n*i+" ");
//        }

        //print prime number from 1 to 100

//        for (int num = 2; num <= 100; num++) {
//            boolean isPrime = true;
//
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//
//                }
//            }
//            if (isPrime) {
//                System.out.println(num + " ");
//            }
//        }


        //print even numbers

//        for (int i =2;i<=100;i+=2){
//            System.out.println(i);
//        }

        //print sum of all number from 1 to n
//        int sum = 0;
//        for (int i = 1; i <=100; i++) {
//            sum += i;
//            System.out.println(sum);
//        }

        // print all integers from 50 to 100 divisible by 7

        for(int i =50; i<=100;i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}

