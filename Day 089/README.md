## Explanation:

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 
## Test Cases:

Test Case 1:

Input: s = "ab#c", t = "ad#c"

Output: true

Explanation: Both s and t become "ac".


Test Case 2:

Input: s = "ab##", t = "c#d#"

Output: true

Explanation: Both s and t become "".


Test Case 3:

Input: s = "a#c", t = "b"

Output: false

Explanation: s becomes "c" while t becomes "b".
