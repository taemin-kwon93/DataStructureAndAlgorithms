package org.study.parksangkhil;

import java.util.*;

public class MaximumDepthOfTree {
    public int depthCounter(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        list.add(root.val);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left != null) {
                q.add(cur.left);
                list.add(cur.left.val);
            }
            if (cur.right != null) {
                q.add(cur.right);
                list.add(cur.right.val);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != null) {
                return i / 2;
            }
        }
        return 0;
    }

    public int maxDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            int q_size = queue.size();
            for (int i = 0; i < q_size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right != null)
                    queue.add(cur.right);
            }
        }

        return depth;
    }
}
