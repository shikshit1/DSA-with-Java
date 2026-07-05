package arrays;

public class Maximumelementof2D {
    static void main() {
        int arr[][]= {{1,2,33},{23,22,23}};
        int maxValue= arr[0][0];

        for(int i =0;i< arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j]>maxValue){
                    //update max
                    maxValue= arr[i][j];
                }
            }

        }
        System.out.println(maxValue);


    }
}
