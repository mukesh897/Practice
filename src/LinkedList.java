public class LinkedList {
    public static LinkedListNode head;

    public static int count(LinkedListNode head) {
        int count = 0;
        LinkedListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public static LinkedListNode toLast() {
        LinkedListNode temp = head;
        LinkedListNode temp2 = new LinkedListNode();
        LinkedListNode prev = null;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = temp2;
        temp2.data = lastkey;

        return head;
    }

    public static LinkedListNode fromlast(LinkedListNode head, int n) {
        int count = 0;
        LinkedListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }

        temp = head;
        for (int i = 1; i < count-n+1; i++) {
            System.out.println(temp.data + " temp data before");
            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;
    }

    public static void printlist(LinkedListNode head) {

        LinkedListNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static LinkedListNode findNode(LinkedListNode head, int key) {
        LinkedListNode temp = head;
        while (temp != null) {
            if (key == temp.data) {
                return temp;
            }
            temp = temp.next;

        }
        return null;
    }

    public static LinkedListNode delete(LinkedListNode head, int deletedata) {
        LinkedListNode temp = head;
        LinkedListNode prev = null;

        if (temp != null && head.data == deletedata) {
            head = head.next;
            return head;


        }

        while (temp != null && temp.data != deletedata) {
            prev = temp;
            temp = temp.next;
        }
        System.out.println(prev.data + " Previous data");
        System.out.println(temp.data + " Temp data");
        if (temp == null) {
            return head;
        }
        prev.next = temp.next;
        return head;


    }
}