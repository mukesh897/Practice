public class Main {
    public static void main(String[] args) {
        LinkedListNode firstNode = new LinkedListNode();
        LinkedListNode secondNode = new LinkedListNode();
        LinkedListNode thirdNode = new LinkedListNode();
        LinkedListNode fourthNode = new LinkedListNode();
        LinkedListNode fifthNode = new LinkedListNode();

        firstNode.data = 1;
        firstNode.next = secondNode;
        secondNode.data = 10;
        secondNode.next = thirdNode;
        thirdNode.data = 100;
        thirdNode.next = fourthNode;
        fourthNode.data = 1000;
        fourthNode.next= fifthNode;
        fifthNode.data = 10000;


//        int listCount = count(firstNode);
//        printlist(firstNode);
//        System.out.println(listCount);
//        LinkedListNode updatedList = delete(firstNode,10000);
//        System.out.println("Printing list after deletion");
//        printlist(updatedList);
      

        LinkedListNode updatedList = LinkedList.toLast(firstNode,55);
        LinkedList.printlist(updatedList);

//        LinkedListNode newNode = findNode(null,10);
//        if(newNode!=null) {
//            System.out.println(newNode.data);
//        }
//            System.out.println("Head should not be null");
    }



}
