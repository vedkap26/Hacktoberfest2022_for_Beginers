class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        //APPROACH 3

        Arrays.sort(nums);
        Set<List<Integer>>result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
        int left=i+1;
        int right=nums.length-1;
        while(left<right)
            {
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0)
                {
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                }
            else if(sum<0)
                {
                left++;
                }
            else
               {
                right--;
               }
            }
        }
        return new ArrayList<>(result);
    //Approach 1
    // int  n = nums.length;
    // for(int i = 0 ; i < n-1 ; i++)
    // {
    //     Set<List<Integer>>st=new HashSet<>();
    //     for(int j = i+1 ; j<n-1 ; j++)
    //     {
    //        target=-(nums[i]+nums[j])
    //        if(st.contains(target))
    //        {
    //             List<Integer> temp =Arrays.asList(nums[i],nums[j],nums[k]);
    //             temp.sort(null);
    //             st.add(temp);
    //             }
    //         }
    //     }
    ///}
    // return new ArrayList<>(st);
    //Approach 2
    // Set<List<Integer>> result = new HashSet<>();
    //     int n = nums.length;

    //     for (int i = 0; i < n - 2; i++) {
    //         Set<Integer> seen = new HashSet<>();
    //         for (int j = i + 1; j < n; j++) {
    //             int target = - (nums[i] + nums[j]);
    //             if (seen.contains(target)) {
    //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
    //                 triplet.sort(null); 
    //                 result.add(triplet);
    //             }
    //             seen.add(nums[j]);
    //         }
    //     }

    //     return new ArrayList<>(result);
    }
}
