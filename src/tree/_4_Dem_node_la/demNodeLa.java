package tree._4_Dem_node_la;

// Define the Node class for the binary tree
class Node {
    int data;       // Data stored in the node
    Node left;      // Left child
    Node right;     // Right child

    // Constructor to create a new node
    Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

// Define the BinaryTree class with the method to count leaf nodes
class BinaryTree {
    Node root;      // Root of the binary tree

    // Recursive method to count the number of leaf nodes
    int countLeaves(Node node) {
        // Base case: if node is null, no leaves
        if (node == null) {
            return 0;
        }
        // If both left and right children are null, it's a leaf node
        if (node.left == null && node.right == null) {
            return 1;
        }
        // Recur for left and right subtrees and add the results
        return countLeaves(node.left) + countLeaves(node.right);
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create a sample binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Count and print the number of leaf nodes
        int leafCount = tree.countLeaves(tree.root);
        System.out.println("Number of leaf nodes: " + leafCount);  // Output: 3 (nodes 4, 5, 3)
    }
}
