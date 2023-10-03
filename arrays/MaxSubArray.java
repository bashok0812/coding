public class MaxSubArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        for(int x:A){
            curr_sum += x;
            max_sum = Math.max(curr_sum,max_sum);
            if(curr_sum<0){
                curr_sum = 0;
            }
        }
        
        return max_sum;
    }
}
