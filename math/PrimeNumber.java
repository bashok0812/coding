public class PrimeNumber {
    public int solve(int a) {

        int numberOfFactors = getNumberOfFactors(a);

        if(numberOfFactors == 2){
            return 1;
        }
        return 0;
    }

    public int getNumberOfFactors(int n){

        int count = 0;
        for(int i = 1; i <= n/i; i++){
            if(n%i == 0){
                if(i == n/i){
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
