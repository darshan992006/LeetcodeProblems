package org.example.hard;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarrayWithGivenXorK {
    public static int subArrayWithXorK(int[] arr, int k){
        int n=arr.length;
        int xr=0;
        Map<Integer,Integer> mpp= new HashMap<>();
        mpp.put(xr,1);
        int cnt=0;
        for(int i=0;i<n;i++){
            // prefix XOR till index i:
            xr = xr ^ arr[i];

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return  cnt;
    }
    public static void main(String[] args) {

    }
}
