package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    
    int v;
    List<List<Integer>> adj;
    Graph(int v){
        this.v=v;
        adj=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

    }
     void addEdge(int u, int v) {
        adj.get(u).add(v);  // for directed graph
        adj.get(v).add(u);  // uncomment for undirected graph
    }
    void printGraph(){
           for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.printGraph();
    }


    }



