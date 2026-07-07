public class LengthofString {
//    static void printString(String str) {
////        int n = str.length();
////        for(int i =0;i<n;i++){
////            char ch = str.charAt(i);
////        System.out.println(ch);
////    }
//
//}
    static int getlengthofstring(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }





    static void main() {
    String str = "yash";
        System.out.println(getlengthofstring(str));

    }

}