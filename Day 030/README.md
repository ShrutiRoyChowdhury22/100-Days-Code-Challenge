# Question:https://leetcode.com/problems/longest-common-prefix/
## Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

The approach is pretty simple -

First we will find the shortest string and its length.
Secondly, we will take the first string and match its each character one by one with all the other strings.
As soon as we encounter a character which does not match, we will break out of loop.

## Test Case 1:
### Input: strs = ["flower","flow","flight"]
### Output: "fl"

## Test Case 2:
### Input: strs = ["dog","racecar","car"]
### Output: ""
### Explanation: There is no common prefix among the input strings.


## Constraints:

1 <= strs.length <= 200

0 <= strs[i].length <= 200

strs[i] consists of only lowercase English letters.
