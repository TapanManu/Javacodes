class Node{
    int data;
    Node next;
    Node(){
        this.data = 0;
        this.next = null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Rev{
    public static Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        Node succ = null;
        while(cur!=null){
            succ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = succ; 
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node new_head = reverse(head);
        Node ptr = new_head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        
    }
}
