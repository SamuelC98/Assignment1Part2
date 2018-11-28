import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Type;
import java.util.NoSuchElementException;

import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ReadFileTest {
    private ReadFile rf1;
    private Graph graph;

    @Before
    public void setUp() throws Exception{
        rf1 = new ReadFile();
        graph = mock(Graph.class);


    }


    @Test
    public void shouldTestLoadData() throws Exception {
        rf1.loadData("/Users/apple/Desktop/services.txt",graph);
        assertEquals(0,graph.numVertex);
    }
}
