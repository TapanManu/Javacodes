class DeepNode 
{ 
    // A tree node  
    static class Node 
    { 
        int data; 
        Node left, right; 
        Node(int key)  
        { 
            data = key; 
            left = null; 
            right = null; 
        } 
    } 
    static int maxLevel = -1; 
    static int res = -1; 
    // maxLevel : keeps track of maximum level seen so far.  
    // res : Value of deepest node so far.  
    // level : Level of root  
    static void find(Node root, int level)  
    { 
        if (root != null)  
        { 
            find(root.left, ++level); 
  
            // Update level and resue  
            if (level > maxLevel)  
            { 
                res = root.data; 
                maxLevel = level; 
            } 
  
            find(root.right, level); 
        } 
    } 
    // Returns value of deepest node  
    static int deepestNode(Node root)  
    { 
        // Initialze result and max level  
        /* int res = -1;  
        int maxLevel = -1; */
  
        // Updates value "res" and "maxLevel"  
        // Note that res and maxLen are passed  
        // by reference.  
        find(root, 0); 
        return res; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
  
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.right.left = new Node(5); 
        root.right.right = new Node(6); 
        root.right.left.right = new Node(7); 
        root.right.right.right = new Node(8); 
        root.right.left.right.left = new Node(9); 
        System.out.println(deepestNode(root)); 
    } 
} 
