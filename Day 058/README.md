# You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

## Method Used: Two Pointers Approach

## 1. We have taken two pointers where one pointer will store the values of the kth node from the beginning and the other pointer will store the value of the kth node from the end.

## 2. We will iterate the for loop to reach the kth index from beginning. Then this value is store in another node for future swapping.

## 3. Then the pointers are moved ahead and as the pointer reaches the kth index from the end we will swap the nodes.

## Test Cases:

## Test Case 1:

### Input: head = [1,2,3,4,5], k = 2
### Output: [1,4,3,2,5]

## Test Case 2:
### Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
### Output: [7,9,6,6,8,7,3,0,9,5]
