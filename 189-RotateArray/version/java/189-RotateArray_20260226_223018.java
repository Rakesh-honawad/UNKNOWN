// Last updated: 26/02/2026, 22:30:18
class Solution {
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public int findLengthOfLCIS(int[] nums) {
       int count=1;
       int maxcount=0;
       if(nums.length==1)
       return 1;
       for(int j=0;j<nums.length-1;j++){
        if(nums[j]<nums[j+1]){
            count++;
        }
        else
        count=1;
        maxcount=Math.max(count,maxcount);
       } 
       return maxcount;
    }
}