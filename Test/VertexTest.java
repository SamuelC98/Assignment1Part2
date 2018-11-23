import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.NoSuchElementException;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


/**
 * Vertex Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 19, 2018</pre>
 * @version 1.0
 */
public class VertexTest {

    private Type data;
    private Vertex sut;
    private EdgeNode firstedge;



    @Before
    public void setUp() throws Exception {
        sut = new Vertex();


    }

    @Test
    public void shouldSetCorrectData() {
        sut.setData("London");
        assertEquals("London",sut.data);

    }

    @Test(expected = NoSuchElementException.class)
    public void shouldInputData(){
        sut.setData("");
    }


    @Test
    public void shouldTestConstructor(){
        assertEquals("Paris",new Vertex<String>("Paris").data);
    }


    @Test
    public void shouldTestGetData(){
        assertEquals("Berlin",new Vertex<String>("Berlin").getData());
    }





}