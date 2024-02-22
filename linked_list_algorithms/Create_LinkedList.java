package linked_list_algorithms;

public class Create_LinkedList {
    public static void main(String[] args) {
        Node firstNode = new Node(0);
        Node secondNode = new Node(1);
        Node thirdNode = new Node(2);
        Node fourthNode = new Node(3);
        Node fifthNode = new Node(4);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        Node head = firstNode;
        while(head.next != null) {
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
}
