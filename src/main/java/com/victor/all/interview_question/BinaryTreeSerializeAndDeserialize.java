package com.victor.all.interview_question;

public class BinaryTreeSerializeAndDeserialize {
    int index;
    public TreeNode deserialize(String s) {
        String[] strings = s.split(",");
        index = 0;
        return beginDeserialize(strings);
    }

    private TreeNode beginDeserialize(String[] strings) {
        if (index >= strings.length) {
            throw new IllegalArgumentException();
        }

        if (strings[index].equals("$")) {
            return null;
        }

        TreeNode node = new TreeNode();
        node.e = strings[index];
        index++;
        node.left = beginDeserialize(strings);
        index++;
        node.right = beginDeserialize(strings);

        return node;
    }

    public String serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        beginSerialize(root, sb);
        return sb.toString();
    }

    private void beginSerialize(TreeNode node, StringBuffer sb) {
        if (node == null) {
            sb.append("$,");
            return;
        }

        sb.append(node.toString() + ",");
        beginSerialize(node.left, sb);
        beginSerialize(node.right, sb);
    }
}
