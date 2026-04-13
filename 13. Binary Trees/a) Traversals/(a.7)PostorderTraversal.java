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
    public List<Integer> postorder(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        postfn(root, post);
        return post;
    }

    private void postfn(TreeNode root, List<Integer> post){
        if(root == null) return;

        postfn(root.left, post);
        postfn(root.right, post);
        post.add(root.data);
    }
}