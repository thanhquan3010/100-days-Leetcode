package tree;

class Node{
    int data;
    Node left, right;
    public Node(int key) {
        data = key;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root= null;
    }
    //1: insert
    public void insertNodeValue(int key) {
        insertNode(root, key);
    }

    public Node insertNode(Node root, int data) {
        //1: check base
        if(root == null) {
            root = new Node(data);
            return root;
        }

        //2: node routing
        if(data < root.data) {
            root.left = insertNode(root.left, data);
        } else if(data > root.data){
            root.right = insertNode(root.right, data);
        }

        return root;
    }
    //2: search node value
    public Node search(int data) {
        return searchNodeValue(root, data);
    }
    public Node searchNodeValue(Node tmp, int key) {
        //check base
        if(root == null || root.data == key) {
            return root;
        }

        if(root.data < key) {
            searchNodeValue(tmp.right, key);
        }
        return searchNodeValue(tmp.left, key);
    }

    //3: delete node has value
    public void deleteNodeHasValue(int key) {
        deleteNode(root, key);
    }

    public Node deleteNode(Node root, int data) {
        //check base
        if(root == null) {
            return root;
        }

        //find the value of node in this tree
        Node tmp = searchNodeValue(root, data);
        if(data < root.data) {
            deleteNode(root.left, data);
        } else if(data > root.data) {
            deleteNode(root.right, data);
        } else {
            // has 1 child node or has 0 child node
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            //tìm giá trị của node kế vị
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, data);
        }
        return root;
    }

    public int minValue(Node root) {
        int min_val = root.data;
        while (root.left != null) {
            min_val = root.left.data;
            root = root.left;
        }

        return min_val;
    }

    //INORDER
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

     public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        //insert
        bst.insertNodeValue(30);
        bst.insertNodeValue(40);
        bst.insertNodeValue(50);

        System.out.println("In ra theo thu tu INORDER: ");
        bst.inorder();

        //search
        int targetNodeValue = 100;
        if(bst.search(targetNodeValue) == null) {
            System.out.println(targetNodeValue + "not found");
        } else {
            System.out.println(targetNodeValue);
        }

        //xóa 1 node lá
        int keyToDelete = 30;
        bst.deleteNodeHasValue(30);

        //xóa node có 1 con
        bst.deleteNodeHasValue(40);
        //xóa node có 2 con

        bst.deleteNodeHasValue(50);
    }
}
