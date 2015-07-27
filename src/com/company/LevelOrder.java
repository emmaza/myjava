package com.company;
//https://leetcode.com/problems/binary-tree-level-order-traversal/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode n10 = new TreeNode(9);
        TreeNode n11 = new TreeNode(20);
        TreeNode n22 = new TreeNode(15);
        TreeNode n23 = new TreeNode(7);
        root.left = n10;
        root.right = n11;
        n11.left = n22;
        n11.right = n23;
        System.out.println(levelOrder(root));

    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> lo = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) return lo;
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int n = q.size();
            for ( int i = 0; i<n ; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            lo.add(level);
        }

        return lo;
    }
}
