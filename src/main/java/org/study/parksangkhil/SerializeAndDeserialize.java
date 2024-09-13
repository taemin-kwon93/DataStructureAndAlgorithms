package org.study.parksangkhil;

import java.util.*;

public class SerializeAndDeserialize {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        sb.append(root.val).append(", ");


        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                sb.append(node.left.val).append(", ");
            } else {
                sb.append(", ");
            }

            if (node.right != null) {
                queue.add(node.right);
                sb.append(node.right.val).append(", ");
            } else {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        String[] strs = data.split(", ");
        int strsIdx = 1;

        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty() && strsIdx != strs.length) {
            TreeNode node = queue.poll();

            if (strsIdx < strs.length && !strs[strsIdx].isEmpty()) {
                node.left = new TreeNode(Integer.parseInt(strs[strsIdx]));
                queue.add(node.left);
            }
            strsIdx++;

            if (strsIdx < strs.length && !strs[strsIdx].isEmpty()) {
                node.right = new TreeNode(Integer.parseInt(strs[strsIdx]));
                queue.add(node.right);
            }
            strsIdx++;
        }

        return root;
    }
}
