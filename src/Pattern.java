public class Pattern {
    static void main() {


        // pattern 1

//        int n =4;
//
//        for (int row=1;row<=n;row++){
//            //for each row-> n columns
//            for(int col=1;col<=n;col++){
//                //print star
//                System.out.print("* ");
//            }
//
//            //move to next line and row
//            System.out.println();
//        }


        // pattern 2

//
//        int n = 3;
//
//        for (int row=1;row<=n;row++){
//            //for each row-> 5 col need
//            for(int col=1;col<=5;col++){
//                //star
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //pattern 3   solid right angle triangle
//
//          int n =5;
//          for(int row=1; row<=n;row++){
//              //for each row -> variables columns
//              // formula -> col-> 1 -> value of row
//              for(int col=1; col<=row;col++){
//                  System.out.print("* ");
//              }
//              // move to next line
//              System.out.println();
//          }


        //pattern 4   solid rombus

//
//        int n = 5;
//        for (int row= 1; row<=n;row++){
//            // for each row-> space , stars
//
//            //spaces
//
//            for(int col=1;col<=n-row; col++) {
//                System.out.print(" ");
//            }
//
//                //stars
//                for(int col=1;col<=n;col++){
//                    System.out.print("* ");
//                }
//                //move to next row
//                System.out.println();
//            }


        //pattern 5 inverted right angle triangle

//         int n =5;
//         for(int row=1; row<=n;row++){
//             // for each row -> varibles of colums
//             for(int col=1; col<=n-row+1;col++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }


        //pattern 6 solid  pyramid pattern


//        int n = 5;
//        for(int row=1; row<=n; row++){
//            //for each row-> variable columns
//
//            //space
//            for(int col=1;col<=n-row;col++){
//                System.out.print("  ");
//            }
//            //star
//            for(int col=1;col<=2*row-1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //pattern 7

//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            // for each row-> variable of column
//            //space
//
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//              }
//
//                //star
//                for (int col = 1; col <= 2 * n -2* row +1 ; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }



        // pattern 8  for hollow pattern


//
//        int n =4;
//
//        for (int row=1; row<=n; row++){
//            // for each row -> 6 column
//            for (int col=1; col<=6;col++){
//                if(row==1||row==n){
//                    System.out.print("* ");
//                }
//                else {
//                    //middle rows
//                    if(col==1||col==6){
//                        System.out.print("* ");
//                    }
//
//                    else {
//                        // middle column
//                        System.out.print("  ");
//                    }
//                }
//            }
//
//            //move to next row
//            System.out.println();
//        }




        //pattern 9

//        int n = 5 ;
//
//        for(int row = 1; row<=n;row++){
//            // for each row -> variable of columns
//            if(row==1|| row==2||row==n){
//                for (int col=1; col<=row; col++){
//                    System.out.print("* ");
//                }
//            }
//            else {
//                // middle rows
//                //1*
//                System.out.print("* ");
//                // (row-2) spaces
//                for(int col=1;col<=row-2; col++){
//                    System.out.print("  ");
//                }
//                //1*
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }


        //pattern 10

//        int n =5;
//        for(int row=1;row<=n; row++){
//            // for each rows-> variable of columns
//            // part 1
//                for(int col =1; col<= n-row; col++){
//                    System.out.print("  ");
//                }
//                // part 2
//                if(row==1||row==n){
//                    for(int col=1; col<=2*row -1; col++){
//                        System.out.print("* ");
//                    }
//                }
//                else{
//                    //middle rows
//                    // 1*
//                    System.out.print("* ");
//                    //2r-3 space
//                    for(int col=1; col<=2*row -3; col++){
//                        System.out.print("  ");
//                    }
//                    //1*
//                    System.out.print("* ");
//                }
//            //move to next row
//            System.out.println();
//
//        }

      // pattern  11
//
//        //part 1
//        int n = 4;
//        for(int row=1; row<=n; row++) {
//            //for each row-> variable columns
//
//            //space
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            //star
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//        //part 2
//        for (int row = 1; row <= n; row++) {
//            // for each row-> variable of column
//            //space
//
//
//            if(row==1){
//                continue;
//            }
//
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//              }
//
//                //star
//                for (int col = 1; col <= 2 * n -2* row +1 ; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            }

        // pattern 12

        int n =4;

        //part 1
        for(int row=1;row<=n; row++){
            // for each rows-> variable of columns
            // part 1
                for(int col =1; col<= n-row; col++){
                    System.out.print("  ");
                }
                // part 2
                if(row==1){
                    for(int col=1; col<=2*row -1; col++){
                        System.out.print("* ");
                    }
                }
                else{
                    //middle rows
                    // 1*
                    System.out.print("* ");
                    //2r-3 space
                    for(int col=1; col<=2*row -3; col++){
                        System.out.print("  ");
                    }
                    //1*
                    System.out.print("* ");
                }
            //move to next row
            System.out.println();

        }

        //part 2

        for (int row=1 ; row<=(n-1); row++){
            // for  each row -> variable of columns
            // part 1
            for (int col=1; col<=row; col++){
                System.out.print("  ");
            }
            //part 2
            if (row==(n-1)){
                System.out.print("* ");
            }
            else {
                //remaining rows
                //1*
                System.out.print("* ");
                //(2(n-r)-3) spaces
                for (int col=1; col<=  2*(n-row)-3; col++){
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
        // move to next row
            System.out.println();}





    }
    }


