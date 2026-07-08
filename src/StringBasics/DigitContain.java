package StringBasics;

public class DigitContain {
    static void main() {
        String str="123456";
        boolean flag =true;
        for(int i =0; i<str.length();i++){
            char ch= str.charAt(i);
            if(!(ch>='0'&& ch<='9')){
                flag = false;
                 break;
            }
        }
        System.out.println(flag);
    }
}
