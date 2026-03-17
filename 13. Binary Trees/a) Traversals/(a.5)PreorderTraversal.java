import java.util.*;

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

    public List<Integer> preorder(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        dfs(root, pre);
        return pre;
    }

    private void dfs(TreeNode node, List<Integer> pre){
        if(node == null) return;

        pre.add(node.data);
        dfs(node.left, pre);
        dfs(node.right, pre);
    }
}