class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],i);
        }
        for(int j=0;j<n;j++)
        {
            int curr = target-nums[j];
            if(map.containsKey(curr)&&map.get(curr)!=j)
            {
                return new int [] {j,map.get(curr)};
            }
        }
        return new int[] {-1,-1};
        
    }
}
