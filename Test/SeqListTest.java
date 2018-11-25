import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;
public class SeqListTest {
    public Type[] elements;
    public int size;
    private SeqList<Vertex> sut;
    private SeqList<Vertex> test;
    private Vertex v1;
    private Vertex v2;
    private Vertex v3;
    private Vertex v4;


    @Before
    public void setUp() throws Exception {
        sut = new SeqList<>();
        v1 = mock(Vertex.class);
        v2 = mock(Vertex.class);
        v3 = mock(Vertex.class);
        sut.add(0, v1);
        sut.add(1, v2);
        sut.add(v3);
        when(v1.getData()).thenReturn("data1");
        when(v2.getData()).thenReturn("data2");
        when(v3.getData()).thenReturn("data3");

    }

    @Test
    public void shouleTestConstructor(){
        test = new SeqList<>();
        assertEquals(0,test.size);
    }

    @Test
    public void shouleTestConstructor2(){
        test = new SeqList<>(sut);
        assertEquals(3,test.size);
    }


    @Test
    public void shouldTestGet(){
        assertEquals("data1",sut.get(0).getData());
        assertEquals("data2",sut.get(1).getData());
        assertEquals("data3",sut.get(2).getData());

    }

    @Test
    public void shouldTestAdd(){
        assertEquals(v1,sut.get(0));
        assertEquals(v2,sut.get(1));

    }

    @Test
    public void shouldTestAdd1(){
        assertEquals(v3,sut.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldTestAddException(){
        sut.add(100,v3);
    }

    @Test
    public void shouldTestSpecialElementsLocation(){
        for (int i = 0; i < 24; i++) {
            sut.add(1,v2);
        }
        assertEquals("data2",sut.get(1).getData());

    }


    @Test
    public void shouldTestSize(){
        assertEquals(3,sut.size());
    }

    @Test(expected = Exception.class)
    public void shouldTestGetException(){
        sut.get(100);
    }

    @Test
    public void shouldTestEnsureCapacity(){
        sut.ensureCapacity(5);
        v4 = mock(Vertex.class);
        sut.add(3,v4);
        assertEquals(4,sut.size());
    }

}
