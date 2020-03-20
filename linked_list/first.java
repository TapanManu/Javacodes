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
}
class LinkedList{
    static Node Header;
    public static void main(String[] args) {
        Node ptr;
        Header=new Node(1);
        ptr=Header.addNode(2);
        ptr=ptr.addNode(3);
        Node.display(Header);
        
    }
}
