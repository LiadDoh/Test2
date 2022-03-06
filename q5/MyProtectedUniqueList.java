package q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyProtectedUniqueList<T> implements Iterable<T> {

    private List<T> list = new ArrayList<>();
    private String secretWord;

    public MyProtectedUniqueList(String secretWord) {
        this.secretWord = secretWord;
    }

    public void add(T t) {
        if(t == null ||t.equals("")){
            throw new IllegalArgumentException("cannot add null or empty");
        }
        else if (!list.contains(t)) {
            list.add(t);
        }
    }

    public void remove(T t) {
        if(t == null ||t.equals("")){
            throw new IllegalArgumentException("cannot remove null or empty");
        }
        else if (list.contains(t)) {
            list.remove(t);
        }
    }

    public void removeAt(int index) {
        if(index<0||index>list.size()){
            throw new IllegalArgumentException("index out of bound");
        }
        else {
            list.remove(index);
        }
    }

    public void clear(String secretWord) {
        if(secretWord.equals(this.secretWord))
            list.clear();
        else
            throw new IllegalArgumentException("wrong secret word");
    }

    public void sort(String secretWord) {
        if(secretWord.equals(this.secretWord))
            list.sort(null);
        else
            throw new IllegalArgumentException("wrong secret word");
    }

    public int size() {
            return list.size();
    }
    public T get(int index) {
        if(index<0||index>list.size()){
            throw new IllegalArgumentException("index out of bound");
        }
        else {
            return list.get(index);
        }
    }
    public void print() {
        for(Iterator iter = this.iterator(); iter.hasNext();){
            T name = (T) iter.next();
            System.out.println("Name : " + name);
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new MyProtectedUniqueListIterator(this);
    }

    private class MyProtectedUniqueListIterator implements Iterator<T>{
        private MyProtectedUniqueList<T> list ;
        private  int index=0;

        public MyProtectedUniqueListIterator(MyProtectedUniqueList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index<list.size());
        }

        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
