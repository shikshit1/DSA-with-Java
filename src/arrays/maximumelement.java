package arrays;

public class maximumelement {
    static void main() {
        int arr[]={24,43,4,343,23};  // array value daldi
        int n = arr.length; // n ko arr.length  ke equal daldi jisse baadme easy ho jaye
        int maxValue= arr[0];  //maxvalue ko arr[0] ke equal daldi

        //compare krege maxvalue ko array ke har element se
        for(int i =0;i<=n-1;i++){  //for loop chala diya
            if(arr[i]>maxValue){  // agr arr[]  ki value maxvalue se badi hai toh value update ho jayegi
                //update maxvalue
                maxValue= arr[i];
            }
        }
        System.out.println(maxValue);
    }
}
