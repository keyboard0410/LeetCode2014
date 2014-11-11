package leetcode;

import java.util.Queue;

public class GraphTest {
	
	public static void breathFirstSearch(GraphNode root, int n) {
		if(root.val == n) {
			System.out.println("found at root");			
		}
		QueueBFS queue = new QueueBFS();
		root.visited = true;
		queue.enqueue(root);
		while(queue.first != null) {
			GraphNode c = queue.dequeue();
			for(GraphNode m : c.neighbors) {
				if(!m.visited) {
					System.out.println(m + "	");
					m.visited = true;
					if(m.val == n) {
						System.out.println("found  "+ n);
					}
					queue.enqueue(m);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		n1.neighbors = new GraphNode[] {n2, n3, n5};
		n2.neighbors = new GraphNode[]{n1,n4};
		n3.neighbors = new GraphNode[]{n1,n4,n5};
		n4.neighbors = new GraphNode[]{n2,n3,n5};
		n5.neighbors = new GraphNode[]{n1,n3,n4};
		
		breathFirstSearch(n1, 5);
	}

}
