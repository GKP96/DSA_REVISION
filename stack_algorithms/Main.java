package stack_algorithms;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Create_Stack obj =new Create_Stack();
        obj.pushStack(1);
        obj.pushStack(2);
        obj.pushStack(3);
        obj.pushStack(4);
        obj.pushStack(5);
        obj.printStack();
        System.out.println(obj.top);
        System.out.println(obj.popStack());
    }
}