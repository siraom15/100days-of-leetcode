# Two sum

[Link to problem](https://leetcode.com/problems/two-sum/description/)

### Problem
Given an array of integers `nums` and an integer `target`, return `indices` of the two numbers such that they add up to target.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

##### Example 1:
Input: nums = [2,7,11,15], target = 9 <br>
Output: [0,1] <br>
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. <br>

##### Example 2:
Input: nums = [3,2,4], target = 6 <br>
Output: [1,2] <br>

##### Example 3:
Input: nums = [3,3], target = 6  <br>
Output: [0,1]  <br>

##### Follow-up: 
Can you come up with an algorithm that is less than O(n2) time complexity?

##### My answer

##### First answer
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}

```

##### Explaination
Loop inside the nums from `0` to `nums.length` to find the first adding number as `i`. 

Inside the previous loop, we loop from  `i+1` to `nums.length`  to find second adding number as `j`.

Lastly, check inside the 2nd loop. If summation of both number is equal to target then set the answer to index `i` and `j`

> For now we using O(n^2) time complexity.

**Follow-up**: Can you come up with an algorithm that is less than O(n2) time complexity?

```java
public static int[] twoSum(int[] nums, int target) {
        // This map used to cache a read number store as <number, index>
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // find difference
            int diff = target - nums[i];
            // If map contain diff return index of current number (i)
            // and index of diff
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            // Other case, put the map with nums as key and index as value of current number
            map.put(nums[i], i);
        }
        // default return in case of not found
        return new int[]{-1, -1};
    }
```
##### Explaination

Create HashMap to cache the number that have been read<br>
store as `<number, index>`

Loop inside the nums from `0` to `nums.length` as `i`. 

find the differece of target and current number.

Check the map, If map contain differece number <br>
which mean we've read that number and have its index
so can return index of current number (i) and index of difference

Other case, put the map with number as key and index as value of current number.
> For now we using O(n) time complexity.