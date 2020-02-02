public class BinaryTree {

    public void preOrder(TreeNode node) {
        System.out.print(node.val);
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }

    public void inOrder(TreeNode node) {
        if (node.left != null) {
            inOrder(node.left);
        }
        System.out.print(node.val);
        if (node.right != null) {
            inOrder(node.right);
        }
    }

    public void postOrder(TreeNode node) {
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.println();
    }
}
