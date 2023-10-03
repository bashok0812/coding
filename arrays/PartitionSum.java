public class PartitionSum {
    public int solve(int n, int[] a) {
        
        int[] s = new int[n];
        s[n-1] = a[n-1];
        for(int i = n-2; i>=0;i--){
            s[i] = s[i+1] + a[i];
        }
        
        if(s[0]%3 != 0){
            return 0;
        }
        
        int p = s[0]/3;
        int[] count = new int[n];
        for(int i = 0; i< n; i++){
            if(s[i] == p){
                count[i] = 1;
            } else { 
                 count[i] = 0;
            }
        }
        int[] sum = new int[n];
        sum[n-1] = count[n-1];
        for(int i = n-2; i>=0;i--){
            sum[i] = sum[i+1] + count[i];
        }
        int prefix_sum = 0;
        int result = 0;
        for(int i = 0; i< n-2; i++){
            prefix_sum = prefix_sum + a[i];
            if(prefix_sum == p){
                result = result+sum[i+2];
            }
        }
        return result;
    }
}
