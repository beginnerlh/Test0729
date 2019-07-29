/*
给定一个没有重复数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
[1,2,3],
[1,3,2],
[2,1,3],
[2,3,1],
[3,1,2],
[3,2,1]
]
*/

package lianxi0729;

import java.util.ArrayList;
import java.util.List;
//全排列
public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.permute(new int[]{1,2,3}));
    }
}

class Solution {
    List<List<Integer>> aList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        f(nums,nums.length,0);
        return aList;
    }

    public void f(int[] nums,int l,int count){
        if(l == count){
            List<Integer> list2 = new ArrayList<>(list);
            aList.add(list2);
            return ;
        }

        for(int i = 0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                f(nums,l,count+1);
                list.remove(list.size()-1);
            }
        }
    }
}