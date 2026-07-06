package StringBasics;

import java.util.Scanner;

public class StringInput {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("provide the string content");
        String str = sc.nextLine();
        System.out.println("value of next line:"+str);
        System.out.println("provide the string content: ");
        String str2= sc.next();
        System.out.println("value of next:"+ str2);
    }
}
