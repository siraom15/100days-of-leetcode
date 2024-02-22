# 268. Missing Number

[Link to problem](https://leetcode.com/problems/missing-number/description/)

### Problem

Given an array nums containing **n** distinct numbers in the range **[0, n]**, return the only number in the range that is missing from the array.

##### Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

##### Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

##### Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

##### My answer

```js
const missingNumber = function (nums) {
  const n = nums.length;
  const expectedSum = (n / 2) * (n + 1);
  let actualSum = 0;
  for (let i = 0; i < n; i++) {
    actualSum += nums[i];
  }
  return expectedSum - actualSum;
};
```

##### Explaination

We know that array nums containing **n** number from length 0 to n
and this problem every input has a missing number.
We can use sum of sequence from 1 to n to find missing number.

Missing number = Sum of sequence - Actual Sum.

> Note: Summation from 1 to n = Sn = n/2 [a1 + an]
> in this case a1 = 1 and an = n
> so expectedSum = n/2 \* (1+n)

Example: [0,1,2,3,5]
n = 5 since there are 5 numbers,
so sum of sequnce = ```5/2 * (1+5)``` = 15
but actual sum we have ```1+2+3+5``` = 11
so that missing number = 15-11 = 4
