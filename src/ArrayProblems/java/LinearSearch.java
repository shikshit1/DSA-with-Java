package ArrayProblems.java;

public class LinearSearch {
    static boolean findTarget(int  arr[], int  target){
        for(int i =0;i<arr.length;i++){
        if (arr[i]== target){
            return true;
        }
    }
        // agar poora array travel ho chuka hai
        //and ek baar bhi target nahi mile
        //iska mtlb , target is not present in array
        return false;

}

    static void main() {
        int arr[] ={1,32,232,8};
        boolean ans = findTarget( arr, 8);
        System.out.println(ans);
    }

    }
