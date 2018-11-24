import java.util.NoSuchElementException;


public class Vertex<Type> {
    public Type data;
    public EdgeNode firstEdge;

    public Vertex(Type d){
        data = d;
        firstEdge = null;
    }

    public Vertex() {
    }

    public void setData(Type data) {
        if(data == "") throw new NoSuchElementException();
        this.data = data;

    }

    public Type getData() {
        return data;
    }

    public EdgeNode getFirstEdge(){
        return firstEdge;
    }


}