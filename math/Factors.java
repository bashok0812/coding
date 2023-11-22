public class Factors {
    public int solve(int a) {

        int count = 0;
        for(int i = 1; i <= a/i; i++){
            if(a%i == 0){
                if(a/i == i){
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }

        return count;
    }
}
