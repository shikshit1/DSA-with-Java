package StringBasics;

public class frequencyCharacter {
    static void main() {
        String str = "banana";
        char target = 'a';

        int count =0;
        for(int i =0; i< str.length();i++){
            if(str.charAt(i)==target){
            count++;
        }
        }
        System.out.println(count);
    }
    }