In order to insert the node at the specific position 

First ask the user to enter the position and data need to be inserted.

Then allocate the memory for the new node and create a node current and assign it to head.



Now check whether the position is 1 or whether the head is null,

if it is so, then invoke insert at beginning function.

Then using while loop move the current uptill the position where node need to be inserted.



then assign newnode->next = current->next

and current -> next = newnode



This is how the insertion at specific position is inserted.
