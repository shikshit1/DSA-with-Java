package StringBasics;

public class CountWords {
    static void main() {
        String str =" my name is  shikshit";
        int count =0;
        boolean inWord = false;
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                if(!inWord){
                    count++;
                    inWord=true;
                }
            }
            else{
                inWord=false;
            }
        }
        System.out.println(count);
    }
}
