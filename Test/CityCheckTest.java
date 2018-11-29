import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import java.io.*;

import org.junit.Before;
import org.junit.Test;


public class CityCheckTest {
    private ReadFile rf1;
    private Graph graph1;
    private CityCheck cityCheck;
    private Vertex temp;
    private Graph Europe;



    @Before
    public void setUp() throws Exception{
        cityCheck = new CityCheck();
        rf1 = mock(ReadFile.class);
        graph1 = mock(Graph.class);
        temp = mock(Vertex.class);
        Europe = mock(Graph.class);


    }


    @Test(expected = NullPointerException.class)
    public void shouldTestCityCheck() throws Exception {
        String data1 = "London";
        String data2 = "Skopja";
        when(temp.getData()).thenReturn("London");
        cityCheck.CityCheck(rf1,graph1,Europe,temp,data1,data2);
    }

    @Test
    public void shouldTestCityCheck1() throws Exception {
        String data1 = "Skopja";
        String data2 = "London";
        when(temp.getData()).thenReturn("London");
        cityCheck.CityCheck(rf1,graph1,Europe,temp,data1,data2);
        assertEquals(0,cityCheck.CityCheck(rf1,graph1,Europe,temp,data1,data2));

    }


}
