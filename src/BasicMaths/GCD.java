package BasicMaths;

public class GCD {
    static int getGCD(int a, int b){
        //gcd(a,b)= gcd(b,a%b)

        while(b!=0){
            int oldvalueofb=b;    //oldvalueofb ki jagah temp bhi lhik skte hai
            b=a%b;
            a=oldvalueofb;

        }
        // jab b ki value 0 ayegi tab a ki jo value hogi vo gcd hogi
        int ans =a;
        return ans;
    }

    static void main() {
        System.out.println(getGCD(18,12 ));

    }
}
