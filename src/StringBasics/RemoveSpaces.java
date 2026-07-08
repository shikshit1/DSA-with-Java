package StringBasics;

public class RemoveSpaces {
    static void main() {
        String str = "i love java";
        String result = "";
        for(int i =0;i<str.length();i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
