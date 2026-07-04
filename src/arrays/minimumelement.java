package arrays;

public class minimumelement {
    static void main() {
        int arr[]= {34,-232,32,3,};
        int n = arr.length;
        int minValue= arr[0];
        //compare
        for(int i=0;i<=n-1;i++){
            if(arr[i]<minValue){
                //update
                minValue=arr[i];
            }
        }
        System.out.println(minValue);
    }
}
