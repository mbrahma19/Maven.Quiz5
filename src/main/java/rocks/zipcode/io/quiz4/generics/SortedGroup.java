package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<E extends Comparable> extends Group<E> {
    @Override
    public void insert(E value) {
//        if (super.count() == 0) {
//            super.insert(value);
//        } else {
//            int index = 0;
//            for (int i = 0; i < super.count(); i++) {
//                if(value.compareTo(super.fetch(i)) < 0){
//                    index = i;
//                }
//            }
//            super.insertAtIndex(index,value);
//        }
        //TODO : Complete using bubble sort
        super.insert(value);
        Collections.sort(super.list());
    }

    @Override
    public void delete(E value) {
        super.delete(value);
    }

    public Integer indexOf(E value) {
        for (int i = 0; i < super.count(); i++) {
            if (value.equals(super.fetch(i))) {
                return i;
            }
        }
        return -1;
    }

}
