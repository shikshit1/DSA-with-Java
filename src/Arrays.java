
public class Arrays {
    static void main() {

//        //declaration
//        int arr[];
//        //allocation
//        arr= new int[5];
//        //init
//        int brr[]= {1,2,3};
//                         '
//
      // inme 2 methods use kr skte hai for exucution
//        // for loop method
//        int n = brr.length;
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }
//
//
//        // for each loop method
//         int n= brr.length;
//         for(int val:brr) {
//            System.out.println(val);
//        }

//        System.out.println("valur at 0 index"+ brr[0]);
//        System.out.println("value at 1 index"+ brr[1]);
//





        ////taking input in an array

//        int arr[]= new int[5];
//        Scanner sc= new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for(int i =0; i<=n-1; i++) {
//            System.out.println("provide input for index" + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print
//        System.out.println("contain: ");
//        for(int val:arr){
//            System.out.println(val);
//        }



         /// sum of an array

//        int arr[]= {45,45,3,54,55};
//         int sum=0;
//         int n = arr.length;
//
//         for(int i=0;i<=n-1;i++){
//             int value= arr[i];
//             sum=sum+value;
//         }

         /// sum is ready to print

//        System.out.println(sum);

        //multiple of an array
//
//        int arr[]= {1,1,1,56};
//        int ans=1;
//        int n = arr.length;
//        for(int i=0;i<=n-1;i++){
//            int value=arr[i];
//            ans = ans*value;
//        }
//        System.out.println(ans);



        //find maximum value in array

//        int arr[]={24,43,4,343,23};  // array value daldi
//        int n = arr.length; // n ko arr.length  ke equal daldi jisse baadme easy ho jaye
//        int maxValue= arr[0];  //maxvalue ko arr[0] ke equal daldi
//
//        //compare krege maxvalue ko array ke har element se
//        for(int i =0;i<=n-1;i++){  //for loop chala diya
//            if(arr[i]>maxValue){  // agr arr[]  ki value maxvalue se badi hai toh value update ho jayegi
//                //update maxvalue
//                maxValue= arr[i];
//            }
////        }
//        System.out.println(maxValue);


    //2DArrays

    //declaration
    int[][]arr;
        //allocation
        arr= new int[3][4];
        //init
        int[][]brr= {
                {2,3},
                {5,5,3,3,4,3,},
                {3,4,2,3,3,3},
                {4,4}
        };
//        System.out.println(brr[0][0]);


        // for run all row and column matrix

         //nested loop method
//        int rowlength= brr.length;
////        int collength= brr[0].length;
//
//
//          for(int rowIndex=0; rowIndex<=rowlength-1;rowIndex++){
              //jaise hi kisi new row  me ayege
              // same point pr apn uss row ka collength find out kr lenge
              // current row-> brr[rowIndex]
              //isme kitne columns  usme yeh line lhikege->brr[rowIndex].length
//              int collength=brr[rowIndex].length;
//
//
//              for(int colIndex=0; colIndex<=collength-1; colIndex++){
//                  System.out.print(brr[rowIndex][colIndex]+" ");
//              }
//              System.out.println();
//          }


              //traversal 2D array

        // short method for this

              for(int rowIndex=0;rowIndex<=brr.length-1;rowIndex++){
                  for(int colIndex=0; colIndex<= brr[rowIndex].length-1; colIndex++){
                      System.out.print(brr[rowIndex][colIndex]+" ");
                  }
                  System.out.println();
              }





    }
    }




