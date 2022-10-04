import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-25
 * Time: 19:10
 */
class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;
    public BTNode(char val) {
        this.val = val;
    }
}
class BTNode1{
    public int val;
    public BTNode1 left;
    public BTNode1 right;
    public BTNode1(int val) {
        this.val = val;
    }
}
public class BinaryTree {
    public BTNode root;
    public BTNode createTree(){
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }
    public BTNode createTree1(){
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }
    public BTNode1 createTree2(){
        BTNode1 A = new BTNode1(1);
        BTNode1 B = new BTNode1(2);
        BTNode1 C = new BTNode1(3);
        BTNode1 D = new BTNode1(4);
        BTNode1 E = new BTNode1(5);
        BTNode1 F = new BTNode1(6);
        BTNode1 G = new BTNode1(7);
        BTNode1 H = new BTNode1(8);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.left = H;
        return A;
    }
    //前序遍历
    void preOrder(BTNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    void inOrder(BTNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    //后序遍历
    void postOrder(BTNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    //获取树中结点个数 遍历方式
    int count = 0;
    int size(BTNode root){
        if (root == null){
            return 0;
        }
        count++;
        size(root.left);
        size(root.right);
        return count;
    }
    //获取树中结点个数 子问题方式
    int size1(BTNode root){
        if(root == null){
            return 0;
        }
        return size1(root.left)+size1(root.right)+1;
    }
    //获取叶子节点个数 遍历
    int leafCount =0;
    int getLeafNodeCount(BTNode root){
        if (root == null){
            return 0;
        }
        if(root.right==null&&root.left==null){
            leafCount++;
        }
        getLeafNodeCount(root.left);
        getLeafNodeCount(root.right);
        return leafCount;
    }
    //获取叶子结点个数 子问题
    int getLeafNodeCount1(BTNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        int leafLeft = getLeafNodeCount1(root.left);
        int leafRight = getLeafNodeCount1(root.right);
        return leafLeft+leafRight;
    }
    //获取第K层叶子的个数 子问题
    int getKLeveNodeCount(BTNode root,int K){
        if (root == null || K <= 0){
            return 0;
        }
        if (K == 1){
            return 1;
        }
        return getKLeveNodeCount(root.left,K-1)+getKLeveNodeCount(root.right,K-1);
    }
    //获取二叉树的高度 子问题
    int getHeight(BTNode root){
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //检测值为value的元素是否存在 遍历
    BTNode find(BTNode root ,char val){
        if (root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        BTNode ret = find(root.left,val);
        if(ret != null){
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null){
            return ret;
        }
        return null;
    }
    //判断一棵树是不是完全二叉树
    boolean isCompleteTree(BTNode root){
        if (root==null){
            return true;
        }
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            BTNode cur = queue.poll();
            if (cur!=null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
            else {
                break;
            }
        }
        while (!queue.isEmpty()){
            BTNode top = queue.peek();
            if(top!=null){
                return false;
            }
            queue.poll();
        }
        return true;
    }
    //判断两棵树是否是相同的
    public boolean isSameTree(BTNode p,BTNode q){
        if((p!=null&&q==null)||(p==null&&q!=null)){
            return false;
        }
        if (q==null&&p==null){
            return true;
        }
        if(q.val!=p.val){
            return false;
        }
        return isSameTree(q.left,p.left)&&isSameTree(p.right,q.right);
    }
    //一棵树是否是另一棵树的子树
    public boolean isSubtree(BTNode root,BTNode subRoot){
        if(isSameTree(root,subRoot)){
            return true;
        }
        if (isSameTree(root.left, subRoot)) {
            return true;
        }
        if (isSameTree(root.right, subRoot)) {
            return true;
        }
        return false;
    }
    //平衡二叉树
    public int height(BTNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight-rightHeight)>=1&&leftHeight>=0&&rightHeight>=0){
            return Math.max(leftHeight,rightHeight)+1;
        }
        else {
            return -1;
        }
    }
    public boolean isBalanced(BTNode root){
        if (root == null){
            return true;
        }
        return height(root)>=0;
    }
    //二叉树的最近公共祖先
    public boolean getPath(BTNode root, BTNode node, Stack<BTNode> stack){
        if (root == null||node == null){
            return false;
        }
        stack.push(root);
        if (root == node){
            return true;
        }
        boolean flg = getPath(root.left,node,stack);
        if (flg == true){
            return true;
        }
        flg = getPath(root.right,node,stack);
        if (flg == true){
            return true;
        }
        stack.pop();
        return false;
    }
    public BTNode lowstCommonAncestor(BTNode root,BTNode p,BTNode q){
        if (root == null){
            return null;
        }
        Stack<BTNode> stack1 = new Stack<>();
        getPath(root,p,stack1);
        Stack<BTNode> stack2 = new Stack<>();
        getPath(root,q,stack2);
        int size1 = stack1.size();
        int size2 = stack2.size();
        if(size1>size2){
            int size = size1-size2;
            while(size!=0){
                stack1.pop();
                size--;
            }
            while (!stack1.isEmpty()&&!stack2.isEmpty()){
                if(stack1.peek()==stack2.peek()){
                    return stack1.pop();
                }
                else {
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        else{
            int size = size2-size1;
            while(size!=0){
                stack2.pop();
                size--;
            }
            while (!stack1.isEmpty()&&!stack2.isEmpty()){
                if(stack1.peek()==stack2.peek()){
                    return stack2.pop();
                }
                else {
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        return  null;
    }

    //根据一棵树的前序遍历和中序遍历构造二叉树
    public int preIndex = 0;
    public BTNode1 createTreeByPandI(int[] preorder,int[] inorder,int inbegin,int inend){
        if(inbegin>inend){
            return null;
        }
        BTNode1 root = new BTNode1(preorder[preIndex]);
        int rootIndex = findIndexOf(inorder,inbegin,inend,preorder[preIndex]);
        if(rootIndex == -1){
            return null;
        }
        preIndex++;
        root.left = createTreeByPandI(preorder,inorder,inbegin,rootIndex-1);
        root.right = createTreeByPandI(preorder,inorder,rootIndex+1,inend);
        return root;
    }
    private int findIndexOf(int[] inorder,int inbegin,int inend,int key){
        for (int i = inbegin;i<= inend;i++){
            if(inorder[i] == key){
                return i;
            }
        }
        return -1;
    }
    public BTNode1 buildTree(int[] preorder,int[] inorder){
        if(preorder == null ||inorder == null){
            return null;
        }
        return createTreeByPandI(preorder,inorder,0,inorder.length-1);
    }
    public void preOrder1(BTNode1 root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder1(root.left);
        preOrder1(root.right);
    }
    //中序遍历
    void inOrder1(BTNode1 root){
        if(root == null){
            return;
        }
        inOrder1(root.left);
        System.out.print(root.val+" ");
        inOrder1(root.right);
    }
    //后序遍历
    void postOrder1(BTNode1 root){
        if (root == null){
            return;
        }
        postOrder1(root.left);
        postOrder1(root.right);
        System.out.print(root.val+" ");
    }
    //二叉树的最近公共祖先
    public boolean getPath1(BTNode1 root, BTNode1 node, Stack<BTNode1> stack){
        if (root == null||node == null){
            return false;
        }
        stack.push(root);
        if (root == node){
            return true;
        }
        boolean flg = getPath1(root.left,node,stack);
        if (flg == true){
            return true;
        }
        flg = getPath1(root.right,node,stack);
        if (flg == true){
            return true;
        }
        stack.pop();
        return false;
    }
    public BTNode1 lowstCommonAncestor1(BTNode1 root,BTNode1 p,BTNode1 q){
        if (root == null){
            return null;
        }
        Stack<BTNode1> stack1 = new Stack<>();
        getPath1(root,p,stack1);
        Stack<BTNode1> stack2 = new Stack<>();
        getPath1(root,q,stack2);
        int size1 = stack1.size();
        int size2 = stack2.size();
        if(size1>size2){
            int size = size1-size2;
            while(size!=0){
                stack1.pop();
                size--;
            }
            while (!stack1.isEmpty()&&!stack2.isEmpty()){
                if(stack1.peek()==stack2.peek()){
                    return stack1.pop();
                }
                else {
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        else{
            int size = size2-size1;
            while(size!=0){
                stack2.pop();
                size--;
            }
            while (!stack1.isEmpty()&&!stack2.isEmpty()){
                if(stack1.peek()==stack2.peek()){
                    return stack2.pop();
                }
                else {
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        return  null;
    }

}
