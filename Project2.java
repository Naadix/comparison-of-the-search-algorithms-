
package MiniProject;

        import java.util.Random;
        import java.util.concurrent.ThreadLocalRandom;

public class Project2
{

    public static void main(String[] args)
    {


        for (int taille = 500; taille <=20000 ; taille =taille+ 500) {        Project2 list = new Project2();

            for (int i = 0; i < taille; i++) {
                //  		 int F7 = ThreadLocalRandom.current().nextInt();
                Random random = new Random();
                int F7 = random.nextInt(20000);
                list.push(F7);


            }
            System.out.println("Linked List before Sorting..");
            list.printlist(list.head);
            long starttime = System.currentTimeMillis();
            list.insertionSort(list.head);
            long endtime = System.currentTimeMillis();
            long timeExcution = endtime - starttime;
            //   System.out.println(timeExcution);
            System.out.println("               ");
            System.out.println("_______________________________________________________________");
            System.out.println("               ");
            System.out.println("LinkedList After sorting");
            list.printlist(list.head);
            System.out.println("               ");
            System.out.println("â—¤â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â—¥");
            System.out.println("â—– Temps d'exÃ©cution pour une taille de " + taille + ": " + timeExcution + " millisecondes â——");
            System.out.println("â—£â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â–¬â—¢");

            System.out.println("               ");
        }
    }


    node head;
    node sorted;
    class node
    {
        int val;
        node next;
        public node(int val)
        {
            this.val = val;
        }
    }

    void push(int val)
    {
        /* allocate node */
        node newnode = new node(val);
        /* link the old list of the new node */
        newnode.next = head;
        /* move the head to point to the new node */
        head = newnode;
    }



    // function to sort a singly linked list using insertion sort

    void insertionSort(node headref)
    {
        // Initialize sorted linked list
        sorted = null;

        node current = headref;

        // Traverse the given linked list and insert every

        // node to sorted

        while (current != null)

        {

            // Store next for next iteration

            node next = current.next;

            // insert current in sorted linked list

            sortedInsert(current);

            // Update current

            current = next;

        }

        // Update head_ref to point to sorted linked list

        head = sorted;

    }
    /*
     * function to insert a new_node in a list. Note that
     * this function expects a pointer to head_ref as this
     * can modify the head of the input linked list
     * (similar to push())
     */
    void sortedInsert(node newnode)
    {
        /* Special case for the head end */
        if (sorted == null || sorted.val >= newnode.val)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.val < newnode.val)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    /* Function to print linked list */

    void printlist(node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    // Driver program to test above functions
}

