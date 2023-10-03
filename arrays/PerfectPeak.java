public class PerfectPeak {
    public int perfectPeak(int[] a) {
        
        int n = a.length;
        int[] p = new int[n], s = new int[n];
        
        p[0] = a[0];
        for(int i = 1; i< n; i++){
            p[i] = Math.max(p[i-1], a[i]);
        }
        s[n-1] = a[n-1];
        for(int i = n-2; i>=0 ; i--){
            s[i] = Math.min(s[i+1], a[i]);
        }
        
        
        for(int i = 1; i < n-1; i++){
            if(a[i]>p[i-1] && a[i]<s[i+1]){
                return 1;
            }
        }
        return 0;
    }
}
