public class Arrays {
    static void main() {

        //declaration
        int arr[];
        //allocation
        arr= new int[5];
        //init
        int brr[]= {1,2,3};

        // for loop method
//        int n = brr.length;
//        for(int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }
          

        // for each loop method
         int n= brr.length;
         for(int val:brr) {
            System.out.println(val);
        }

//        System.out.println("valur at 0 index"+ brr[0]);
//        System.out.println("value at 1 index"+ brr[1]);
//
    }
}
