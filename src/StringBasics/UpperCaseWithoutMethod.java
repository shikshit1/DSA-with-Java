package StringBasics;

public class UpperCaseWithoutMethod {
    static void main() {
        String str = "hello";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            System.out.print(ch);
        }
    }
}
