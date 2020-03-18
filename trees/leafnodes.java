class Node{
    int data;
    Node lc;
    Node rc;
    Node(int item){
        data=item;
        lc=null;
        rc=null;
    }
    static void getLeaves(Node root){
        if(root!=null){
        if(root.lc == null && root.rc == null)
            System.out.print(root.data+" ");
        getLeaves(root.lc);
        getLeaves(root.rc);     
        }
    }
    public static void main(String [] args){
        /* 
                     7
            4              10
        1       5       9     12      
              3   6       
        */
        Node root = new Node(7);
        root.lc = new Node(4);
        root.rc = new Node(10);
        root.lc.lc = new Node(1);
        root.lc.rc = new Node(5);
        root.lc.rc.lc = new Node(3);
        root.lc.rc.rc = new Node(6);
        root.rc.lc = new Node(9);
        root.rc.rc = new Node(12);
        getLeaves(root);
    }
}
