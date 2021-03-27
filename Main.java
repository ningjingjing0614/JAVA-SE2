package pack14;

import java.util.*;

public class Main {
    public static ResultType buildTree(List<Character> preorder) {
        if (preorder.isEmpty()) {
            TreeNode root = null;
            int used = 0;

            ResultType resultType = new ResultType();
            resultType.root = root;
            resultType.used = used;

            return resultType;
        }

        char rootVal = preorder.get(0);
        if (rootVal == '#') {
            TreeNode root = null;
            int used = 1;

            ResultType resultType = new ResultType();
            resultType.root = root;
            resultType.used = used;

            return resultType;
        }

        TreeNode root = new TreeNode(rootVal);

        // 构建左子树 —— 使用相同的方式构建
        ResultType leftResult = buildTree(preorder.subList(1, preorder.size()));

        // 构建右子树 —— 使用相同的方式
        ResultType rightResult = buildTree(preorder.subList(1 + leftResult.used, preorder.size()));

        root.left = leftResult.root;
        root.right = rightResult.root;

        ResultType resultType = new ResultType();
        resultType.root = root;
        resultType.used = 1 + leftResult.used + rightResult.used;
        return resultType;
    }

    public static void main(String[] args) {
        char[] p = {'a', 'b', 'c', '#', '#', 'd', 'e', '#', 'g', '#', '#', 'f', '#', '#', '#'};
        List<Character> list = new ArrayList<>();
        for (char c : p) {
            list.add(c);
        }
        char[] x = {'a', 'b', 'c', '#', '#', 'd', 'e', '#', 'g', '#', '#', 'f', '#', '#', '#'};
//        ResultType resultType = buildTree(list);
//        System.out.println(resultType.root);
//        System.out.println(resultType.used);

        TreeNode root = buildTree2(x);
        System.out.println(root);
    }

    public static TreeNode buildTree2(char[] preorder) {
        if (preorder.length == 0) {
            return null;
        }

        char[] rootValue = Arrays.copyOfRange(preorder, 1, preorder.length);

        if (rootValue.length == 1 && rootValue[0] == '#') {
            return null;
        }

        TreeNode root = new TreeNode(rootValue[0]);
        root.left = buildTree2(preorder);
        root.right = buildTree2(preorder);

        return root;
    }


//    public TreeNode bulidTree3(int[] postorder, int[] inorder){
//        if (postorder.length == 0){
//            return null;
//        }
//        int rootValue = postorder[postorder.length - 1];
//        TreeNode root = new TreeNode(rootValue);
//
//        int leftSize = 0;
//        for (int i = 0; i < postorder.length; i++) {
//            if (inorder[i] == rootValue){
//             leftSize = i;
//            }
//        }
//        int rightSize = inorder.length - leftSize - 1;
//
//        //左子树的后序和中序
//
//    }

    public static void preorder(TreeNode root) {
        TreeNode cur;

        Stack<TreeNode> stack = new Stack<>();

        cur = root;
        while (cur != null || stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);

                System.out.println(cur.val);//前序遍历

                cur = cur.left;
            }
            TreeNode pop = stack.pop();

//            System.out.println(pop.val);//中序遍历

            cur = pop.right;
        }
    }



//    public static void postorder(TreeNode root) {
//        TreeNode cur;
//        TreeNode last = null;
//
//        Stack<TreeNode> stack = new Stack<>();
//
//        cur = root;
//        while (cur != null || stack.isEmpty()) {
//            while (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            }
//
//            TreeNode pop = stack.peek();
//
//            if (pop.right == null || pop.right == last) {
//
//            }
//        }

    public static void levelOrder(TreeNode root){
        if (root == null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.println(node.val);
            if (node.left != null){
                ((LinkedList<TreeNode>) queue).add(node.left);
            }
            if (node.right != null){
                ((LinkedList<TreeNode>) queue).add(node.right);
            }
        }
    }





}

