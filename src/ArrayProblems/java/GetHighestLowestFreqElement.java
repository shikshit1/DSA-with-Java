package ArrayProblems.java;

import java.util.HashMap;

public class GetHighestLowestFreqElement {
     static int[] getHighestLowestElement(int arr[]){
         HashMap<Integer,Integer> freq = new HashMap<>();
         // insert data
         for(int num: arr){
             freq.put(num,freq.getOrDefault(num, 0)+1);
         }
         //hashmap is ready
         int highestFreq= Integer.MIN_VALUE;
         int highestNum= -1;
         for(int key: freq.keySet()){
             int currentkey= key;
             int currentFreq = freq.get(key);
             if(currentFreq> highestFreq){
                 //highest ko update kr denge
                 highestFreq= currentFreq;
                 highestNum= currentkey;
             }
         }
         int lowestFreq= Integer.MAX_VALUE;
         int lowestNum= -1;
         for(int key: freq.keySet()){
             int currentkey= key;
             int currentFreq= freq.get(key);
             if(currentFreq<lowestFreq){
                 //lowest ko update kr denge
                 lowestFreq= currentFreq;
                 lowestNum= currentkey;
             }
         }
         int ans[] = {highestNum, lowestNum};
         return ans;
     }

    static void main() {
         int[] arr= {1,1,1,1,1,1,2,3,4,2,3,3,3,3,2,2,3,3,};
             int[] ans= getHighestLowestElement(arr);
            System.out.println("highest frequency:" + ans[0]);
            System.out.println("lowest freq:" + ans[1]);
        }

    }

