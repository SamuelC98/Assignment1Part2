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
    }

