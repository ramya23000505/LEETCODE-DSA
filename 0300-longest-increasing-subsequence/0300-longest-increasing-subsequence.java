class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int len[] = new int[n];
        Arrays.fill(len,1);

        int max = 1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j]){
                    len[i] = Math.max(len[i], len[j] + 1);
                }
            }
            max = Math.max(max, len[i]);
        }

        return max;
    }
}