package Task21;

import java.util.Arrays;
import java.util.Iterator;

public class MyCollection implements CollectionMethods, Iterable<Object> {

    private Object[] collection = new Object[0];

    @Override
    public int size() {
        int s = collection.length;
        return s;
    }

    @Override
    public boolean isEmpty() {
        if (collection.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        for (Object o : collection)
            if (object.equals(o)) {
                return true;
            }
//        for (int i = 0; i < collection.length; i++) {
//            if (object.equals(collection[i])) {
//                return true;
//            }
//        }
        return false;
    }

    @Override
    public boolean add(Object object) {
        if (isEmpty()) {
            Object[] collection1 = new Object[(collection.length + 1)];
            collection1[0] = object;
            collection = collection1;
            return true;
        } else {
            Object[] collection1 = new Object[(collection.length + 1)];
            for (int i = 0; i < collection.length; i++) {
                collection1[i] = collection[i];
            }
            collection1[collection.length] = object;
            collection = collection1;
        }
        if (collection[collection.length - 1].equals(object)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i].equals(object)) {
                collection[i] = null;
                counter1++;
            }
        }

        Object[] collection1 = new Object[collection.length - counter1];

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] != null) {
                collection1[i - counter2] = collection[i];
            } else {
                counter2++;
            }
        }
        if (collection.length != collection1.length) {
            collection = collection1;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(MyCollection collection) {
        int counter1 = 0;
        Object[] collection1 = new Object[(this.collection.length + collection.size())];
        Object[] collection2 = new Object[collection.size()];
        for (Object o : collection) {
            collection2[counter1] = o;
            counter1++;
        }

        for (int i = 0; i < collection1.length; i++) {
            if (i < this.collection.length) {
                collection1[i] = this.collection[i];
            } else {
                collection1[i] = collection2[(i - this.collection.length)];
            }
        }
        this.collection = collection1;
        for (Object o : this.collection) {
            if (collection.contains(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Object[] collection1 = new Object[0];
        collection = collection1;

    }

    @Override
    public boolean retainAll(MyCollection collection) {
        for (Object o : this.collection) {
            if (!collection.contains(o)) {
                this.remove(o);
            }
        }
        for (Object o : this.collection) {
            if (!collection.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(MyCollection collection) {
        for (Object o : this.collection) {
            if (collection.contains(o)) {
                this.remove(o);
            }
        }
        for (Object o : this.collection) {
            if (collection.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(MyCollection collection) {
        for (Object o : this.collection) {
            if (!collection.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyCollection{ " +
                "collection " + Arrays.toString(collection) +
                " }";
    }


    @Override
    public Iterator<Object> iterator() {

        return new Iterator<Object>() {
            private int cursor = -1;

            @Override
            public boolean hasNext() {

                return (cursor != collection.length - 1);
            }

            @Override
            public Object next() {
                cursor++;
                return collection[cursor];
            }

            @Override
            public void remove() {
                collection[cursor] = null;
            }
        };
    }
}
