package com.company;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
// structure and value are both symmetric

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by emma on 8/7/15.
 */


public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(9);
        TreeNode n11 = new TreeNode(20);
        TreeNode n22 = new TreeNode(15);
        TreeNode n23 = new TreeNode(7);
        root1.left = n11;
        root2.right = n22;
        n11.left = n22;
        n11.right = n23;
        TreeNode p = null;
        TreeNode q = null;
    }

    // iterative solution
    public static boolean isSymmetric(TreeNode root) {
        if(root==null || root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root.left);
        q.add(root.right);
        while (!q.isEmpty()){
            TreeNode lt = q.poll();
            TreeNode rt = q.poll();
            if(lt.val != rt.val) return false;
            if(lt.left != null && rt.right != null) {
                q.add(lt.left);
                q.add(rt.right);
            }
            else if(lt.left!=null || rt.right!=null) return false;
            if(lt.right != null && rt.left != null){
                q.add(lt.right);
                q.add(rt.left);
            }
            else if(lt.right!=null || rt.left!=null) return false;
        }
        return true;
    }

    // recursion
    public static boolean isSymmetricRec(TreeNode root){
        return root==null || isSym(root.left, root.right);
    }

    public static boolean isSym(TreeNode left, TreeNode right){
        if(left == null || right== null) return left==right; //trick learned online ###
        if(left.val != right.val) return false;
        return isSym(left.left, right.right) && isSym(left.right, right.left);
    }

}
