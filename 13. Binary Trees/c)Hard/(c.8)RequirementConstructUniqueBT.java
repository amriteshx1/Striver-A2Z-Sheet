class Solution {
    public boolean uniqueBinaryTree(int a, int b) {
        if(((a == 1) && (b == 3)) || ((a == 3) && (b == 1))) return false;
        if(((a == 1) && (b == 2)) || ((a == 2) && (b == 1))) return true;
        if(((a == 2) && (b == 3)) || ((a == 3) && (b == 2))) return true;
        return false;
    }
}