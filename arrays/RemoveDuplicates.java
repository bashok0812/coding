class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        if(n==0){
            return 0;
        }

        int j=1;
        for(int i = 1 ; i< n ; i++){
           if(nums[i-1] != nums[i]){
               nums[j] = nums[i];
               j = j+1;
           }
        }

        return j;

    }
}
