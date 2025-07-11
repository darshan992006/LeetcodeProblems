package org.example.medium;

//direct solution from leetcode-so, i wil have no main method
class Solution {
    public int majorityElement(int[] nums) {
        //time complexity of this code is O(N) and also we are storing elements so also space complexity is also o(N)
        // HashMap<Integer,Integer> mp= new HashMap<>();
        // int max=0;
        // int element=0;

        // for(int i=0;i<nums.length;i++){
        //     int key=nums[i];
        //     int freq=0;
        //     if(mp.containsKey(key)){
        //         freq=mp.get(key);
        //     }
        //     freq++;
        //     mp.put(key,freq);
        //     if(freq>max){
        //         max=freq;
        //         element=key;
        //     }
        // }

        // return element;

        //so for most optimal solution we use something called moore's voting algoeithm
        int count=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }else if(nums[i]==el){
                count++;
            }else{
                count--;
            }
        }

        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(el==nums[i]){
                count2++;
            }
        }
        if(count2 > nums.length/2){
            return el;
        }
        return -1;
    }
}