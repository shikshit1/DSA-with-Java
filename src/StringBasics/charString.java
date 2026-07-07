package StringBasics;

public class charString {
    static void printString(String str){
        int n = str.length();
        for(int i =0;i<n;i++){
            System.out.println(str.charAt(i));

        }
    }





    static void main() {
        String str = "yasjbh";
        printString(str);

    }
}
