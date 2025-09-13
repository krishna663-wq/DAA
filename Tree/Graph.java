package Tree;

import java.util.HashMap;

/**
 * HashMap
 */
public class Graph {

    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graph(int v){
        map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i, new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){

        map.get(v1).put(v2,cost);
        map.get(v2).put(v1, cost);
    }
    public boolean containsEdge(int v1,int v2){
        return map.get(v1)
    }
    
}