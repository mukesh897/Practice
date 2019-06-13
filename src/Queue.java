public class Queue {
    LinkedListNode head;

    public void enqueue (int key) {
        if (head == null){
            head = new LinkedListNode();
            head.data = key;
        }
        LinkedListNode temp = head;
        LinkedListNode temp2 = new LinkedListNode();
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = temp2;
        temp2.data = key;
    }
    public LinkedListNode dequeue () {
        LinkedListNode temp = head;
        LinkedListNode prev = head;
        if(temp != null){
            head = head.next;
            return prev;
        }
            return null;
    }

    public LinkedListNode peak () {
        LinkedListNode temp = head;
        if(temp != null){
            return temp;
        }
            return null;
    }
}

