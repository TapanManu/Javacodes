import java.util.Stack;

class Node{
    int data;
    Node lc;
    Node rc;
    Node(int item){
        data=item;
        lc=null;
        rc=null;
    }
    void preOrder(){
        Stack <Node> stack= new Stack<Node>();
        stack.push(this);
        while(!stack.empty()){
            System.out.print(stack.peek().data + " ");
            Node pop=stack.pop();
            if(pop.rc!=null)
                stack.push(pop.rc);
            if(pop.lc!=null)
                stack.push(pop.lc);
        }
    }
    public static void main(String [] args){
        /* 
                 7
            4        10
        1       5 9     12      
        */
        Node root = new Node(7);
        root.lc = new Node(4);
        root.rc = new Node(10);
        root.lc.lc = new Node(1);
        root.lc.rc = new Node(5);
        root.rc.lc = new Node(9);
        root.rc.rc = new Node(12);
        root.preOrder();
    }
}
