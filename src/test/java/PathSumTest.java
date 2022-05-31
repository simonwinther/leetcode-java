import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PathSumTest {

    @Test
    void hasPathSumTest1() {
        PathSum sol = new PathSum();

        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1);
        TreeNode eleven = new TreeNode(11, seven, two);
        TreeNode thirteen = new TreeNode(13);
        TreeNode four = new TreeNode(4, null, one);
        TreeNode four_first = new TreeNode(4, eleven, null);
        TreeNode eight = new TreeNode(8, thirteen, four);
        TreeNode five = new TreeNode(5, four_first, eight);

        assertTrue(sol.hasPathSum(five, 22));
    }

    @Test
    void hasPathSumTest2() {
        PathSum sol = new PathSum();

        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1, two, three);

        assertFalse(sol.hasPathSum(one, 5));
    }

    @Test
    void hasPathSumTest3() {
        PathSum sol = new PathSum();

        assertFalse(sol.hasPathSum(null, 0));
    }
}