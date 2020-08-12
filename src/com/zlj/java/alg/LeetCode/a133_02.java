package com.zlj.java.alg.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname a133_02
 * @Date 2020/8/12
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a133_02 {
    public Node cloneGraph(Node node) {
        Map<Node, Node> lookup = new HashMap<>();
        return dfs(node, lookup);
    }

    private Node dfs(Node node, Map<Node,Node> lookup) {
        if (node == null) return null;
        if (lookup.containsKey(node)) return lookup.get(node);
        Node clone = new Node(node.val, new ArrayList<>());
        lookup.put(node, clone);
        for (Node n : node.neighbors)clone.neighbors.add(dfs(n,lookup));
        return clone;
    }
}
