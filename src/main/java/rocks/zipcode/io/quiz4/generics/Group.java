package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<E> implements GroupInterface<E>{

    private List<E> list;

    public Group(){
        this.list = new ArrayList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(E value) {
        list.add(value);
    }

    public void insertAtIndex(int index, E value){
        list.add(index,value);
    }

    public Boolean has(E value) {
        return list.contains(value);
    }

    public E fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(E value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<E> iterator() {
        return list.iterator();
    }

    public String toString(){
        return list.toString();
    }

    protected List<E> list(){
        return this.list;
    }
}
