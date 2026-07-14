package BasicMaths;

public class CountDigit {
     static int  CountDigit(int num){
         int count =0;
         while(num>0){
//             int digit = num%10;
             count++;
             // for last digit remove
             num=num/10;
         }
         return count;
     }

    static void main() {
int num =23823;
int ans = CountDigit(num);
        System.out.println(ans);
    }
}
