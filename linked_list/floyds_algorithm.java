class Node{
    int data;
    Node link;
    Node(int item){
        data=item;
        link=null;
    }
    Node addNode(int item){
        return this.link=new Node(item);
    }
    static void display(Node Header){
        Node ptr=Header;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    //detecting loop using floyd's algorithm
    static Boolean detectloop(Node Header){
        Node slow_pointer =  Header;
        Node fast_pointer =  Header;
        while(slow_pointer!=null && fast_pointer!=null && fast_pointer.link!=null){
            slow_pointer=slow_pointer.link;
            fast_pointer=fast_pointer.link.link;
            if(slow_pointer==fast_pointer){
                    return true;
            }
        }
        return false;
    }
}
class LinkedList{
    static Node Header;
    public static void main(String[] args) {
        Node ptr;
        Header=new Node(1);
        ptr=Header.addNode(2);
        ptr=ptr.addNode(3);
        ptr=ptr.addNode(4);
        ptr=ptr.addNode(5);
       // ptr=ptr.addNode(6);
       // ptr=ptr.addNode(7);
        if(Node.detectloop(Header))
            System.out.println("loop present");
        else
            System.out.println("no loop");
    }
}
