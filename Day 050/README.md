# Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

## 1. Find the middle of the Linked List.
The middle element can be found using two pointers, the pointer one moves ahead by two nodes, and the another pointer moves ahead by one node.

## 2. Reverse the second half of the list.

## 3. Check if the first half and second half are identical. 

## 4. If the Linked list contains an odd number of nodes, then the middle element should be ignored.


## Test Cases:

## Test Case 1:
### Input: head = [1,2,2,1]
### Output: true

## Test Case 2:
### Input: head = [1,2]
### Output: false
