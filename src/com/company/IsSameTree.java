package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by emma on 30/6/15.
 */
public class IsSameTree {
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
        if(isSameTreeRec(p,p)) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        Queue<TreeNode> testP = new LinkedList<TreeNode>();
        Queue<TreeNode> testQ = new LinkedList<TreeNode>();
        if(p == null && q==null) return true;
        else if(p == null || q==null) return false; // same as p==null&&q!=null || q==null&&p!=null
        testP.add(p);
        testQ.add(q);
        while (!testP.isEmpty() && !testQ.isEmpty()){
            TreeNode pp = testP.poll();
            TreeNode qq = testQ.poll();
            if(pp.val != qq.val) return false;
            if(pp.left!= null && qq.left!=null) {
                testP.add(pp.left);
                testQ.add(qq.left);
            }else if (pp.left!= null || qq.left!=null) return false;

            if(pp.right!= null && qq.right!=null) {
                testP.add(pp.right);
                testQ.add(qq.right);
            } else if (pp.right!= null || qq.right!=null) return false;

        }
        return true;
    }

    public static boolean isSameTreeRec(TreeNode p, TreeNode q){ //using recursion
        if(p == null && q==null) return true;
        return p!=null && q!=null && p.val==q.val && isSameTreeRec(p.left, q.left) && isSameTreeRec(p.right, q.right);
    }

}
