
public class Graph<Type> {
    SeqList<Vertex<Type>> verticesList = new SeqList<Vertex<Type>>();
    int numVertex;

    public Graph() {

    }

    //get data in graph
    public Type getVertexData(int number) {
        return verticesList.get(number).getData();
    }

    //insert a vertex in graph
    public void InsertVertex(Type city) {
        Vertex<Type> vertex = new Vertex<>(city);
        for (int i = 0; i < verticesList.size(); i++) {
            if (verticesList.get(i).getData().equals(city))
                throw new ArrayStoreException();
        }

            verticesList.add(vertex);
            numVertex++;



    }

    public void InsertEdges(Type start, Type end, int fee, int distance){

    }
}
