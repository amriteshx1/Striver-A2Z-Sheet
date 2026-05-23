class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if(root == null) return;
        prev = null;
        flattenRecursive(root);
    }

    private void flattenRecursive(TreeNode root){
        if(root == null) return;
    
        flattenRecursive(root.right);
        flattenRecursive(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}