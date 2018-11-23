import java.util.NoSuchElementException;


public class Vertex<Type> {
    public Type data;


    public void setData(Type data) {
        if(data == "") throw new NoSuchElementException();
        this.data = data;

    }



}