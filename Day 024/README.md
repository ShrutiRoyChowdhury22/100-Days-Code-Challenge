# Question: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
Check If Two String Arrays are Equivalent

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

## Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
### Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

#### Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

##### Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

The Approach is something like this that,

We simply need to combine all the substrings in the array into one combine string for both the arrays. 
The order of combining should not change. After we get both the combined substring, 
we’ll simply compare them and return true if all the characters match, otherwise false.

###### Note:
Concatenate all strings in the first array into a single string in the given order, the same for the second array.
Both arrays represent the same string if and only if the generated strings are the same.

###### Test Cases:
1. If the word1[i] and word2[i] contains dissimilar letters i.e.
    word1[i] contains uppercases and word2[i] contains lowercases.
2. If the string contains special characters.
3. If the size of word1 is not equals to size of word2.
4. If the string is empty.

##### Thats all !!
You are welcome to suggest more such test cases
