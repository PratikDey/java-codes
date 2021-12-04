package com.pratik.randoms;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class SumRootToLeafNodes {
    public static void main(String[] args) {



    }

    public static int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return recursiveDFS(root, 0);
    }

    public static int recursiveDFS(TreeNode node, int current_value) {
        if(node == null) {
            return 0;
        }

        current_value = current_value * 10 + node.val;

        if(node.right == null && node.left == null) {
            return current_value;
        }

        return recursiveDFS(node.left, current_value) + recursiveDFS(node.right, current_value);
    }
}
