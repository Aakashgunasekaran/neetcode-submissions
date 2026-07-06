/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                left = mid +1;

            }
            else
            {
                right = mid;
            }
        }
        int peak = left;
        int ans = binarySearchAsc(mountainArr,target,0,peak);
        if(ans !=-1)
        {
            return ans;
        }
        return binarySearchDesc(mountainArr,target,peak+1,n-1);
        
    }
    private int binarySearchAsc(MountainArray arr,int target, int left,int right)
    {
        while(left<=right)
        {
            int mid = left +(right-left)/2;
            int value = arr.get(mid);
            if(value == target)
            {
                return mid;
            }
            if(value <target)
            {
                left = mid +1;
            }
            else
            {
                right = mid -1;
            }
        }
        return -1;
    }
     private int binarySearchDesc(MountainArray arr,int target, int left,int right)
    {
        while(left<=right)
        {
            int mid = left +(right-left)/2;
            int value = arr.get(mid);
            if(value == target)
            {
                return mid;
            }
            if(value <target)
            {
                right = mid -1;
                
            }
            else
            {
                left = mid +1;
            }
        }
        return -1;
    }
}