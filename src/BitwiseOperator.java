public class BitwiseOperator {
    static void main() {
//         int a =5;
//         int b= 6;
//
//
//        System.out.println(a&b);   //AND
//        System.out.println(a|b);   //OR
//        System.out.println(a^b);   //XOR
//        System.out.println(~a);    //NOT

          //Bitwise left shift

//        int n =5;
//        for(int i=1;i<34;i++){
//            n= n << 1;
//            System.out.println(n);
//            System.out.println();
//        }

        //Bitwise right Shift

//        int n =100;
//        for(int i =1; i<10;i++){
//            n=n>>1;
//            System.out.println(n);
//            System.out.println();
//        }


          //check a number is even or odd

//         int n = 23;
//         if((n&1)==0){
//             System.out.println("even");
//         }else{
//             System.out.println("odd");
//         }

        //Count set bits in a number

        int n=5;
        int count=0;
        while(n!=0){
            if((n&1)!=0){
                // agr 0 ke equal nhi hai toh ek set bit mill jayegi
                count++;
            }
            //right shift to remove this bit
            n=n>>1;
        }

        System.out.println("Set bit Count: "+ count);



    }
}
