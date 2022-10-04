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
        int count = binaryTree.size(btNode);
        System.out.println("\n二叉树的长度："+count);
        int leafCount = binaryTree.getLeafNodeCount1(btNode);
        System.out.println("叶子结点个数： "+leafCount);
        int height = binaryTree.getHeight(btNode);
        System.out.println("树的深度： "+height);
        BTNode btNode1 = binaryTree.find(btNode,'F');
        binaryTree.postOrder(btNode1);
        System.out.println();
        boolean b1 = binaryTree.isCompleteTree(btNode);
        System.out.println("btNode是否是完全二叉树？"+b1);
        BTNode btNode2 = binaryTree.createTree1();
        boolean b2 = binaryTree.isSameTree(btNode,btNode2);
        System.out.println("btNode与btNode2是否是相同的："+b2);
        System.out.println("btNode是否包含btNode2："+binaryTree.isSubtree(btNode,btNode2));
        System.out.println("btNode是否是平衡二叉树："+binaryTree.isBalanced(btNode));
        BTNode1 btNode3 = binaryTree.createTree2();
        System.out.println("前序：");
        binaryTree.preOrder1(btNode3);
        System.out.println("\n中序：");
        binaryTree.inOrder1(btNode3);
        int[] btNode3pre = {1,2,4,5,8,3,6,7};
        int[] btNode3in = {4,2,8,5,1,6,3,7};
        System.out.println("\n构建一棵树->后序遍历输出：");
        BTNode1 b3 =  binaryTree.buildTree(btNode3pre,btNode3in);
        binaryTree.postOrder1(b3);

    }
}
