/**
* Min Steps in Infinite Grid
*
* You are in an infinite 2D grid where you can move in any of the 8 directions
* You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.
*/
public class MinStepsInGrid {
    public int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
    
        int s = 0;
        for(int i = 1; i<a.size();i++){
            int k = mod(a.get(i-1) - a.get(i)) < mod(b.get(i-1) - b.get(i)) ? mod(b.get(i-1) - b.get(i)) : mod(a.get(i-1) - a.get(i));
            s += k;
        }
        return s;
    }
    
    public Integer mod(Integer a){
        if(a < 0){
            return 0 - a;
        }
        return a;
    }
}

