package prac10;

public class BuildTree {
    public static TreeNode buildTree() {
        TreeNode root = null;//构建空树

        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode f = new TreeNode('f');
        TreeNode g = new TreeNode('g');
        TreeNode h = new TreeNode('h');
        TreeNode i = new TreeNode('i');
        TreeNode j = new TreeNode('j');
        TreeNode k = new TreeNode('k');
        TreeNode l = new TreeNode('l');
        TreeNode m = new TreeNode('m');
        TreeNode n = new TreeNode('n');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = null; d.right = h;
        e.left = null; e.right = null;
        f.left = i; f.right = j;
        g.left = null; g.right = k;
        h.right = l;
        j.left = m;
        m.left = n;

        return a;
    }
}
