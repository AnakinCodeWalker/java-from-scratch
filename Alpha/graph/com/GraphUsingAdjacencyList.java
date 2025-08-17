package graph.com;

import java.util.ArrayList;
import java.util.Arrays;

// in java graph can be represented via various types :
/* edge =<source, destination, weight>
1. adjacency list representation -> array of ArrayList<source, destination, weight>
array stores the vertices
arraylist stores the edges.
 */
public class GraphUsingAdjacencyList {
   static class Edge {
        int source ;
        int destination ;
        int weight ;
     public   Edge(int source , int destination, int weight){ // constructor
            this.source=source;
            this.destination=destination;
            this.weight=weight;
        }
    }
    public static void main(String[] args) {
       int v=5 ; //the size of the array will be equal to number of vertices.
        ArrayList<Edge>[] graph = new  ArrayList[v]; //an array of arraylist
// The graph should contain Arraylist as initial value in it. But Initially it will contain null value in  it
      // in each array there will be a null value because internally it contains a null value in it
        System.out.println(Arrays.toString(graph));
        // We run a loop and to change the null value  of the Array of ArrayList to some other value in it.
        for (int i =0 ; i < v;i++){
graph[i]=new ArrayList<>(); // at each index it creates a new arraylist which was previously null but later on
//            it was changed to empty arraylist
        }
System.out.println(Arrays.toString(graph)); //now this will contain empty arraylist at each index of array..
//1st-vertex
graph[0].add(new Edge(0,1,5));
graph[1].add(new Edge(1,0 , 5));
graph[1].add(new Edge(1,2 , 1));
graph[1].add(new Edge(1, 3,3 ));
//2nd-vertex
graph[2].add(new Edge(2,1,1));
graph[2].add(new Edge(2,3,1));
graph[2].add(new Edge(2,4,4));
// 3rd-vertex
graph[3].add(new Edge( 3 ,1,3));
   graph[3].add(new Edge(3,2,1));

    // 4th-vertex.
    graph[4].add(new Edge(4,2,2));
        System.out.println(Arrays.toString(graph));//how do i print the graph?

   }
}
