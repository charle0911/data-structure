import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class BinaryTreeTest {
    TreeNode node;
    BinaryTree binaryTree = new BinaryTree();

    @Before
    public void preSetting() {
        node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.left.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(6);
        node.right.right.right = new TreeNode(7);
    }

    @Test
    public void testPreOrder() {
        binaryTree.preOrder(node);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(BinaryTreeTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}