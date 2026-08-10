package ArrayProblems.java;

import java.util.HashMap;

public class ModeOfArray  {

    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }

        int maxFreq = -1;
        int maxFreqWaliKey= -1;

        for(int key: freq.keySet()){
            int currentKey= key;
            int currentKeyKiFrequency= freq.get(key);
            if(currentKeyKiFrequency>maxFreq){
                // naya max mil gya
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey= currentKey;
            }
        }
        //jb loop se bahar ayege toh max freq wali key ready hogi
        return maxFreqWaliKey;
     }

    static void main() {
        int arr[]= {1,2,4,5,5,45,33,5,4,5};
          int ans=  getMode(arr);
        System.out.println(ans);
        }

    }

