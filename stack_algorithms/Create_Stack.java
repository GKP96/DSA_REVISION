package stack_algorithms;
// we can create stack using array
public class Create_Stack {
    int arr[] = new int[(int)1e5];
    int top = 0;
    public void pushStack(int element) {
        arr[top] = element;
        top++;
    }
    public int popStack(){
        top--;
        int temp = arr[top];
        arr[top] = 0;
        return temp;
    }
    public int stackPeek(){
        return top;
    }
    public void printStack() {
        for(int i=0;i<top;i++)System.out.println(arr[i]+" ");
        
    }
}
// as we know we can use stack in recursion