package graphs;
import java.util.ArrayList;
//Graph Using Adjacency Matrix

public class Graph {
    int[][] matrix;
    ArrayList<Node> nodes;

    Graph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return (matrix[src][dst] == 1) ? true : false;
    }

    public void print() {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
