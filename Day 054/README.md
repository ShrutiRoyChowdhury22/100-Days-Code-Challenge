There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
Delete the given node. Note that by deleting the node, we do not mean removing it from memory. 

We mean:
The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.

## Custom testing:

For the input, you should provide the entire linked list head and the node to be given node. 
node should not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.

Since, Iteration is restricted so, we need to do something in place.
It is also given, that the node can’t be the tail of the list.
If we observe, then we can’t delete the given node, because deleting a node required the reference of the previous node.

## Method used: 

1. Deleting the given node is not possible, but we can delete the next node.

2. If we need to delete the next node then our current node will become the previous node of the next node.

   At first, copy the address of the next node in the temp node.

3. Now copy the value of temp node in the node.

4. Now link the node next to temp next which will delet the next node automatically.


## Test Cases:

## Test Case 1:
### Input: head = [4,5,1,9], node = 5
### Output: [4,1,9]
### Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

## Test Case 2:
### Input: head = [4,5,1,9], node = 1
### Output: [4,5,9]
### Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
