package com.practice.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 */
public class BinaryTreelevelorderTraversal {



      //Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(level);
        }

        return result;
    }


    public static void main(String[] args) {

           //[3,9,20,null,null,15,7]
        TreeNode treeNode = new TreeNode(3);
        System.out.println(treeNode.val);
        //System.out.println(new BinaryTreelevelorderTraversal());

    }
}
