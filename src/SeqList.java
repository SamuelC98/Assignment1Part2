import java.lang.reflect.Type;

public class SeqList<Type> {
    private static final int DEFAULT_CAPACITY = 30;
    private Type[] elements;
    public int size;

    public SeqList() {

    }

    public SeqList(SeqList<Type> list) {

    }

    public int size(){
        return -1;
    }

    public Type get(int index){
        return null;
    }

    public void ensureCapacity(int newSize){

    }

    public void add(int index, Type x){

    }

    public boolean add(Type x){
        return false;
    }
}