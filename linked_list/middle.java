class Node{
    static int count=0;
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
    
    static Node middle(Node Header){
        Node ptr=Header;
        Node middle = Header;
        while(ptr!=null){
            ++count;
            if(count%2==0)
                middle=middle.link;
            ptr=ptr.link;
        }
      
        return middle;
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
        System.out.println("middle element:"+Node.middle(Header).data);    
    }
}
