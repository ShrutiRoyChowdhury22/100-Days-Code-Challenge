Deleting a node from the beginning of the list is the simplest operation of all. 

■ It just need a few adjustments in the node pointers. 

■ Since the first node of the list is to be deleted, therefore, we just need to make the head, point to the next of the head. 

■ This will be done by using the following statements:

       head = head->next

Then in java, the concept of garbage collector is used and the nodes gets deleted.
