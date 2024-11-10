package streamapi.functionalinterfaces;


import java.util.List;

public interface PrintList<T> {
    void printList(String message, List<T> list);
}
