package BasicMaths;

public class Armstrong {
    static boolean isArmstrong(int num){
        int sum=0;
        int originalNum= num;
        while(num!=0){
            int digit = num%10;
            int cubeofdigit= digit*digit*digit;
            sum=sum+cubeofdigit;
            //digit remove from num
            num= num/10;
        }
        if(sum==originalNum){
            System.out.println("armstrong number");
            return true;
        }
        else{
            System.out.println("not armstrong");
            return false;
        }
    }
    static void main() {
        int num=153;
        System.out.println(isArmstrong(num));
    }
}
