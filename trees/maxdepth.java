class Node{
	Node rc;
	Node lc;
	int data;
	public Node(int data){
		this.data=data;
		this.rc=null;
		this.lc=null;
	}
}
class Tree{
	static Node root;
	static int countnodes=0;
	static int level=0;
	static int value=6;
	public static Node createRoot(){
		return new Node(value);
	}
	public static Node createNode(int data){
		return new Node(data);
	}
	public static void buildSkewedTree(Node leaf){ 
		//System.out.println(value);                           //creates a skewed tree	
		if(leaf==root){
			leaf = createRoot();
			root=leaf;
		}
		if(leaf.rc==null && value!=0){
			leaf.rc = createNode(--value);
			buildSkewedTree(leaf.rc);
		}
		if(leaf.lc==null && value!=0){
			leaf.lc = createNode(--value);
			buildSkewedTree(leaf.lc);
		}
	}
	public static void maxDepth(Node root){
		Node n =root;
		boolean countable=true;		
		if(n.lc!=null){
			maxDepth(n.lc);
			if(countable){
				level++;
				countable=false;
			}
		}
		if(n.rc!=null){
			maxDepth(n.rc);
			if(countable){
				level++;
				countable=false;
			}
		}
		
	}
	public static void main(String[] args) {
		//buildSkewedTree(root);
		root=createRoot();
		root.rc=new Node(3);
		root.rc.lc=new Node(4);
		root.rc.rc=new Node(2);
		root.lc=new Node(1);
		root.rc.rc.lc=new Node(6);
		maxDepth(root);
		System.out.println(level+1);            //maximum depth of tree
		
	}
}
