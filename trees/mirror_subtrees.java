class Node{
    int data;
    Node lc;
    Node rc;
    Node(int item){
        data=item;
        lc=null;
        rc=null;
    }
   static boolean mirror(Node left,Node right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        return left.data==right.data && 
        mirror(left.lc,right.rc)&&
        mirror(left.rc, right.lc);
   }
    public static void main(String [] args){
        /* 
                 7
            4         4
        1       5  5      1      
        */
        Node root = new Node(7);
        root.lc = new Node(4);
        root.rc = new Node(4);
        root.lc.lc = new Node(1);
        root.lc.rc = new Node(5);
        root.rc.lc = new Node(5);
        root.rc.rc = new Node(1);
        if(mirror(root.lc,root.rc))
            System.out.println("mirror subtrees");
        else
            System.out.println("not mirror");
    }
}
