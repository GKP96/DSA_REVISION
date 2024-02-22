package queue_algorithms;

public class Create_Queue {
    int []arr = new int[(int)1e5];
    int front = -1, rear = -1;
    public void enqueue(int val){
        if(front == -1 && rear == -1){
            front++;
            rear++;
            arr[rear] = val;
        }else if(front == rear + 1 && rear == (int )1e5){
            rear = 0;
        }
        else{
            rear++;
            arr[rear] = val;
        }
    }
    public int dequeue() {
        if(front == -1 && rear == -1){
            System.out.println("Empty Queue !");
            return -1;
         }else if(front == rear){
            front = -1;
            rear = -1;
            System.out.println("Empty Queue !");
            return -1;
         }else{
            int temp = arr[front];
            front++;
            return temp;
         }
    }
}
