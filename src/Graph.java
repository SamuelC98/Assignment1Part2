
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
        int mark1 = -1;
        for (int i = 0;i<verticesList.size ; i++) {
            if (verticesList.get(i).getData().equals(start)) {
                mark1 = i;
                break;
            }
        }
        if(mark1 ==-1)
            throw new ArrayStoreException("don't have");


        int mark2 = -1;
        for(int i=0;i<verticesList.size ;i++){
            if(verticesList.get(i).getData().equals(end)) {
                mark2 = i;
                break;
            }
        }
        if(mark2==-1)
            throw new ArrayStoreException("don't have");



        EdgeNode en1 = verticesList.get(mark1).getFirstEdge();

        if(en1 == null) {
            EdgeNode en2 = new EdgeNode(mark2,fee,distance);
            verticesList.get(mark1).firstEdge = en2;
            en2.next = null;
        }else {
            while (en1 != null) {
                if (verticesList.get(en1.dest).getData().equals(end))
                    throw new ArrayStoreException("already exists!");

                if (en1.next == null) {
                    EdgeNode en2 = new EdgeNode(mark2, fee, distance);
                    en1.next = en2;
                    en2.next = null;
                    return;
                }
                en1 = en1.next;
            }
        }
        }


    }



