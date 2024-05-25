import java.util.Map;
import java.util.HashMap;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices = new HashMap<>(); // With Weight

    public void addAdjacentVertex(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }
    public Vertex(V data){
        this.data = data;
    }
    public V getData(){
        return data;
    }
    public Map<Vertex<V>, Double> getAdjacentVertices(){
        return adjacentVertices;
    }

}