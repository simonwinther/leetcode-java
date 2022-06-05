import org.junit.jupiter.api.Test;
import slidingwindow.BinaryTreeTraversal;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTraversalTest {

    @Test
    void inOrderTraversal1() {
        BinaryTreeTraversal sol = new BinaryTreeTraversal();
        List<Integer> expected = List.of(1,3,2);

        TreeNode three = new TreeNode(3, null, null);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode root = new TreeNode(1, null, two);

        assertEquals(expected, sol.inorderTraversal(root));
    }

    @Test
    void inOrderTraversal2() {
        BinaryTreeTraversal sol = new BinaryTreeTraversal();
        List<Integer> expected = List.of();

        TreeNode root = new TreeNode();
        assertEquals(expected, sol.inorderTraversal(root));
    }

    @Test
    void inOrderTraversal3() {
        BinaryTreeTraversal sol = new BinaryTreeTraversal();
        List<Integer> expected = List.of(1);

        TreeNode root = new TreeNode(1);
        assertEquals(expected, sol.inorderTraversal(root));
    }
}