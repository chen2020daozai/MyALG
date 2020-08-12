package com.zlj.java.alg.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname a133
 * @Date 2020/8/12
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a133 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        System.out.println(node1);
        Node node = cloneGraph(node1);
        System.out.println(node);
    }

    public static Node cloneGraph(Node node) {
        Map<Integer,Node> map = new HashMap();
        Node out = dfs(node, map);
        return out;
    }

    public static Node dfs(Node node,Map<Integer,Node> map){
        Node out = new Node(node.val,new ArrayList<>());
        if (map.containsKey(node.val)) return map.get(node.val);
        else map.put(node.val, out);
        if (node.neighbors != null) {
            for (Node neighbor : node.neighbors) {
                Node node1 = dfs(neighbor,map);
                out.neighbors.add(node1);
            }
        }
        return out;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}