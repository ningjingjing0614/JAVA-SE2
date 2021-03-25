import prac10.BuildTree;
import prac10.TreeNode;

public class prac56 {
    package prac10;

import pack4.People4;

    public class TreeTravelsal {



        //前序遍历
        public static void preorder(TreeNode root) {
            if (root == null){
                return ;
            }
            System.out.printf("%c ",root.val);//第一次遇见就打印就是前序遍历
            //递归调用
            preorder(root.left);//left承担了左子树的含义
            preorder(root.right);
//        System.out.print("%c ",root.val);
        }

        public static void inorder(TreeNode root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.printf("%c ",root.val);//放中间就是中序遍历
            inorder(root.right);
        }

        static int i = 0;
        public static void postorder(TreeNode root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.printf("%c ",root.val);//放后边就是后序遍历
        }


//    public static void mofify5thvla(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        mofify5thvla(root.left);
//        mofify5thvla(root.right);
//        i ++;
//        if (i == 5){
//            root.val = 'z';
//        }
//    }

        public static int countTreeNodeSize1(TreeNode root) {
            if (root == null){
                return 0;
            }
            int leftTreeSize = countTreeNodeSize1(root.left);
            int rightTreeSize = countTreeNodeSize1(root.right);
            return 1 + leftTreeSize + rightTreeSize;
        }

        static int count;
        public static void countTreeNodeSize2(TreeNode root) {
            if (root == null){
                return ;
            }
            countTreeNodeSize2(root.left);
            countTreeNodeSize2(root.right);
            count++;
        }

        public static int countLeafNodeSize1(TreeNode root){
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null){
                return 1;
            }
            int leftCount = countLeafNodeSize1(root.left);
            int rightCount = countLeafNodeSize1(root.right);
            return leftCount + rightCount;
        }

        static int leftCount;
        public static void countLeafNodeSize2(TreeNode root) {
            if (root == null) {
                return ;
            }
            countLeafNodeSize2(root.left);
            countLeafNodeSize2(root.right);
            if (root.left == null && root.right == null){
                leftCount ++;
            }


        }


        public static void main(String[] args) {
            TreeNode root = BuildTree.buildTree();
//        i = 0;
//        mofify5thvla(root);



            preorder(root);
            System.out.println();
            inorder(root);
            System.out.println();
            postorder(root);
            System.out.println();

            System.out.println(countTreeNodeSize1(root));


            count = 0;
            countTreeNodeSize2(root);
            System.out.println(count);

            count = 0;
            countTreeNodeSize2(root);
            System.out.println(count);

            System.out.println(countLeafNodeSize1(root));

            leftCount = 0;
            countLeafNodeSize2(root);
            System.out.println(leftCount);
            leftCount = 0;
            countLeafNodeSize2(root);
            System.out.println(leftCount);
        }
    }

}
