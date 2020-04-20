public class PriorityQueueUsingLinkedList {
    Node1 front;
    Node1 rear;
    public PriorityQueueUsingLinkedList(){
        front= null;
        rear = null;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(Node1 newnode){
        if(isEmpty() || newnode.priority<front.priority){
            newnode.next = front;
            front = newnode;
        }else{
            Node1 temp = front;
            while(temp.next!=null && newnode.priority>=temp.next.priority){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }else{
            front = front.next;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node1 temp = front;
            while(temp!=null){
                System.out.print("d="+temp.data+ " p="+ temp.priority+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PriorityQueueUsingLinkedList obj = new PriorityQueueUsingLinkedList();
        Node1 n1 = new Node1(100,3);
        Node1 n2 = new Node1(208,2);
        Node1 n3 = new Node1(316,5);
        Node1 n4 = new Node1(432,4);
        Node1 n5 = new Node1(564,1);
        obj.display();
        obj.enqueue(n1);
        obj.display();
        obj.enqueue(n2);
        obj.display();
        obj.enqueue(n3);
        obj.display();
        obj.enqueue(n4);
        obj.display();
        obj.dequeue();
        obj.display();
        obj.enqueue(n5);
        obj.display();
    }
}

