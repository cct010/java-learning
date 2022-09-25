import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-25
 * Time: 19:22
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode btNode = binaryTree.createTree();
        binaryTree.preOrder(btNode);
        System.out.println();
        binaryTree.postOrder(btNode);
        System.out.println();
        int count = binaryTree.size(btNode);
        System.out.println(count);
        int leafCount = binaryTree.getLeafNodeCount1(btNode);
        System.out.println(leafCount);
        int height = binaryTree.getHeight(btNode);
        System.out.println(height);
        BTNode btNode1 = binaryTree.find(btNode,'F');
        System.out.println(btNode1.val);
    }
}
