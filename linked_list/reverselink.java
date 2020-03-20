import java.util.Stack;
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
    static Node selectNode(Node node,int threshold){
        if(++count<threshold)
            return selectNode(node.link,threshold);
        return node;
    }
    static void reverseDisplay(Node Header){
        Stack<Node> stack = new Stack<Node>();
        Node ptr=Header;
        while(ptr!=null){
            stack.push(ptr);
            ptr=ptr.link;
        }
        while(!stack.isEmpty())
            System.out.println(stack.pop().data);
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
        ptr=ptr.addNode(6);
        Node.reverseDisplay(Header);      
    }
}
