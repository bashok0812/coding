public class MaxSumTriplet {
    public int solve(int[] A) {
        int n = A.length;
        int[] maxSuffArray = new int[n+1];
        maxSuffArray[n] = 0; 
            for (int i = n - 1; i >= 0; --i) 
        maxSuffArray[i] = Math.max(maxSuffArray[i + 1], A[i]); 
        int ans = 0; 
        TreeSet<Integer> lowValue = new TreeSet<Integer>();
        lowValue.add(Integer.MIN_VALUE);
        for (int i = 0; i < n - 1; ++i) { 
            if (maxSuffArray[i + 1] > A[i]) { 
                ans = Math.max(ans, lowValue.lower(A[i]) 
                                   + A[i] + maxSuffArray[i + 1]); 
                lowValue.add(A[i]); 
            } 
        } 
        return ans; 
    }
}
