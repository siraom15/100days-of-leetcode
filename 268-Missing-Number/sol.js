const missingNumber = function (nums) {
  const n = nums.length;
  const expectedSum = (n / 2) * (n + 1);
  let actualSum = 0;
  for (let i = 0; i < n; i++) {
    actualSum += nums[i];
  }
  return expectedSum - actualSum;
};
