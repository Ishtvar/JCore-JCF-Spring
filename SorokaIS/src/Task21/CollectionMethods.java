package Task21;

public interface CollectionMethods {
    public int size();

    public boolean isEmpty();

    public boolean contains(Object object);

    public boolean add(Object object);

    public boolean remove(Object object);

    public boolean addAll(MyCollection collection);

    public void clear();

    public boolean retainAll(MyCollection collection);

    public boolean removeAll(MyCollection collection);

    public boolean containsAll(MyCollection collection);

}
