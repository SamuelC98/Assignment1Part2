import java.util.NoSuchElementException;

import java.util.NoSuchElementException;

public class Vertex<Type> {
    public Type data;


    public void setData(Type data) {
        this.data = data;
        if(data == "") throw new NoSuchElementException();
    }



}