class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = 0;
        int r = 0;
        int[] res = new int[temperatures.length];
        for(int i = 0; i<res.length; i++){
            int j = i + 1;
            boolean isHigher = false;
            while (j<res.length && temperatures[j]<=temperatures[i]){
                j++;
            }
            if(j==res.length){
            isHigher = temperatures[j-1]>temperatures[i];
            } else {
                isHigher = temperatures[j]>temperatures[i];
            }
            res[i]= isHigher ? j-i : 0;
        }
        return res;
    }
}
