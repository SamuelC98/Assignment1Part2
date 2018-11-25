
public class Graph<Type> {
    SeqList<Vertex<Type>> verticesList = new SeqList<Vertex<Type>>();
    int numVertex;

    public Graph() {

    }

    //get data in graph
    public Type getVertexData(int number){
        return verticesList.get(number).getData();
    }

    public void InsertVertex(Type city) {


    }
}
