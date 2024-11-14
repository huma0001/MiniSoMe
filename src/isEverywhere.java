public class isEverywhere {

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i<nums.length; i++){
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i+1]){
                if (nums[i - 1] > nums[i]){
                    nums[i] = nums[i - 1];
                } else if (nums[i + 1] > nums[i]){
                    nums[i] = nums[i + 1];
                }
            }

        }
        return nums;
    }



}
