import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;

public class EdgeNodeTest {
    private int dest;
    private int distance;
    private int fee;
    private EdgeNode sut;
    private EdgeNode next;

    @Before
    public void setUp() throws Exception {
        sut = new EdgeNode(1, 23, 33);
        sut.next = new EdgeNode(2, 4, 34);
    }

    @Test
    public void shouldTestConstructor1() {
        assertEquals(1, sut.dest);
        assertEquals(23, sut.fee);
        assertEquals(33, sut.distance);

    }

    @Test
    public void shouldTestGetDest(){
        assertEquals(1,sut.getDest());
    }

    @Test
    public void shouldTestGetDistance(){
        assertEquals(33,sut.getDistance());
    }

    @Test
    public void shouldTestGetFee(){
        assertEquals(23,sut.getFee());
    }

    @Test
    public void shouldTestGetNext(){
        assertEquals(2,sut.getNext().dest);
        assertEquals(34,sut.getNext().distance);
        assertEquals(4,sut.getNext().fee);
    }

}