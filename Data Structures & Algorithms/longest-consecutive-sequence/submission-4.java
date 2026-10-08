class Solution {
    public int longestConsecutive(int[] nums) {
        // longest consecutive : at most n
        // int[n]
        // Set with all the sequence starters
        // sequenceCount = 1
        // sequence starter - > i set sequenceCount to 1, and i do a if
        // that checks if sequence start > 0, then I check if
        //  
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int longest = 0;
        for (int num : set){
                if(!set.contains(num-1)){
                int length = 1;
                    while(set.contains(num+length)){
                    length++;
                    }
                    longest = Math.max(length, longest);
                }
        }
        return longest;
    }
}
