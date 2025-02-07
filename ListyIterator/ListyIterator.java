package ListyIterator;

import java.util.Arrays;
import java.util.List;

public class ListyIterator<T> {
    private List<T> elements;
    private int currentIndex;

    public ListyIterator(T... elements){
        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }

    public boolean move(){
        if(hasNext()){
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext(){
        return currentIndex < elements.size() - 1;
    }

    public void print(){
        if(this.elements.isEmpty()){
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(this.currentIndex));
    }
}
