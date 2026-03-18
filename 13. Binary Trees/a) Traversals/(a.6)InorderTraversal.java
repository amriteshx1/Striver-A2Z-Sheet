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
    public List<Integer> inorder(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        infn(root, in);
        return in;
    }

    private void infn(TreeNode root, List<Integer> in){
        if(root == null) return;

        infn(root.left, in);
        in.add(root.data);
        infn(root.right, in);
    }
}