You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.



1. Firstly we will assign two pointers each to list one and two.

2. One pointer will act as previous node and the other one will act as current pointer.

3. Then we will set previous pointer as null and current will point to the head of list one.

4. Now for iteration we take a variable i which initially assigned to 0 then we run a while loop where it will runs untili is less than a which is given.

5. Till that previous pointer and current pointer will move and previous takes position of current node and current move one step forward.

6. As the condition fails the previous pointer starts pointing to list second and the next pointers of list will iterate through list 2 and prints the elements of list two untill its condition of reaching null becomes fails.

7. Then the previous pointer of list two will start points to list first current node.



This is how we have merged the nodes of linked list.



Test Cases:



Test Case 1:



Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]

Output: [0,1,2,1000000,1000001,1000002,5]

Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.



Test Case 2:

Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]

Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]

Explanation: The blue edges and nodes in the above figure indicate the result.
