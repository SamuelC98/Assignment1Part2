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

}