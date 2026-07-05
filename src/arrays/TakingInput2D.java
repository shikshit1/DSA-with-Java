package arrays;

import java.util.Scanner;

public class TakingInput2D {
    static void main() {
        int arr[][]= new int [3][4];
        Scanner sc = new Scanner(System.in);
        // taking input
        for(int i =0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1;j++){
                System.out.println("provide value for row="+i+"and col="+j);
                arr[i][j]= sc.nextInt();
            }
        }
        //i<n or i<=n-1 kuch bhi use kr skte hai
        //use 2D traversal method for print easy
        for(int rowIndex=0; rowIndex<=arr.length-1;rowIndex++){
            for(int colIndex=0; colIndex<=arr[rowIndex].length-1;colIndex++){
                System.out.print(arr[rowIndex][colIndex]+" ");
            }
            System.out.println();
        }
    }
}
