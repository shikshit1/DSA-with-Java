public class Methods {

    // for 2 ki table
static void print2katable(){
    for(int i=1; i<=10;i++){
        int ans=2*i;
        System.out.println(ans);
    }
}

// for sum
//static void printsum(int x, int y){
//    System.out.println(x+y);
//}
//
//
////for multiplication
//static void printmultiplication(int a , int b){
//    int ans = a*b;
//    System.out.println("RESULT:"+ans);
//}


// non void function
//    static int add(int p,int q){
//    int sum=p+q;
//    return sum;
//    }

//method overloading
static int add(int a , int b){
int sum=a+b;
return sum;
}

  static int add(int a , int b , int c){
    int ans=a+b+c;
    return ans;

  }

    static void main() {

    int ans1= add(3,5);
    int ans2= add(3,5,3);
        System.out.println("ans1:"+ans1);
        System.out.println("ans2 is " +ans2);





    // non void

//        int result = add(23,332);
//        System.out.println(result);
//    //multiple
//    printmultiplication(32,1);
      // sum
//    printsum(4,56);



        // 2 ki table
//        System.out.println("hi");
//        print2katable();
//        System.out.println("bye");
    }





}
