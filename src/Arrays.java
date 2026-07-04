
public class Arrays {
    static void main() {

//        //declaration
//        int arr[];
//        //allocation
//        arr= new int[5];
//        //init
//        int brr[]= {1,2,3};
//
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



        // sum of an array

//        int arr[]= {45,45,3,54,55};
//         int sum=0;
//         int n = arr.length;
//
//         for(int i=0;i<=n-1;i++){
//             int value= arr[i];
//             sum=sum+value;
//         }

         // sum is ready to print

//        System.out.println(sum);

        //multiple of an array

        int arr[]= {1,1,1,56};
        int ans=1;
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int value=arr[i];
            ans = ans*value;
        }
        System.out.println(ans);
    }
}
