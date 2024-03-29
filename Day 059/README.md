You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.


## So we use Stack to solve this problem:

1. Firstly we push the elements in stack.

2. While pushing the elements we peek the elements that is in the stack, if it matches with the elements that is going to be pushed, we will pop out the similar elements.

3. This way the stack will then left with the dissimilar character and then we will store it in string variable and with the help of string builder we reverse the elements, as the stack follows FILO method so we need to print according to the output the problem has asked.

 
## Test Cases:

Test Case 1:

Input: s = "abbaca"

Output: "ca"

Explanation: 

For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move. 
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".


Test Case 2:

Input: s = "azxxzy"

Output: "ay"
