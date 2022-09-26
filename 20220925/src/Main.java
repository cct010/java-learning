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
        System.out.println("前序遍历输出：");
        binaryTree.preOrder(btNode);
        System.out.println("\n"+"后序遍历输出：");
        binaryTree.postOrder(btNode);
        System.out.println("\n二叉树的长度：");
        int count = binaryTree.size(btNode);
        System.out.println(count);
        int leafCount = binaryTree.getLeafNodeCount1(btNode);
        System.out.println("叶子结点个数： "+leafCount);
        int height = binaryTree.getHeight(btNode);
        System.out.println("树的深度： "+height);
        BTNode btNode1 = binaryTree.find(btNode,'F');
        System.out.println(btNode1.val);
        boolean b1 = binaryTree.isCompleteTree(btNode);
        System.out.println("btNode是否是完全二叉树？"+b1);
    }
}
