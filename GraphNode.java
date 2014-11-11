package leetcode;

public class GraphNode {
	
	int val;
	GraphNode next;
	GraphNode[] neighbors;
	boolean visited;
	
	public GraphNode(int val) {
		this.val = val;
	}
	
	public GraphNode(int val, GraphNode[] neighbors) {
		this.val = val;
		this.neighbors = neighbors;
	}
	
	public String toString() {
		return "value: " + this.val;
	}

}
