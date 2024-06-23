class QueueUsingLinkedList {

    Node head;
    Node tail;
    public QueueUsingLinkedList() {
        
    }
    
    public void push(int x) {
        Node n = new Node(x);
        if(tail == null){
          head = n;
          tail = n;
        } else {
          tail.next = n;
          tail = tail.next;
        }
    }
    
    public int pop() {
        int result = -1;
        if(head!=null){
          result = head.val;
          head = head.next;
        }
        return result;
    }
    
    public int peek() {
        int result = -1;
        if(head!=null){
          result = head.val;
        }
        return result;
    }
    
    public boolean empty() {
        return head == null && tail == null;
    }
}

class Node{
  int val;
  Node next;

  public Node(int val){
    this.val = val;
  }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
