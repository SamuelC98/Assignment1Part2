import java.lang.reflect.Type;

public class SeqList<Type> {
    private static final int DEFAULT_CAPACITY = 23;
    private Type[] elements;
    public int size;

    //constructor
    public SeqList( ){
        elements = (Type[]) new Object[DEFAULT_CAPACITY];
        size=0;
    }

    //constructor1
    public SeqList(SeqList<Type>  list) {
        this.size = list.size;
        this.elements = (Type[]) new Object[DEFAULT_CAPACITY];
        for(int i = 0;i<list.size;i++)
            this.elements[i] = list.elements[i];
    }

    public int size(){
        return size;
    }

    //get the element in seqlist
    public Type get(int index){
        if(index<0 || index>=size) throw new ArrayIndexOutOfBoundsException();
        return elements[index];
    }

    public void ensureCapacity(int newSize){
        if( newSize < size ) return;
        Type[] old = elements;
        elements = (Type[])new Object[newSize];
        for(int i=0; i<size; i++)
            elements[i]=old[i];
        return;
    }

    // add elements
    public void add(int index, Type x){
        if( index<0 || index>size )
            throw new ArrayIndexOutOfBoundsException();
        if(elements.length==size)
            ensureCapacity(size*2+1);
        for (int i=size; i>index; i--)
            elements[i]=elements[i-1];
        elements[index]=x;
        size++;
    }

    // directly add element
    public Type add(Type x){
        add(size, x);
        return x;
    }
}