// Algorithm to search a number in the array in ascending order and return 
// their index if present else return where the target number 
// would be if present

class search {
    public static int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
             if(target==nums[i]){
                 return i;
             }
        }
        for(int i=0;i<nums.length;i++){
            if(target<nums[i]){
                return i;
            }
        }
        return nums.length;

    }
    public static void main(String[] args) {
        int nums[]={1};
        int ans =searchInsert(nums, 0);
        System.out.println(ans);
    }
}