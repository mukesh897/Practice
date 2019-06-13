import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        LinkedListNode firstNode = new LinkedListNode();
//        LinkedListNode secondNode = new LinkedListNode();
//        LinkedListNode thirdNode = new LinkedListNode();
//        LinkedListNode fourthNode = new LinkedListNode();
//        LinkedListNode fifthNode = new LinkedListNode();
//        LinkedListNode sixthNode = new LinkedListNode();
//
//        firstNode.data = 1;
//        firstNode.next = secondNode;
//        secondNode.data = 10;
//        secondNode.next = thirdNode;
//        thirdNode.data = 100;
//        thirdNode.next = fourthNode;
//        fourthNode.data = 1000;
//        fourthNode.next= fifthNode;
//        fifthNode.data = 10000;
//        fifthNode.next = sixthNode;
//        sixthNode.data = 100000;



//        int listCount = count(firstNode);
//        printlist(firstNode);
//        System.out.println(listCount);
//        LinkedListNode updatedList = delete(firstNode,10000);
//        System.out.println("Printing list after deletion");
//        printlist(updatedList);

//
//        LinkedListNode nthfromlast = LinkedList.fromlast(firstNode,3);
//        System.out.println(nthfromlast.data);

//        LinkedListNode newNode = findNode(null,10);
//        if(newNode!=null) {
//            System.out.println(newNode.data);
//        }
//            System.out.println("Head should not be null");

//        int[] Heights = new int[5];
//
//        Heights[0] = 1;
//        Heights[1] = 2;
//        Heights[2] = 3;
//        Heights[3] = 8;
//        Heights[4] = 6;
//        long out_ = MaxStamina(Heights);
//        System.out.println(out_);
//
//
//        int[]
//
//    }
//
//    static long count( int S[], int m, int n ) {
//        if (n == 0)
//            return 1;
//
//
//        if (n < 0)
//            return 0;
//
//        if (m <=0 && n >= 1)
//            return 0;
//        return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
//    }
//
//    static long MaxStamina(int[] Heights){
//        // Write your code here
//
//        int[] stamina = new int[Heights.length - 1];
//
//        for (int i = 0 ; i < Heights.length - 1 ; i++) {
//            int currentStamina = Heights[i];
//            int prevHeight = Heights[i];
//            for (int j = i+1 ; j < Heights.length ; j++) {
//                if (Heights[j] < prevHeight) {
//                    continue;
//                }
//                prevHeight = Heights[j];
//                currentStamina = currentStamina^Heights[j];
//                System.out.println("i " + i + " j " + j +"  H[j] " +  Heights[j] + " currentStamina " + currentStamina);
//            }
//            stamina[i] = currentStamina;
//        }
//
//        int maxStamina = stamina[0];
//
//        for (int i = 0 ; i < stamina.length ; i++) {
//            if (stamina[i] > maxStamina) {
//                maxStamina = stamina[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(stamina));
//
//        return maxStamina;
//
//    }
//
//
//
//}
