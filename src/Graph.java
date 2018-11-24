
public class Graph<Type> {
    SeqList<Vertex<Type>> verticesList = new SeqList<Vertex<Type>>();


    public Graph() {

    }

    //get data in graph
    public Type getVertexData(int number){
        return verticesList.get(number).getData();
    }
}
