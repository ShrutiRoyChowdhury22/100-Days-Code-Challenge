# Question: https://leetcode.com/problems/shuffle-string/submissions/

## Explanation: 
You are given a string s and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.

### Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

#### Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
##### Explanation: After shuffling, each character remains in its position.

We will use a new char array "t" of size equals to the size of indices to store the result. 
Now we will traverse the indices array and will assign character at ith position to t[indices[i]].

At the end, the result string will contain the new shuffled string.

###### Test cases possible:

1. If user enters a character or a string in indices.
2. If user enters same values of indices.
    e.g. [4,4,5,2,0,2,7,2]
3. If the String is empty.
4. If the size of indices is greater than the size of string.

This is it. 
Hope you understand my logic of solving this problem.
