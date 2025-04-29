package buoi7_1;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
    this.data = data;
    this.left = this.right = null;
    }
}

public class binaryTree {
    Node root;

    public binaryTree() {
        root = null;
    }

    void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static int heightOfTree(Node root) {
        if (root == null)
            return -1;

        // compute the height of left and right subtrees
        int lheight = heightOfTree(root.left);
        int rheight = heightOfTree(root.right);

        return Math.max(lheight, rheight) + 1;
    }

    public int depthOfTree(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int ldepth = depthOfTree(root.left);
            int rdepth = depthOfTree(root.right);

            /* use the larger one */
            if (ldepth > rdepth)
                return (ldepth + 1);
            else
                return (rdepth + 1);
        }
    }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

        Node root = new Node(1);
        root.left = new Node(55);
        root.right = new Node(8);
        root.left.left = new Node(9);
        root.left.right = new Node(111);

        System.out.print("preOrder: ");
        bt.preOrder(root);
        System.out.println("");

        System.out.print("inOreder: ");
        bt.inOrder(root);
        System.out.println("");

        System.out.print("postOrder: ");
        bt.postOrder(root);
        System.out.println("");

        System.out.print("heightOfTree: " + bt.heightOfTree(root));
        System.out.println("");
        System.out.print("depthOfTree: " + bt.depthOfTree(root));


    }
}
