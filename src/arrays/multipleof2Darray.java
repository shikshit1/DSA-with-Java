package arrays;

public class multipleof2Darray {
    static void main() {
        int arr[][]={{1,2,3},{1,2,3}};
        int ans = 1;
        for(int i =0; i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                int value= arr[i][j];
                 ans = ans*value;
            }
        }
        System.out.println(ans);
    }
}
