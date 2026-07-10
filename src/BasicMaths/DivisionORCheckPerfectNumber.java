package BasicMaths;

public class DivisionORCheckPerfectNumber {
     static boolean checkPerfectNumber(int num){
         int sum=1;

         for(int i =2; i*i<=num;i++){
             if(num%i==0){
                 // i ne num ko perfectly divide kr liya hai
                 // toh ab factor pair kya banega
                 // 1st factor-> i
                 // 2nd factor-> num/i
                 int firstFactor= i;
                 int secondFactor= num/i;
                 sum= sum+ firstFactor+ secondFactor;

             }
         }
         if(sum== num){
             System.out.println("perfect number");
             return true;
         }
         else{
             System.out.println("not a perfect number");
             return  false;
         }
     }




    static void main() {
        System.out.println(checkPerfectNumber(6));

    }
}
