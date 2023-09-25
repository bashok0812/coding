public class ArraySumFromEnds {
    public int solve(ArrayList<Integer> a, int b) {
        
        int n = a.size();
        
        int max = Integer.MIN_VALUE;
        
        ArrayList<Integer> sf = new ArrayList<>();
        ArrayList<Integer> sl = new ArrayList<>();
        
        sf.add(0, a.get(0));
        sl.add(0, a.get(n-1));
        for(int i = 1 ; i < b; i++){
            sf.add(i, sf.get(i-1) + a.get(i));
            sl.add(i, sl.get(i-1) + a.get(n-1-i));
        }
        
        for(int i = 0; i < b-1; i++){
            max = Math.max(max, sf.get(i)+sl.get(b-i-2));
        }
        
        max = Math.max(Math.max(sf.get(b-1), sl.get(b-1)), max);
        
        return max;
    }
}
