
public class Graph<Type> {
    SeqList<Vertex<Type>> verticesList = new SeqList<Vertex<Type>>();
    int numVertex;

    public Graph() {

    }

    public Type getVertexData(int number){
        return verticesList.get(number).getData();
    }
}
