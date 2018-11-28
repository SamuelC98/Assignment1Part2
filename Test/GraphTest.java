import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {
    private SeqList<Vertex> verticesList;
    private Graph graph;
    private Vertex v1;
    private Vertex v2;
    private Vertex v3;
    private EdgeNode e1;
    private EdgeNode e2;

    @Before
    public void setUp() throws Exception{
         graph = new Graph();



    }

    @Test
    public void shouldTestGetVertexData() {
        graph.verticesList = mock(SeqList.class);
        v1 = mock(Vertex.class);
        when(graph.verticesList.get(0)).thenReturn(v1);
        when(v1.getData()).thenReturn("v1data");
        assertEquals(v1.getData(),graph.getVertexData(0));
    }

    @Test
    public void shouldTestInsertVertex() {
        graph.InsertVertex("v2data");
        assertEquals("v2data",graph.getVertexData(0));
        assertEquals(1,graph.numVertex);
    }

    @Test(expected = ArrayStoreException.class)
    public void shouldTestInsertVertex1() {
        graph.InsertVertex("v2data");
        graph.InsertVertex("v2data");

    }

    @Test
    public void shouldTestInsertEdges() {
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertEdges("v1data","v2data",55,24);
        v3 = (Vertex) graph.verticesList.get(0);
        assertEquals(55,v3.getFirstEdgeFee());
    }

    @Test(expected = ArrayStoreException.class)
    public void shouldTestInsertEdges1() {
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertEdges("v1data","v2data",55,24);
        graph.InsertEdges("v1data","v2data",55,24);
        v3 = (Vertex) graph.verticesList.get(0);
        assertEquals(55,v3.getFirstEdgeFee());
    }

    @Test(expected = ArrayStoreException.class)
    public void shouldTestInsertEdges2() {
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertEdges("v3data","v2data",55,24);


    }

    @Test(expected = ArrayStoreException.class)
    public void shouldTestInsertEdges3() {
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertEdges("v1data","v3data",55,24);


    }

    @Test
    public void shouldTestInsertEdges4() {
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertVertex("v3data");
        graph.InsertVertex("v4data");
        graph.InsertEdges("v1data","v2data",55,24);
        graph.InsertEdges("v1data","v3data",25,34);
        graph.InsertEdges("v2data","v3data",2,4);
        graph.InsertEdges("v1data","v4data",45,41);
        v1 = (Vertex) graph.verticesList.get(0);
        v2 = (Vertex) graph.verticesList.get(v1.getFirstEdgeDest());
        assertEquals("v2data",v2.getData());


    }

    @Test
    public void shouldTestShourtestPath() throws Exception {
        graph.InsertVertex("v0data");
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertVertex("v3data");
        graph.InsertVertex("v4data");
        graph.InsertVertex("v5data");
        graph.InsertEdges("v0data","v1data",55,1);
        graph.InsertEdges("v0data","v2data",25,1);
        graph.InsertEdges("v1data","v2data",2,1);
        graph.InsertEdges("v1data","v4data",2,1);
        graph.InsertEdges("v1data","v3data",2,1);
        graph.InsertEdges("v4data","v3data",2,1);
        graph.InsertEdges("v0data","v3data",45,1);
        graph.InsertEdges("v5data","v3data",45,1);
        graph.InsertEdges("v2data","v5data",45,1);
        graph.shortestPath(0,4);
        assertEquals(1,graph.shortestPath(0,4));
        graph.shortestPath(1,5);
        assertEquals(2,graph.shortestPath(1,5));


    }

    @Test
    public void shouldTestShourtestPath1() throws Exception {
        graph.InsertVertex("v0data");
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertVertex("v3data");
        graph.InsertVertex("v4data");
        graph.InsertVertex("v5data");
        graph.InsertEdges("v0data","v1data",3,7);
        graph.InsertEdges("v0data","v2data",1,6);
        graph.InsertEdges("v1data","v2data",4,4);
        graph.InsertEdges("v1data","v4data",2,3);
        graph.InsertEdges("v1data","v3data",5,2);
        graph.InsertEdges("v4data","v3data",6,1);
        graph.InsertEdges("v0data","v3data",3,8);
        graph.InsertEdges("v5data","v3data",2,7);
        graph.InsertEdges("v2data","v5data",4,3);
        int num = graph.shortestPath(1,5);
        assertEquals(8,num);


    }

    @Test
    public void shouldTestShourtestPath2() throws Exception {
        graph.InsertVertex("v0data");
        graph.InsertVertex("v1data");
        graph.InsertVertex("v2data");
        graph.InsertVertex("v3data");
        graph.InsertVertex("v4data");
        graph.InsertVertex("v5data");
        graph.InsertEdges("v0data","v1data",3,7);
        graph.InsertEdges("v0data","v2data",1,6);
        graph.InsertEdges("v1data","v2data",4,4);
        graph.InsertEdges("v1data","v4data",2,3);
        graph.InsertEdges("v1data","v3data",5,2);
        graph.InsertEdges("v4data","v3data",6,1);
        graph.InsertEdges("v0data","v3data",3,8);
        graph.InsertEdges("v5data","v3data",2,7);
        graph.InsertEdges("v2data","v5data",4,3);
        int dis1 = graph.shortestPath(0,4);
        assertEquals(10,dis1);






    }


}




