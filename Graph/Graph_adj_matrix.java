package Graph;

public class Graph_adj_matrix {
    int v;
    int adj[][];

    Graph_adj_matrix(int v) {
        this.v = v;
        adj = new int[v][v];
    }

    void addedge(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    void print() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph_adj_matrix ob = new Graph_adj_matrix(4);
        ob.addedge(0, 1);
        ob.addedge(0, 2);
        ob.addedge(1, 3);
        ob.addedge(2, 3);
        ob.print();
    }
}