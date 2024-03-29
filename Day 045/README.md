There are two scenarios in which, a node is deleted from the end of the linked list. 

■ There is only one node in the list and that needs to be deleted.

■ There are more than one node in the list and the last node of the list will be deleted.

In the first scenario, 

■ the condition head → next = NULL will survive and therefore, the only node head of the list will be assigned to null. 

This will be done by using the following statements. 

current = head 

head = NULL 

In the second scenario, 

■ The condition head → next = NULL would fail and therefore, we have to traverse the node in order to reach the last node of the list. 
■ For this purpose, just declare a temporary pointer current and assign it to head of the list. 

We also need to keep track of the second last node of the list. 

■ For this purpose we perform the following statement:

while(current->next->next!=null){

                        current = current->next;

                        n++;

                    }

                    current->next=null;

The last node of the list that is pointed by current will become free and gets deleted.
