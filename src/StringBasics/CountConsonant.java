package StringBasics;

import java.util.Locale;

public class CountConsonant {
    static void main() {
        String str= "banana";
        int count =0;
//        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
