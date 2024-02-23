# Palindrome-Number

[Link to problem](https://leetcode.com/problems/palindrome-number/description/)

### Problem

Given an integer x, return true if x is a
palindrome
, and false otherwise.

##### Example 1:

Input: x = 121 <br>
Output: true<br>
Explanation: 121 reads as 121 from left to right and from right to left. <br>

##### Example 2:

Input: x = -121<br>
Output: false<br>
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.<br>

##### Example 3:

Input: x = 10<br>
Output: false<br>
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.<br>

##### Follow up:

Could you solve it without converting the integer to a string?

##### My answer

```java
public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        int len = temp.length();
        for (int i = 0; i < len / 2; i++) {
            if (temp.charAt(i) != temp.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

```

##### Explaination

We will make the input number to string.<br>
Loop from 0 to middle of string.<br>
Every iteration we check `charAt(i)` is same with `charAt(len-1-i)` or not.<br>
If it not the same we'll return false, else return true

##### But we have follow up:

Could you solve it without converting the integer to a string?

How can we solve this problem.

##### My answer

```java
public boolean isPalindrome(int x) {
       
}
```

##### Explaination

