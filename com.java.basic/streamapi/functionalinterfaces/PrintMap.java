package streamapi.functionalinterfaces;

import java.util.Map;

public interface PrintMap<K,V> {

    void printMap(String message, Map<K,V> map);

}
