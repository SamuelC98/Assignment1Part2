
public class Graph<Type> {
    SeqList<Vertex<Type>> verticesList = new SeqList<Vertex<Type>>();
    int numVertex;
    private int[][] edges = new int[22][22];

    private int[] dist = new int[22];
    //keep the length of shortestpath
    private int[] path = new int[22];
    //keep pre nodes in shortestpath
    private boolean[] set = new boolean[22];
    private  int totalFee = 0;
    private  int totalDistance = 0;
    private  int[] totalData = new int[2];
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

    public String shortestPath(int v1, int v2) throws Exception {
        int n = verticesList.size();
        int N = 99999;


        for (int v0 = 0; v0 < n; v0++) {

            for (int i = 0; i < n; i++) {
                edges[v0][i] = N;
            }
        }

        SeqList<Vertex> verticesList1 = new SeqList(verticesList);


        for (int v0 = 0; v0 < n; v0++) {
            Vertex temp = verticesList.get(v0);
            EdgeNode se = temp.getFirstEdge();
            for (int i = 0; i < n; i++) {
                if (se != null) {
                    if (i == se.dest) {
                        edges[v0][i] = se.getFee();
                        se = se.getNext();
                        i = 0;

                    }
                }
                if (i == v0) {
                    edges[v0][i] = 0;
                }


            }


        }


        for (int i = 0; i < n; i++) {
            dist[i] = edges[v1][i];
            set[i] = false;
            if (i != v1 && dist[i] < N)
                path[i] = v1;
            else
                path[i] = -1;
        }

        set[v1] = true;
        dist[v1] = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = N;
            int u = v1;
            for (int j = 0; j < n; j++)
                if (!set[j] && dist[j] < min) {
                    u = j;
                    min = dist[j];
                }
            set[u] = true;
            for (int w = 0; w < n; w++)
                if (!set[w] && edges[u][w] < N && dist[u] + edges[u][w] < dist[w]) {
                    dist[w] = dist[u] + edges[u][w];
                    path[w] = u;
                }
        }


        int[] a = new int[22];
        int finish = 0;
        int temp = v2;
        int i ;



        a[0] = temp;

        for( i = 1;;i++){

            a[i] = path[temp];

            temp = path[temp];

            if(a[i] == v1)

                break;
        }



        for(int j = i; j > 0 ; j--) {
            EdgeNode se2 = verticesList1.get(a[j]).firstEdge;
            while (se2!= null) {
                if (se2.dest == a[j - 1]) {
                    totalFee = totalFee + se2.getFee();//To get the fees in the shortestPath
                    totalDistance = totalDistance + se2.getDistance();//To get the distances in the shortestPath

                    break;
                }
                se2 = se2.getNext();
            }
        }

        String[] cityName = new String[100];

        for (int mark1 = i ;mark1 >=0; mark1 --) {
            if(mark1 == 0) {
                String tempName = verticesList1.get(a[mark1]).getData().toString();
                cityName[mark1] = tempName;
                System.out.print(cityName[mark1]);
                break;
            }
            cityName[mark1] = verticesList1.get(a[mark1]).getData().toString();

        }
        return cityName[1];
    }



    }



