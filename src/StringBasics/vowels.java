package StringBasics;

public class vowels  {





    static int getVowelsCount(String str){
        int count =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    static void main() {
        String str= "yashfgyuewfuwegruehibchbcchbhc b";
        System.out.println(getVowelsCount(str));

    }
}
