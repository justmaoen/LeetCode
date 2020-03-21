package Algorithm;

public class Day01_remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int temp =  removeDuplicates(nums);
        System.out.println("新数组有"+temp+"个元素");
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int i=0;   //记录不同元素个数
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){  //不同元素
                i++;
                nums[i] = nums[j];//元素迁移
            }
        }
        return i+1;
    }


}
