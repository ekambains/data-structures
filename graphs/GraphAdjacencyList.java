package graphs;
import java.util.ArrayList;
import java.util.LinkedList;

// Graph Using Adjacency List

public class GraphAdjacencyList {
    ArrayList<LinkedList<Node>> list;

    GraphAdjacencyList() {
        list = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> tmp = new LinkedList<>();
        tmp.add(node);
        list.add(tmp);
    }

    public void addEdge(int src, int dst) {
        Node n = list.get(dst).get(0);
        list.get(src).add(n);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> tmp = new LinkedList<>();
        Node n = list.get(dst).get(0);
        for(Node i: tmp) {
            if(i == n) return true;
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> tmp: list) {
            for(Node n: tmp) {
                System.out.print(n.data + " -> ");
            }
            System.out.println();
        }
    }
}
