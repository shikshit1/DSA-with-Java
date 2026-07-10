package BasicMaths;

import static BasicMaths.GCD.getGCD;

public class LCM  {
    static  int getLCM(int a, int b){
        int gcd=getGCD(a,b);
        //gcd(18,12)=6
        int prod= a*b;
        //prod(a,b)= 216
        int lcm= prod/gcd;
        return lcm;
    }
    static void main() {
        System.out.println(getLCM(18,12));
    }
}
