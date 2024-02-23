package linked_list_algorithms;

public class Loop {
    public boolean isLoop(Node head) {
        if (head == null || head.next == null)
            return false;
        Node slowP = head, fastP = head;
        while (slowP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if (slowP == fastP)
                return true;
            if (fastP == null)
                return false;
        }
        return false;
    }

    public int countNodesInLoop(Node head) {
        if (head == null || head.next == null)
            return 0;
        int count = 0;
        // because I will need the slowP and fastP here
        Node slowP = head, fastP = head;
        while (slowP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if (slowP == fastP)
                break;
            if (fastP == null)
                return 0;
        }
        do {
            slowP = slowP.next;
            count++;
        } while (slowP != fastP);
        return count;

    }

    public Node removeLoop(Node head) {
        // check if loop is present or not
        Node slowP = head, fastP = head;
        boolean istrue = false;
        while (slowP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if (fastP == null)
                break;
            if (fastP == slowP)
                istrue = true;
        }
        if (istrue) {
            slowP = head;
            // if cycle is present at head
            if (fastP == slowP) {
                while (fastP.next != slowP)
                    fastP = fastP.next;
                fastP.next = null;
            } else {
                while (fastP.next != slowP.next) {
                    fastP = fastP.next.next;
                    slowP = slowP.next;
                }
                fastP.next = null;
            }
        }
        return head;
    }
}
