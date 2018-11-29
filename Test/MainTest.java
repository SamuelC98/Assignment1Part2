import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
    private  CityCheck cityCheck;
    private  ReadFile rf1;
    private  Graph graph1;
    private  Graph Europe;
    private  Vertex temp;
    private Main main1;
    private String data1;
    private String data2;
    private String[] test;

    @Before
    public void setUp() throws Exception{
        main1 = new Main();
        cityCheck = mock(CityCheck.class);
        when(cityCheck.CityCheck(rf1,graph1,Europe,temp,data1,data2)).thenReturn(0);
    }


    @Test
    public void shouldTestMain()throws Exception {
        main1.main(test);
        assertEquals(0,cityCheck.CityCheck(rf1,graph1,Europe,temp,data1,data2));

    }
}
