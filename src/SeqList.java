import java.lang.reflect.Type;

public class SeqList<Type> {
    private static final int DEFAULT_CAPACITY = 30;
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
        return -1;
    }

    public Type get(int index){
        if(index<0 || index>=size) throw new ArrayIndexOutOfBoundsException();
        return elements[index];
    }

    public void ensureCapacity(int newSize){

    }

    public void add(int index, Type x){

        if( index<0 || index>size ) throw new ArrayIndexOutOfBoundsException();


        if(elements.length==size)

            ensureCapacity(size*2+1);
        for (int i=size; i>index; i--)
            elements[i]=elements[i-1];
        elements[index]=x;


        size++;
    }

    public boolean add(Type x){
        add(size, x);
        return true;
    }
}