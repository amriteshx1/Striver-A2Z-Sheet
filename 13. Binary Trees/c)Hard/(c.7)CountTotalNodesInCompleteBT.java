class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { 
        data = val; 
        left = null; 
        right = null; 
    }
}


class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int left = getHeightLeft(root);
        int right = getHeightRight(root);

        // if perfect tree
        if(left == right) return (1 << left) - 1;

        // otherwise recurse
        else return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int getHeightLeft(TreeNode root) {
        int count = 0;
        while(root != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    public int getHeightRight(TreeNode root) {
        int count = 0;
        while(root != null) {
            count++;
            root = root.right;
        }
        return count;
    }
}