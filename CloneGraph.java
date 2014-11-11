package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneGraph {
	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { 
			 label = x; 
			 neighbors = new ArrayList<UndirectedGraphNode>(); 
		}
	}
	//BFS
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node == null) {
			return null;
		}
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node, copy);
        queue.offer(node);
        while(!queue.isEmpty()) {
        	UndirectedGraphNode curr = queue.poll();
        	for(int i = 0; i < curr.neighbors.size(); i++) {
        		if(!map.containsKey(curr.neighbors.get(i))) {
        			copy = new UndirectedGraphNode(curr.neighbors.get(i).label);
        			map.put(curr.neighbors.get(i), copy);
        			queue.offer(curr.neighbors.get(i));
        		}
        		map.get(curr).neighbors.add(map.get(curr.neighbors.get(i)));
        	}
        }
        return map.get(node);
    }
	//DFS
	public UndirectedGraphNode cloneGraph2(UndirectedGraphNode node) {
		if(node == null) {
			return null;
		}
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node, copy);
        helper(node, map);
        return copy;
	}
	public void helper(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> map) {
		for(int i = 0; i < node.neighbors.size(); i++) {
			UndirectedGraphNode curr = node.neighbors.get(i);
			if(!map.containsKey(curr)) {
				UndirectedGraphNode copy = new UndirectedGraphNode(curr.label);
				map.put(curr, copy);
				helper(curr, map);
			}
			map.get(node).neighbors.add(map.get(curr));
		}
	}
}
