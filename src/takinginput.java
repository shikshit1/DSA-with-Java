import java.math.BigInteger;
import java.util.Scanner;

public class takinginput {
    static void main() {
//        int a =1 ;
//        int b =3;
//        System.out.println(a+b);


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("enter the value for secondNum:");
        int secondNum= sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("answer is :"+ ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("Biginterger: "+ bg);

        System.out.println("enter the value for flag");
        boolean flag = sc.nextBoolean();
        System.out.println("enter the value for shortVal");
        short shortVal = sc.nextShort();
        System.out.println("enter the value for FloatValue");
        float FloatValue = sc.nextFloat();

        System.out.println("flag is: "+ flag);
        System.out.println("shortVal is: "+ shortVal);
        System.out.println("FloatValue is :" + FloatValue);

        sc.close();
    }
}
