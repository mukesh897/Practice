public class Stacks {
    LinkedListNode head;

    public void push (int key) {
       LinkedListNode temp2 = head;
       LinkedListNode temp = new LinkedListNode();

           temp.data = key;
           temp.next = temp2;

           head = temp;
    }
    public LinkedListNode pop () {
        LinkedListNode temp = head;
        LinkedListNode prev = head;
        if(temp != null){
            head = head.next;
            return prev;
        }
        return null;
    }

    public LinkedListNode peak () {
        LinkedListNode temp = head;he
