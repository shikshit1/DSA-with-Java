package arrays;

public class Secondlargestelement {
    static void main() {
      int[] arr={23,232,2,22,42};
      int n = arr.length;
         int largest = arr[0];
        for(int i=0; i<n;i++){
            if(arr[i]>largest){
                largest= arr[n-i];



            }

        }
        System.out.println(largest);
    }
}
