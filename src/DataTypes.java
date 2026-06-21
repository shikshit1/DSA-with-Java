public class DataTypes {
    static void main() {


          long value1 = 1234567;
          int value2 = (int)value1;
        System.out.println(value2);



        //numeric DT - short, byte, int , long

        byte num1 = 127;

        long newNum = num1;
        System.out.println("newNum: "+newNum);
        System.out.println(num1);

        short num2 =23232;
        System.out.println(num2);

        int num3 = 23232;
        long num4= 322423434;
        System.out.println(num3);
        System.out.println(num4);

        //floating DTs
        float num5 = 3.23223f;
        System.out.println(num5);

        double num6 = 3.23242423434;
        System.out.println(num6);

        //other - char , boolean
        boolean eligibletovote = true;
        System.out.println(eligibletovote);

        char firstCharacter = 'a' ;
        System.out.println("my first character is: "+(char)(firstCharacter+3));
    }
}
