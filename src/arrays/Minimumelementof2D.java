package arrays;

public class Minimumelementof2D {
    static void main() {
        int arr[][]= {{1,32342,23},{2,24,34}};
        int minValue= arr[0][0];

        for(int i =0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]<minValue){
                    minValue= arr[i][j];
                }
            }
        }
        System.out.println(minValue);
    }
}
